package eu.europa.ec.oib.training.controller;

import eu.europa.ec.oib.training.model.Student;
import eu.europa.ec.oib.training.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping
    public Iterable<Student> findAll(){
        return studentService.findAll();
    }
}
