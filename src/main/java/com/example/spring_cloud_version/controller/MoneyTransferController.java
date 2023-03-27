package com.example.spring_cloud_version.controller;

import com.example.spring_cloud_version.service.TransferService;
import com.example.spring_cloud_version.web.request.ConfirmOperationRequest;
import com.example.spring_cloud_version.web.request.TransferRequest;
import com.example.spring_cloud_version.web.response.MoneyTransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is a rest controller that accepts requests from the client and passes data to the service.
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MoneyTransferController {
	private final TransferService transferService;

	@Autowired
	public MoneyTransferController(TransferService transferService) {
		this.transferService = transferService;
	}

	@PostMapping("/transfer")
	public MoneyTransferResponse transfer(@RequestBody TransferRequest transferRequest) {
		MoneyTransferResponse response = transferService.transfer(transferRequest);
		return response;
	}

	@PostMapping("/confirmOperation")
	public MoneyTransferResponse confirmOperation(@RequestBody ConfirmOperationRequest operationRequest) {
		MoneyTransferResponse response = transferService.confirmOperation(operationRequest);
		return response;
	}
}
