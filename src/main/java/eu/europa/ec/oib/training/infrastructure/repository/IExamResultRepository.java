package eu.europa.ec.oib.training.infrastructure.repository;

import eu.europa.ec.oib.training.infrastructure.model.Exam;
import eu.europa.ec.oib.training.infrastructure.model.ExamResult;
import org.springframework.data.repository.CrudRepository;

public interface IExamResultRepository extends CrudRepository<ExamResult, Integer>{


}
