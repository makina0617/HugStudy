package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.CreateForm;
import com.example.demo.service.CreateService;

@Controller
public class CreateController {
	@Autowired
	CreateService createService;
	
	@GetMapping("goodsCreate")
	public String goodsRegister(Model model) {
		model.addAttribute("goodsRequest", new CreateForm());
		   return "goodsCreate";
	}
	
	@PostMapping("goosdCreate/create")
	 public String goodsCreate(@Validated CreateForm createRequest, BindingResult result, Model model) {
	   if (result.hasErrors()) {
	     // 入力チェックエラーの場合
	     List<String> errorList = new ArrayList<String>();
	     for (ObjectError error : result.getAllErrors()) {
	       errorList.add(error.getDefaultMessage());
	     }
	     model.addAttribute("createRequest", new CreateForm());
	     model.addAttribute("validationError", errorList);
	     return "goodsList";
	   }
	   // 科目情報の登録
	   CreateService.create(createRequest);
	   return "redirect:/goodsList";
	 }
}
