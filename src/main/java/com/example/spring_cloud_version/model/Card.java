package com.example.spring_cloud_version.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {

	private String cardNumber;
	private String cardValidTill;
	private String cardCVV;
	private Amount balanceCard;
}
