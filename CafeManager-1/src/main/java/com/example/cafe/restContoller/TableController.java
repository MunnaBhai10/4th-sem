package com.example.cafe.restContoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cafe.entity.Tables;
import com.example.cafe.services.TableService;

@RestController("/")
public class TableController {
	
	@Autowired
	private TableService tableService;
	
	@PostMapping("/addNewTable")
	public ResponseEntity<Tables> addNewTable(@RequestBody Tables table){
		Tables newTable= tableService.addNewTable(table);
		
		if(newTable!=null) {
			return new ResponseEntity<>(newTable, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
