package eu.europa.ec.oib.training.infrastructure.repository;

import eu.europa.ec.oib.training.infrastructure.model.Student;
import eu.europa.ec.oib.training.infrastructure.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface ITeacherRepository extends CrudRepository<Teacher, Integer>{


}
