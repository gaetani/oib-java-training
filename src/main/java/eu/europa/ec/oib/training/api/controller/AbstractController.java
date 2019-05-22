package eu.europa.ec.oib.training.api.controller;

import eu.europa.ec.oib.training.infrastructure.model.Idable;
import eu.europa.ec.oib.training.infrastructure.service.IAbstractService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractController<T extends Idable<ID>, ID> implements IAbstractController<T, ID>{

    @Autowired
    private IAbstractService<T, ID> abstractService;

    @Override
    public IAbstractService<T, ID> service() {
        return abstractService;
    }
}
