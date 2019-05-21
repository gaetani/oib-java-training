package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Student;

public interface IStudentService {
    Iterable<Student> findAll();

}
