package com.example.spring_cloud_version.repository;

import com.example.spring_cloud_version.model.Card;
import com.example.spring_cloud_version.web.request.TransferRequest;

public interface TransferRepository {

	void saveTransfer(String operationId, TransferRequest request);

	TransferRequest getTransferRequest(String operationId);

	int getId();

	void saveCode(String operationId, String confirmationCode);

	String getCode(String operationId);


	void saveCard(Card currentCardFrom , Card currentCardTo);

	Card getCard(String cardNumber);
}
