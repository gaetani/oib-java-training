package eu.europa.ec.oib.training.api.controller;

import eu.europa.ec.oib.training.infrastructure.model.Idable;
import eu.europa.ec.oib.training.infrastructure.service.IAbstractService;

public interface IAbstractController<T extends Idable<ID>, ID> {
    IAbstractService<T, ID> service();
}
