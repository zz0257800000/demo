package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;

@SpringBootTest
class AtmServiceTest {
	
	@Autowired
	private AtmService atmService;
	
	@Test
	public void addInfoTest() {
		AtmResponse res = atmService.addInfo("A05","AA123");

		System.out.println("���o�N�X :"+ res.getRtnCode().getCode());
		System.out.println("���o���A :"+ res.getRtnCode().getMessage());
		System.out.println("ATM�b�� :"+ res.getAtm().getAccount());
		System.out.println("�[�K�K�X :"+ res.getAtm().getPwd());
		System.out.println("�b��l�B	:"+ res.getAtm().getBalance());
	}
	//��?

	@Test
	public void  getBalanceByAccountTest() {
		
	}
	
	//��?
	@Test
	public void  updatePwdTest() {
		AtmResponse res = atmService.addInfo("A06","AA123");
		System.out.println("���o�N�X :"+ res.getRtnCode().getCode());
		System.out.println("���o���A :"+ res.getRtnCode().getMessage());
		System.out.println("ATM�b�� :"+ res.getAtm().getAccount());
		System.out.println("�[�K�K�X :"+ res.getAtm().getPwd());
		System.out.println("�b��l�B	:"+ res.getAtm().getBalance());
	}
	@Test
	public void  depositTest() {
		AtmResponse res = atmService.deposit("A03","AA123", 8000);
		System.out.println("���o�N�X :"+ res.getRtnCode().getCode());

		System.out.println("���o���A :"+ res.getRtnCode().getMessage());
		System.out.println("ATM�b�� :"+ res.getAtm().getAccount());

		System.out.println("�b��l�B	:"+ res.getAtm().getBalance());

	}
	@Test
	public void  withdrawTest() {
		AtmResponse res = atmService.withdraw("A03","AA123", 4444);
		System.out.println("���o�N�X :"+ res.getRtnCode().getCode());

		System.out.println("���o���A :"+ res.getRtnCode().getMessage());
		System.out.println("ATM�b�� :"+ res.getAtm().getAccount());

		System.out.println("�b��l�B	:"+ res.getAtm().getBalance());
		
	}
}
