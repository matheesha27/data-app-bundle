package com.matheesha.alertrabbitconsumer.repository;

import com.matheesha.alertrabbitconsumer.entity.MeterData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MeterDataRepository extends MongoRepository<MeterData, Long> {
}
