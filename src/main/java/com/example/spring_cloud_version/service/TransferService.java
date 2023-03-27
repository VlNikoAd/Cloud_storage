package com.example.spring_cloud_version.service;

import com.example.spring_cloud_version.web.request.ConfirmOperationRequest;
import com.example.spring_cloud_version.web.request.TransferRequest;
import com.example.spring_cloud_version.web.response.MoneyTransferResponse;
import org.springframework.stereotype.Service;

@Service
public interface TransferService {

	MoneyTransferResponse transfer(TransferRequest transferRequest);

	MoneyTransferResponse confirmOperation(ConfirmOperationRequest operationRequest);
}
