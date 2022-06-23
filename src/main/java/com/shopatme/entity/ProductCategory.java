package com.shopatme.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="product_category")
@Entity
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_category_id")
	private int productCategoryId;
	
	@Column(name="product_category_name")
	private String productCategoryName;

}
