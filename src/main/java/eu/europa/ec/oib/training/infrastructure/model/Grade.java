package eu.europa.ec.oib.training.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "OIB_GRADE")
public class Grade implements Idable<Integer>{

    @Id
    @SequenceGenerator(name = "SQ_GRADE", sequenceName = "OIB_SEQ_GRADE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_GRADE")
    @Column(name = "NU_GRADE")
    private Integer id;

    @Column(name = "NA_GRADE")
    private String name;

    @Column(name = "DE_GRADE")
    private String description;

}
