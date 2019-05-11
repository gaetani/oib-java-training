package eu.europa.ec.oib.training.service;

import eu.europa.ec.oib.training.model.Student;
import eu.europa.ec.oib.training.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository repository;

    public Iterable<Student> findAll(){
        return repository.findAll();
    }
}
