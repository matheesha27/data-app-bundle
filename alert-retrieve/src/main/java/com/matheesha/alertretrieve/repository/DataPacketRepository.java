package com.matheesha.alertretrieve.repository;

import com.matheesha.alertretrieve.entity.DataPacket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface DataPacketRepository extends MongoRepository<DataPacket, Long> {

    //@Query(value = "")
    //List<DataPacket> getTotalEnergy();
}
