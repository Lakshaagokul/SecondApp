package com.tech.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.bank.entity.Bank;
import com.tech.bank.service.BankService;

@RestController
@RequestMapping(value = "/bank")
public class BankController {

	@Autowired
	BankService bankser;

	@PostMapping(value = "/insertList")
	public String addBankList(@RequestBody List<Bank> b) {
		return bankser.addBankList(b);
	}

	@GetMapping(value = "/getList")
	public List<Bank> getBankList() {
		return bankser.getBankList();
	}

	@PutMapping(value = "/update")
	public String updateBank(@RequestBody Bank b) {
		return bankser.updateBank(b);
	}

	@DeleteMapping(value = "/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		return bankser.deleteById(id);
	}

	@GetMapping(value = "/getBranchByIfsc/{ifsc}")
	public String getBranchByIfsc(String ifsc) {
		return bankser.getBranchByIfsc(ifsc);
	}
}
