package com.ischoolbar.programmer.service.common.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.common.PostDao;
import com.ischoolbar.programmer.entity.common.Post;
import com.ischoolbar.programmer.service.common.PostService;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostDao postDao;
	
	public int add(Post post) {
		return postDao.add(post);
	}
	
	public Post selectByPostId(String postId) {
		return postDao.selectByPostId(postId);
	}
	public Post selectByName(String accountName) {
		return postDao.selectByName(accountName);
	}
	public int deleteById(String postId) {
		return postDao.deleteById(postId);
	}
	
	public List<Post> selectAll(){
		return postDao.selectAll();
	}
}
