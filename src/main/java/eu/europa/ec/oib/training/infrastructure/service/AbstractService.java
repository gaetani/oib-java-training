package eu.europa.ec.oib.training.infrastructure.service;

import eu.europa.ec.oib.training.infrastructure.model.Idable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public abstract class AbstractService<T extends Idable<ID>, ID> implements IAbstractService<T, ID> {

    @Autowired
    private CrudRepository<T, ID> crudRepository;

    @Override
    public long count() {
        return crudRepository.count();
    }

    @Override
    public void delete(ID id) {
        crudRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        crudRepository.deleteAll();
    }

    @Override
    public boolean exists(ID id) {
        return crudRepository.existsById(id);
    }

    @Override
    public Iterable<T> findAll(Iterable<ID> ids) {
        return crudRepository.findAllById(ids);
    }

    @Override
    public Optional<T> findOne(ID id) {
        return crudRepository.findById(id);
    }

    @Override
    public Iterable<T> save(Iterable<T> entities) {
        return crudRepository.saveAll(entities);
    }

    @Override
    public T save(T entity) {
        return crudRepository.save(entity);
    }

    @Override
    public Iterable<T> findAll(){
        return crudRepository.findAll();
    }
}
