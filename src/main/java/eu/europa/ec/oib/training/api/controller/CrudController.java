package eu.europa.ec.oib.training.api.controller;

import eu.europa.ec.oib.training.infrastructure.model.Idable;

public abstract class CrudController<T extends Idable<ID>, ID> extends AbstractController<T, ID>
            implements IFindController<T, ID>, IAddController<T, ID>, IDeleteController<T, ID>, IUpdateController<T, ID>{
}
