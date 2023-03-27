package com.example.spring_cloud_version.web.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConfirmOperationRequest {

	String operationId;
	String code;
}
