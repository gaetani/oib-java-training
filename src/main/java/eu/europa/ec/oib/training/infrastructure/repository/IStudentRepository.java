package eu.europa.ec.oib.training.infrastructure.repository;

import eu.europa.ec.oib.training.infrastructure.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<Student, Long>{


}
