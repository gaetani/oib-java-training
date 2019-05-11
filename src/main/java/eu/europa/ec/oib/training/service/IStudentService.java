package eu.europa.ec.oib.training.service;

import eu.europa.ec.oib.training.model.Student;

public interface IStudentService {
    Iterable<Student> findAll();

}
