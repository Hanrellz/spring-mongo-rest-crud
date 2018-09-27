package com.hanrellz.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hanrellz.api.models.ValueModel;

@Repository
public interface ValueRepository extends MongoRepository<ValueModel, String> {

}
