package com.project.pharmacy.exception;

public class DataNotFoundException extends RuntimeException  {

	private static final long serialVersionUID = 1L;
	
	public String msg;
	
	public DataNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
