package eu.europa.ec.oib.training.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "OIB_EXAM")
public class Exam implements Idable<Integer>{

    @Id
    @SequenceGenerator(name = "SQ_EXAM", sequenceName = "OIB_SEQ_EXAM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EXAM")
    @Column(name = "NU_EXAM")
    private Integer id;

    @Column(name = "NA_EXAM")
    private String name;

    @Column(name = "DE_EXAM")
    private String description;
    
}
