package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Classroom;
import eu.europa.ec.oib.training.infrastructure.model.Grade;
import eu.europa.ec.oib.training.infrastructure.repository.IClassroomRepository;
import eu.europa.ec.oib.training.infrastructure.repository.IGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService extends AbstractService<Grade, Integer> implements IGradeService {

    @Autowired
    private IGradeRepository repository;

}
