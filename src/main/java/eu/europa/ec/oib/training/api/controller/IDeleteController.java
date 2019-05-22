package eu.europa.ec.oib.training.api.controller;

import eu.europa.ec.oib.training.infrastructure.model.Idable;
import org.springframework.web.bind.annotation.PostMapping;

public interface IDeleteController<T extends Idable<ID>, ID>  extends IAbstractController<T, ID> {

    @PostMapping("delete")
    default void delete(ID id){
        service().delete(id);
    }
}
