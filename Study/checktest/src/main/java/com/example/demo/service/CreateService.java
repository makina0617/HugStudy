package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CreateEntity;
import com.example.demo.form.CreateForm;
import com.example.demo.repository.CreateRepository;

@Service
public class CreateService {
	
	@Autowired
	 private CreateRepository createRepository;
	
	 public void create(CreateForm createRequest) {
	     CreateEntity goods = new CreateEntity();
	     goods.setId(createRequest.getId());
	     goods.setName(createRequest.getName());
	     goods.setColor(createRequest.getColor());
	     goods.setSize_l(createRequest.getSize_l());
	     goods.setSize_m(createRequest.getSize_m());
	     goods.setCreate_date(createRequest.getCreate_date());
	     createRepository.save(goods);
	 }
	     
}