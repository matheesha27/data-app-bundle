package com.matheesha.alertretrieve.repository;

import com.matheesha.alertretrieve.entity.Alert;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface AlertRetrieveRepository extends MongoRepository<Alert, Long> {

    List<Alert> findById(long id);

    @Query(value = "{'voltage': {$gte:?0, $lte:?1}}")
    List<Alert> getVoltageInRange(double minVoltage, double maxVoltage);

    @Query(value = "{category: 'Category ?0'}")
    List<Alert> getCategory(int categoryType);

    @Query(value = "{'updatedDate': {$gte: ISODate('?0'),$lte: ISODate('?1')}}")
    List<Alert> getByDateRange(String startDate, String endDate);

    // @Query(value = "{'updatedDate': {$gte: ISODate('?0'),$lte: ISODate('?1')}}")
    List<Alert> findByUpdatedDateBetween(Date from, Date to);
}
