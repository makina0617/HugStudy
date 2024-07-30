package com.example.demo.form;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UpdateForm implements Serializable{
// 商品ID
 @NotNull(message = "商品IDを入力してください")
 private Integer id;

// 商品名 
 @NotNull(message = "商品名を入力してください")
  private String name;
 
// 商品カラー 
 @NotNull(message = "カラーを選択してください")
 private String color;
 
// 在庫L
 private Integer size_l;
 
// 在庫M
 private Integer size_m;
 
// 入荷日 
 @NotNull(message = "入荷日を選択してください")
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 private LocalDate create_date;
}