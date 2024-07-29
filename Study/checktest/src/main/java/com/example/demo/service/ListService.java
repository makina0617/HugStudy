package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ListEntity;
import com.example.demo.repository.ListRepository;

@Service
public class ListService {
	
	@Autowired
	private ListRepository listRepository;
	
	public List<ListEntity>searchAll(){
		return listRepository.findAll();
	}
}