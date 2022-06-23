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
@Table(name = "user_payment")
@Entity
public class UserPayment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_payment_id")
	private int userPaymentId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="payment_type")
	private String paymentType;

}
