package com.matheesha.alertretrieve.repository;

import com.matheesha.alertretrieve.entity.Alert;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface AlertRetrieveRepository extends MongoRepository<Alert, Long> {

    // Gives the entry of the specified ID
    List<Alert> findById(long id);

    // Gives entries between the specified voltage range
    @Query(value = "{'voltage': {$gte:?0, $lte:?1}}")
    List<Alert> getVoltageInRange(double minVoltage, double maxVoltage);

    // Gives entries in the specified category type
    @Query(value = "{category: 'Category ?0'}")
    List<Alert> getCategory(int categoryType);

    @Query(value = "{'updatedDate': {$gte: ISODate('?0'),$lte: ISODate('?1')}}")
    List<Alert> getByDateRange(String startDate, String endDate);

    // Gives entries between the specified date range
    // {'updatedDate': {$gte: ISODate('?0'),$lte: ISODate('?1')}}
    List<Alert> findByUpdatedDateBetween(Date from, Date to);
}
