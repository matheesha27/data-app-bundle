package com.matheesha.alertretrieve.repository;

import com.matheesha.alertretrieve.entity.DataPacket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface DataPacketRepository extends MongoRepository<DataPacket, Long> {

    @Query(value = "{'date': {$gte: ISODate('2020-05-01'),$lte: ISODate('2020-05-05')}, 'evtParam': {$elemMatch: {name: \"monthEngKwh\", value: {$gt:250}}}}")
    List<DataPacket> getTotalEnergy();

    @Query(value = "{evtParam: {$elemMatch: {name: \"monthEngKwh\", value: {$gt:?0}}}}")
    List<DataPacket> getMonthlyEnergy(long floor);

}
