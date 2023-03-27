package com.example.spring_cloud_version.exception;

public class ErrorInputDataException extends RuntimeException{
	public ErrorInputDataException (String message) {
		super(message);
	}
}
