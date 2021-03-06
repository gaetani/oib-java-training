package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Classroom;
import eu.europa.ec.oib.training.infrastructure.model.Student;
import eu.europa.ec.oib.training.infrastructure.repository.IClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends AbstractService<Student, Integer> implements IStudentService {

    @Autowired
    private IStudentService repository;

}
