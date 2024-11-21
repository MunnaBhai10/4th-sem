package com.example.cafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cafe.entity.Tables;

@Repository
public interface TableRepository extends JpaRepository<Tables, Integer>{
	
	Tables findByTableId(Long id);
}
