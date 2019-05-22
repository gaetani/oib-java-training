package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Classroom;
import eu.europa.ec.oib.training.infrastructure.model.Exam;
import eu.europa.ec.oib.training.infrastructure.repository.IClassroomRepository;
import eu.europa.ec.oib.training.infrastructure.repository.IExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService extends AbstractService<Exam, Integer> implements IExamService {

    @Autowired
    private IExamRepository repository;

}
