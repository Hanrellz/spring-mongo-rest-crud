package com.hanrellz.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanrellz.api.models.ValueModel;
import com.hanrellz.api.services.ValueService;

@RestController
@RequestMapping(path = "/api/values")
public class ValueController {
	
	@Autowired
	private ValueService valueService;
	
	@GetMapping
	public ResponseEntity<List<ValueModel>> Get() {
		return ResponseEntity.ok(this.valueService.findAll());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ValueModel> Get(@RequestAttribute String id) {
		return ResponseEntity.ok(this.valueService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<ValueModel> Post(@RequestBody ValueModel valueModel) {
		return ResponseEntity.ok(this.valueService.insert(valueModel));
	}
	
	@PutMapping
	public ResponseEntity<ValueModel> Put(@RequestBody ValueModel valueModel){
		return ResponseEntity.ok(this.valueService.update(valueModel));
	}
	 
	@DeleteMapping(path = "{id}")
	public void Delete(@RequestAttribute String id) {
		this.valueService.delete(id);
	}
}
