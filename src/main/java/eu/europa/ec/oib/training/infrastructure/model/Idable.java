package eu.europa.ec.oib.training.infrastructure.model;

import java.io.Serializable;

public interface Idable<T> extends Serializable {

    T getId();
    void setId(T pk);
}
