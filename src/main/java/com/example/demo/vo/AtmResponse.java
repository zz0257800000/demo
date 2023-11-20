package com.example.demo.vo;

import com.example.demo.constants.RtnCode;
import com.example.demo.entity.Atm;

public class AtmResponse {

	private RtnCode rtnCode;
	
	private Atm atm;

	public AtmResponse() {
		super();
	} 
	
	public AtmResponse( Atm atm,RtnCode rtnCode) {
		super();
		this.rtnCode = rtnCode;
		this.atm = atm;
	}
	public RtnCode getRtnCode() {
		return rtnCode;
	}
	public void setRtnCode(RtnCode rtnCode) {
		this.rtnCode = rtnCode;
	}
	public Atm getAtm() {
		return atm;
	}
	public void setAtm(Atm atm) {
		this.atm = atm;
	}
	
	
	
}
