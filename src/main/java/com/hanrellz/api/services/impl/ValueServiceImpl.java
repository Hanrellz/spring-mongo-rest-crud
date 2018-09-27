package com.hanrellz.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanrellz.api.models.ValueModel;
import com.hanrellz.api.repositories.ValueRepository;
import com.hanrellz.api.services.ValueService;

@Service
public class ValueServiceImpl implements ValueService {

	
	@Autowired
	private ValueRepository valueRepository;
	
	public ValueServiceImpl() {
	
	}
	
	@Override
	public List<ValueModel> findAll() {
		return this.valueRepository.findAll();
	}

	@Override
	public ValueModel findById(String id) {
		return this.valueRepository.findById(id).get();
	}

	@Override
	public ValueModel insert(ValueModel valueModel) {
		return this.insert(valueModel);
	}

	@Override
	public ValueModel update(ValueModel valueModel) {
		return this.update(valueModel);
	}

	@Override
	public void delete(String id) {
		this.delete(id);
	}

}
