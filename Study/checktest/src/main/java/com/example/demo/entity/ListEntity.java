package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "goods_tb")
public class ListEntity {
	
//	商品ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
//	商品名
	@Column(name = "name")
	private String name;
	
//	カラー
	@Column(name = "color")
	private String color;
	
//	サイス(L)在庫
	@Column(name = "size_l")
	private Integer size_l;
	
//	サイズ(M)在庫
	@Column(name = "size_m")
	private Integer size_m;
	
//	入荷日
	@Column(name = "create_date")
	private LocalDate create_date;
}