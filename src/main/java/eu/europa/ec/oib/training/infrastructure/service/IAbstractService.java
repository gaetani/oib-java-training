package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Idable;

import java.util.Optional;

public interface IAbstractService<T extends Idable<ID>, ID> {
    long count();

    void delete(ID id);

    void deleteAll();

    boolean exists(ID id);

    Iterable<T> findAll(Iterable<ID> ids);

    Optional<T> findOne(ID id);

    Iterable<T> save(Iterable<T> entities);

    T save(T entity);

    Iterable<T> findAll();
}
