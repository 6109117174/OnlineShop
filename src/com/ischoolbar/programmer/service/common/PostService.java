package com.ischoolbar.programmer.service.common;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ischoolbar.programmer.entity.common.Post;

@Service
public interface PostService {
	
	public int add(Post post);
	
	public Post selectByPostId(String postId);
	public Post selectByName(String accountName);
	public int deleteById(String postId);
	
	public List<Post> selectAll();
}
