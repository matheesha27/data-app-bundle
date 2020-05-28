package com.matheesha.alertrabbitconsumer.repository;

import com.matheesha.alertrabbitconsumer.entity.DataPacket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataPacketRepository extends MongoRepository<DataPacket, Long> {
}
