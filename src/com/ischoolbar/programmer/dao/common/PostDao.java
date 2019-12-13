package com.ischoolbar.programmer.dao.common;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.Post;

@Repository
public interface PostDao {
	
	public int add(Post post);
	
	public Post selectByPostId(String postId);
	
	public Post selectByName(String accountName);
	
	public int deleteById(String postId);
	
	public List<Post> selectAll();
}
