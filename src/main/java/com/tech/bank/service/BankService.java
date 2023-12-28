package com.tech.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.bank.dao.BankDao;
import com.tech.bank.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bankdao;

	public String addBankList(List<Bank> p) {
		return bankdao.addBankList(p);
	}

	public List<Bank> getBankList() {
		return bankdao.getBankList();
	}

	public String updateBank(Bank b) {
		return bankdao.updateBank(b);
	}

	public String deleteById(int id) {
		return bankdao.deleteById(id);
	}
	public String getBranchByIfsc(String ifsc) {
		return bankdao.getBranchByIfsc(ifsc);
	}
}
