package com.matheesha.alertrabbitconsumer.repository;

import com.matheesha.alertrabbitconsumer.entity.Alert;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlertRepository extends MongoRepository<Alert, Long> {
}
