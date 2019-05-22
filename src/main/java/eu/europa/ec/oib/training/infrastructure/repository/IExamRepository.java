package eu.europa.ec.oib.training.infrastructure.repository;

import eu.europa.ec.oib.training.infrastructure.model.Course;
import eu.europa.ec.oib.training.infrastructure.model.Exam;
import org.springframework.data.repository.CrudRepository;

public interface IExamRepository extends CrudRepository<Exam, Integer>{


}
