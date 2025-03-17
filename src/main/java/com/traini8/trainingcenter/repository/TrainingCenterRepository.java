package com.traini8.trainingcenter.repository;

import com.traini8.trainingcenter.model.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {
}
