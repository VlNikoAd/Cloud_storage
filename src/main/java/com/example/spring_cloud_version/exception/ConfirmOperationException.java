package com.example.spring_cloud_version.exception;

public class ConfirmOperationException extends RuntimeException{

	public ConfirmOperationException(String message) {
		super(message);
	}
}
