package com.matheesha.alertretrieve.repository;

import com.matheesha.alertretrieve.entity.DataPacket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface DataPacketRepository extends MongoRepository<DataPacket, Long> {

    @Query(value = "{'date': {$gte: ?0,$lte: ?1}}")
    List<DataPacket> getAllByDate(long beginDate, long endDate);

    @Query(value = "{'date': {$gte: ?0,$lte: ?1}, 'evtParam': {$elemMatch: {name: \"monthEngKwh\", value: {$gte: ?2}}}}")
    List<DataPacket> getTotalEnergy(long beginDate, long endDate, long floor);

    @Query(value = "{evtParam: {$elemMatch: {name: \"monthEngKwh\", value: {$gt:?0}}}}")
    List<DataPacket> getMonthlyEnergy(long floor);

}
