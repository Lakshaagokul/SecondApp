package com.tech.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.bank.entity.Bank;
import com.tech.bank.repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bankrepo;

	public String addBankList(List<Bank> b) {
		bankrepo.saveAll(b);
		return "List Added Successfully";
	}

	public List<Bank> getBankList() {
		return bankrepo.findAll();
	}

	public String updateBank(Bank b) {
		bankrepo.save(b);
		return "Updated Successfully";
	}

	public String deleteById(int id) {
		bankrepo.deleteById(id);
		return "Deleted Successfully";
	}

	public String getBranchByIfsc(String ifsc) {
		return bankrepo.getBranchByIfsc(ifsc);
	}
}
