package com.shopatme.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@OneToMany(fetch=FetchType.EAGER,mappedBy="productCategory")
	private List<Product> products;
}
