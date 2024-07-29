package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.ListEntity;
import com.example.demo.service.ListService;

@Controller
public class ListController {
	
	@Autowired
	ListService listService;
	
//	商品登録画面の表示
	@GetMapping("goodsList")
	 public String goodsList(Model model) {
		List<ListEntity> goodslist = listService.searchAll();
		model.addAttribute("goodslist", goodslist);
		return "goodsList";
	 }
}
