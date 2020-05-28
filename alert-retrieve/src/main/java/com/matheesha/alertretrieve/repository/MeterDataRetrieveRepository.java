package com.matheesha.alertretrieve.repository;

import com.matheesha.alertretrieve.entity.MeterData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MeterDataRetrieveRepository extends MongoRepository<MeterData, Long> {
}
