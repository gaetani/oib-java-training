package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Classroom;
import eu.europa.ec.oib.training.infrastructure.model.Teacher;
import eu.europa.ec.oib.training.infrastructure.repository.IClassroomRepository;
import eu.europa.ec.oib.training.infrastructure.repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends AbstractService<Teacher, Integer> implements ITeacherService {

    @Autowired
    private ITeacherRepository repository;

}
