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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UpdateEntity;
import com.example.demo.form.UpdateForm;
import com.example.demo.service.UpdateService;

@Controller
public class UpdateController {
	@Autowired
	UpdateService updateService;
	
	@GetMapping("/goodsUpdate/{id}")
	public String UpdateDisplay(@PathVariable Integer id, Model model) {
		UpdateEntity update = updateService.findById(id);
		UpdateForm updateUpdateRequest = new UpdateForm();
		updateUpdateRequest.setId(update.getId());
		updateUpdateRequest.setName(update.getName());
		updateUpdateRequest.setColor(update.getColor());
		updateUpdateRequest.setSize_l(update.getSize_l());
		updateUpdateRequest.setSize_m(update.getSize_m());
		updateUpdateRequest.setCreate_date(update.getCreate_date());
		model.addAttribute("updateRequest",updateUpdateRequest);
		   return "goodsUpdate";
	}
	@PostMapping("/goodsUpdate")
	 public String goodsUpdate(@Validated @ModelAttribute UpdateForm updateRequest, BindingResult result, Model model) {
	   if (result.hasErrors()) {
	     // 入力チェックエラーの場合
	     List<String> errorList = new ArrayList<String>();
	     for (ObjectError error : result.getAllErrors()) {
	       errorList.add(error.getDefaultMessage());
	     }
	     model.addAttribute("validationError", errorList);
	     return "goodsUpdate";
	   }
	     
	  // 科目情報の登録
		   updateService.update(updateRequest);
		   return String.format("redirect:/goodsList/%d",updateRequest.getId());
		}
}
