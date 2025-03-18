package com.project.pharmacy.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

	private int status;
	private String message;
	private String path;
	private String method;
	private LocalDateTime timestamp;
	private String exception;

	public ErrorResponse() {
		super();
	}

	public ErrorResponse(int status, String message, String path, String method, LocalDateTime timestamp, String exception) {
		this.status = status;
		this.message = message;
		this.path = path;
		this.method = method;
		this.timestamp = timestamp;
		this.exception = exception;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}


}
