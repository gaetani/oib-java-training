package eu.europa.ec.oib.training.infrastructure.repository;

import eu.europa.ec.oib.training.infrastructure.model.Exam;
import eu.europa.ec.oib.training.infrastructure.model.Grade;
import org.springframework.data.repository.CrudRepository;

public interface IGradeRepository extends CrudRepository<Grade, Integer>{


}
