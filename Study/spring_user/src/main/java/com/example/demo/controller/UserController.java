package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.example.demo.dto.UserRequest;
//import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.UserEntity;
import com.example.demo.form.UserForm;
import com.example.demo.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {

  /**
   * ユーザー情報 Service
   */
  @Autowired
  UserService userService;

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面のHTML
   */
  @RequestMapping("/user/list")
  public String userList(Model model) {
    List<UserEntity> userlist = userService.searchAll();
    model.addAttribute("userlist", userlist);
    return "user/list";
  }

  /**
   * ユーザー情報詳細画面を表示
   * @param id 表示するユーザーID
   * @param model Model
   * @return ユーザー情報詳細画面
   */
  @GetMapping("/user/{id}")
  public String userDetail(@PathVariable Integer id, Model model) {
    UserEntity user = userService.findById(id);
    model.addAttribute("userData", user);
    return "user/view";
  }
  
  /**
   * 新規登録画面を表示
   * @param  model Model
   * @return  科目情報一覧画面
   */
  @GetMapping("/user/add")
  public String userRegister(Model model) {
      model.addAttribute("userRequest", new UserForm());
      return "user/add";
  }

}