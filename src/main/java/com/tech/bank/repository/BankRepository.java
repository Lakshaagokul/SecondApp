package com.tech.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tech.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value = "SELECT branch FROM bank WHERE ifsc=?", nativeQuery = true)
	public String getBranchByIfsc(String ifsc);
}
