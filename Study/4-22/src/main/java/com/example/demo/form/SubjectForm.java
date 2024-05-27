package com.example.demo.form;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

/**
* 科目情報 リクエストデータ
*/
@Data
public class SubjectForm implements Serializable{
 /**
  * ID
  */
 private Integer id;
  /**
  * 名前
  */
 @NotEmpty(message = "名前を入力してください")
 @Size(max = 50, message = "名前は50文字以内で入力してください")
 private String name;
 
 /**
  * 住所
  */
 @NotEmpty(message = "住所を入力してください")
 @Size(max = 100, message = "住所は100桁以内で入力してください")
 private String address;
 /**
  * 電話番号
  */
 @Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式(半角,ハイフン入力)で入力してください")
 private String phone;

 /**
  * 参拝時間
  */
 @NotEmpty(message = "参拝時間を入力してください")
 @Size(max = 20, message = "参拝時間は20桁以内で入力してください")
 private String Visitingtime;
}