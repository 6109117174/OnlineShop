package com.ischoolbar.programmer.controller.home;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.common.Account;
import com.ischoolbar.programmer.entity.common.Post;
import com.ischoolbar.programmer.entity.common.Shop;
import com.ischoolbar.programmer.service.common.AccountService;
import com.ischoolbar.programmer.service.common.PostService;
import com.ischoolbar.programmer.service.common.ProductCategoryService;
import com.ischoolbar.programmer.service.common.ProductService;
import com.ischoolbar.programmer.service.common.ShopService;
import com.ischoolbar.programmer.util.MenuUtil;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression.DateTime;

/**
 * 前台首页控制器
 * @author Administrator
 *
 */
@RequestMapping("/home")
@Controller
public class IndexController {
	
	@Autowired
	private PostService postService;
	@Autowired
	private ShopService shopService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private ProductCategoryService productCategoryService;
	@Autowired
	private ProductService productService;
	/**
	 * 前台首页页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public ModelAndView index(ModelAndView model){
		model.addObject("productCategoryList", MenuUtil.getTreeCategory(productCategoryService.findList(new HashMap<String, Object>())));
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("offset", 0);
		queryMap.put("pageSize", 5);
		queryMap.put("orderBy", "createTime");
		queryMap.put("sort", "desc");
		model.addObject("lastProductList", productService.findList(queryMap));
		queryMap.put("orderBy", "sellNum");
		model.addObject("sellProductList", productService.findList(queryMap));
		model.addObject("allCategoryClass","shop_hd_menu_hover");
		model.addObject("currentHome", "current_");
		model.setViewName("home/index/index");
		return model;
	}
	
	/**
	 * 用户登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView login(ModelAndView model){
		model.addObject("title", "用户登录");
		model.setViewName("home/index/login");
		return model;
	}
	
	/**
	 * 用户注册页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public ModelAndView register(ModelAndView model){
		model.addObject("title", "用户注册");
		model.setViewName("home/index/register");
		return model;
	}
	/**
	 * 申请开店页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register2",method = RequestMethod.GET)
	public ModelAndView register2(ModelAndView model){
		model.addObject("title", "申请开店");
		model.setViewName("home/index/register2");
		return model;
	}
	/**
	 * 提交注册信息
	 * @param account
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> register(Account account,String code,HttpServletRequest request){
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("type", "error");
		if(account == null){
			ret.put("msg", "请填写正确的用户信息");
			return ret;
		}
		if(StringUtils.isEmpty(account.getName())){
			ret.put("msg", "请填写用户名");
			return ret;
		}
		if(StringUtils.isEmpty(account.getPassword())){
			ret.put("msg", "请填写密码");
			return ret;
		}
		if(StringUtils.isEmpty(account.getEmail())){
			ret.put("msg", "请填写邮箱");
			return ret;
		}
		if(StringUtils.isEmpty(code)){
			ret.put("msg", "请填写验证码");
			return ret;
		}
		Object codeObject = request.getSession().getAttribute("userRegisterCpacha");
		if(codeObject == null){
			ret.put("msg", "验证码已过期，请刷新页面后重试!");
			return ret;
		}
		if(!code.equalsIgnoreCase((String)codeObject)){
			ret.put("msg", "验证码错误!");
			return ret;
		}
		Account findByName = accountService.findByName(account.getName());
		if(findByName != null){
			ret.put("msg", "该用户名已存在!");
			return ret;
		}
		account.setStatus(1);
		account.setCreateTime(new Date());
		if(accountService.add(account) <= 0){
			ret.put("msg", "注册失败，请联系管理员!");
			return ret;
		}
		ret.put("type", "success");
		return ret;
	}
	
	//商家注册
	@RequestMapping(value = "/register2",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> register2(Shop shop,String code,HttpServletRequest request){
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("type", "error");
		if(shop == null){
			ret.put("msg", "请填写正确的用户信息");
			return ret;
		}
		if(StringUtils.isEmpty(shop.getShopname())){
			ret.put("msg", "请填写商铺名");
			return ret;
		}
		if(StringUtils.isEmpty(shop.getPassword())){
			ret.put("msg", "请填写密码");
			return ret;
		}
		if(StringUtils.isEmpty(shop.getEmail())){
			ret.put("msg", "请填写邮箱");
			return ret;
		}
		if(StringUtils.isEmpty(shop.getAddress())){
			ret.put("msg", "请填写店铺地址");
			return ret;
		}
		if(StringUtils.isEmpty(code)){
			ret.put("msg", "请填写验证码");
			return ret;
		}
		Object codeObject = request.getSession().getAttribute("userRegisterCpacha");
		if(codeObject == null){
			ret.put("msg", "验证码已过期，请刷新页面后重试!");
			return ret;
		}
		if(!code.equalsIgnoreCase((String)codeObject)){
			ret.put("msg", "验证码错误!");
			return ret;
		}
		Account findByName = accountService.findByName(shop.getShopname());
		if(findByName != null){
			ret.put("msg", "该用户名已存在!");
			return ret;
		}
		shop.setApplytime(new Date());
		shop.setRoleId("3");
		shop.setIfable("0");	
		if(shopService.add(shop) <= 0){
			ret.put("msg", "注册失败，请联系管理员!");
			return ret;
		}
		Shop shop2=shopService.findByName(shop.getShopname());
		shopService.insertShop(shop2);
		ret.put("type", "success");
		return ret;
	}
	/**
	 * 提交注册信息
	 * @param account
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> login(Account account,String code,HttpServletRequest request){
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("type", "error");
		if(account == null){
			ret.put("msg", "请填写正确的用户信息");
			return ret;
		}
		if(StringUtils.isEmpty(account.getName())){
			ret.put("msg", "请填写用户名");
			return ret;
		}
		if(StringUtils.isEmpty(account.getPassword())){
			ret.put("msg", "请填写密码");
			return ret;
		}
		if(StringUtils.isEmpty(code)){
			ret.put("msg", "请填写验证码");
			return ret;
		}
		Object codeObject = request.getSession().getAttribute("userLoginCpacha");
		if(codeObject == null){
			ret.put("msg", "验证码已过期，请刷新页面后重试!");
			return ret;
		}
		if(!code.equalsIgnoreCase((String)codeObject)){
			ret.put("msg", "验证码错误!");
			return ret;
		}
		Account findByName = accountService.findByName(account.getName());
		
		if(findByName == null){
			ret.put("msg", "该用户名不存在!");
			return ret;
		}
		if(!account.getPassword().equals(findByName.getPassword())){
			ret.put("msg", "密码错误!");
			return ret;
		}
		if(findByName.getStatus() == 0){
			ret.put("msg", "该用户已被冻结，请联系管理员!");
			return ret;
		}

		request.getSession().setAttribute("name", findByName.getName());
		request.getSession().setAttribute("userLoginCpacha", null);
		request.getSession().setAttribute("account", findByName);
		ret.put("type", "success");
		return ret;
	}
	
		/**
		 * 发表帖子
		 * @param Hava a write
		 * @return
		 */
		@RequestMapping(value = "/write",method = RequestMethod.GET)
		public String write() {
			return "/home/index/write";
		}
		
		/* 查看帖子
		 * @param look a write
		 * @return
		 */
		@RequestMapping(value = "/show",method = RequestMethod.GET)
		public String show() {
			return "/home/index/show";
		}
		
		@RequestMapping(value = "/write",method = RequestMethod.POST)
		@ResponseBody
		public Map<String, String> write(@RequestBody Post post,HttpServletRequest request){
			System.out.println("sdkjsakd");
			Map<String, String> ret = new HashMap<String, String>();
			ret.put("type", "error");
			if(post == null){
				ret.put("msg", "请填写内容");
				return ret;
			}
			if(StringUtils.isEmpty(post.getContent())){
				ret.put("msg", "请填写内容");
				return ret;
			}
			post.setAccountName((String)request.getSession().getAttribute("name"));
			Date date=new Date();
			post.setPostId(String.valueOf(date.getTime()));
			post.setWriteTime(date);
			if(postService.add(post) <= 0){
				ret.put("msg", "发布失败，请联系管理员!");
				return ret;
			}
			ret.put("type", "success");
			return ret;
		}
		
		@RequestMapping(value = "/show",method = RequestMethod.POST)
		@ResponseBody
		public List<Post> show(HttpServletRequest request){
			Map<String, String> ret = new HashMap<String, String>();
			List<Post> list= postService.selectAll();
//			if(list.size()==0){
//				ret.put("msg", "没有帖子");
//				return ret;
//			}
//			ret.put("list", "list");
//			ret.put("type", "success");
//			return ret;
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(0).getContent());
			return list;
		}
}
