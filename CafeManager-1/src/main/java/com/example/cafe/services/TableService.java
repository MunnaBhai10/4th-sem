package com.example.cafe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cafe.entity.Tables;
import com.example.cafe.repository.TableRepository;

@Service
public class TableService {
	
	@Autowired 
	private TableRepository tableRepository;

	// add new table
	public Tables addNewTable(Tables table) {
		Tables newTable= new Tables();
		newTable.setTableName(table.getTableName());
		
		return tableRepository.save(newTable);
	}

}
