package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Classroom;
import eu.europa.ec.oib.training.infrastructure.model.Student;
import eu.europa.ec.oib.training.infrastructure.repository.IClassroomRepository;
import eu.europa.ec.oib.training.infrastructure.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService extends AbstractService<Classroom, Integer> implements IClassroomService {

    @Autowired
    private IClassroomRepository repository;

}
