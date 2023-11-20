package com.example.demo.constants;

public enum RtnCode {
	  //5�}�Y�q�A��
	SUCCESSFUL(200, "Ok!"),// ���\��200 
	PARAM_ERROR(400,"Param_error!"),//401 403 �����v�� 404���~
	ACCOUNT_EXISTED(400,"Account existed!"), //�b���s�b
	ACCOUNT_NOT_FOUND(404,"Account not found!"),
	INSUFFICIENT_BALANCE(400,"Insufficient balance!"),

	
	;
	
	private int code;

	private String message;    

	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
