package com.blog.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.dao.AuthorDAO;
import com.blog.entity.Author;

@Service("authorService") 
public class AuthorServiceImpl implements AuthorService{

	@Resource
	AuthorDAO authorDAO;
	@Override
	public Author getAuthorById(String authorId) {
		// TODO Auto-generated method stub
		return authorDAO.getAuthor(authorId);
	}

}
