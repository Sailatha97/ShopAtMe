package com.shopatme.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_address")
@Getter
@Setter
public class UserAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_address_id")
	private int userAddressId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "mobile")
	private String mobile;

}
