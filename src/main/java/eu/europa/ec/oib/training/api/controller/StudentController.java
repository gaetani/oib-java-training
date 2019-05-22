package eu.europa.ec.oib.training.api.controller;

import eu.europa.ec.oib.training.infrastructure.model.Student;
import eu.europa.ec.oib.training.infrastructure.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController extends CrudController<Student, Integer> {

    @Autowired
    private IStudentService studentService;

}
