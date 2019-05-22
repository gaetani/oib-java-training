package eu.europa.ec.oib.training.api.controller;

import eu.europa.ec.oib.training.infrastructure.model.Idable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IUpdateController<T extends Idable<ID>, ID>  extends IAbstractController<T, ID> {

    @PostMapping("edit")
    @ResponseBody
    default T update(@RequestBody T entity){
        return service().save(entity);
    }
}
