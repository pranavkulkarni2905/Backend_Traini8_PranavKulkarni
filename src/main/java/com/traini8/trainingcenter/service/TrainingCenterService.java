package com.traini8.trainingcenter.service;

import com.traini8.trainingcenter.model.TrainingCenter;
import com.traini8.trainingcenter.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(Instant.now().getEpochSecond());
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}
