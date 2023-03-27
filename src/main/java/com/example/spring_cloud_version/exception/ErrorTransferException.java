package com.example.spring_cloud_version.exception;

public class ErrorTransferException extends RuntimeException{
	public ErrorTransferException(String message) {
		super(message);
	}
}
