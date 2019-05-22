package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Classroom;
import eu.europa.ec.oib.training.infrastructure.model.Course;
import eu.europa.ec.oib.training.infrastructure.repository.IClassroomRepository;
import eu.europa.ec.oib.training.infrastructure.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService extends AbstractService<Course, Integer> implements ICourseService {

    @Autowired
    private ICourseRepository repository;

}
