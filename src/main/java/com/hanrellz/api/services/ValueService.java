package com.hanrellz.api.services;

import java.util.List;

import com.hanrellz.api.models.ValueModel;

public interface ValueService {

	List<ValueModel> findAll();
	
	ValueModel findById(String id);
	
	ValueModel insert(ValueModel valueModel);
	
	ValueModel update(ValueModel valueModel);
	
	void delete(String id);
	
}
