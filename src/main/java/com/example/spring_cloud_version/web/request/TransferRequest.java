package com.example.spring_cloud_version.web.request;

import com.example.spring_cloud_version.model.Amount;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransferRequest {

	private String cardFromNumber;

	private String cardFromValidTill;

	private String cardFromCVV;

	private String cardToNumber;

	private Amount amount;
}
