package eu.europa.ec.oib.training.repository;

import eu.europa.ec.oib.training.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<Student, Long>{


}
