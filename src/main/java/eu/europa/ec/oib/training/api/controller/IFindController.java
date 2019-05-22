package eu.europa.ec.oib.training.api.controller;

import eu.europa.ec.oib.training.infrastructure.model.Idable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface IFindController<T extends Idable<ID>, ID>  extends IAbstractController<T, ID> {

    @GetMapping("page")
    @ResponseBody
    default Iterable<T> findAll(){
        return service().findAll();
    }
}
