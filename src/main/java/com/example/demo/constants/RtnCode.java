package com.example.demo.constants;

public enum RtnCode {
	  //5開頭司服器
	SUCCESSFUL(200, "Ok!"),// 成功打200 
	PARAM_ERROR(400,"Param_error!"),//401 403 有關權限 404錯誤
	ACCOUNT_EXISTED(400,"Account existed!"), //帳號存在
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
