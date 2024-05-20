package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.TestEntity;
import com.example.demo.service.TestService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class TestController {

  /**
   * ユーザー情報 Service
   */
  @Autowired
  TestService testService;

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面のHTML
   */
  @RequestMapping("/test/list")
  public String testList(Model model) {
    List<TestEntity> testlist = testService.searchAll();
    model.addAttribute("testlist", testlist);
    return "test/list";
  }
}