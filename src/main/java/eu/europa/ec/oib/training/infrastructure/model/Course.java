package eu.europa.ec.oib.training.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "OIB_COURSE")
public class Course implements Idable<Integer>{

    @Id
    @SequenceGenerator(name = "SQ_COURSE", sequenceName = "OIB_SEQ_COURSE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COURSE")
    @Column(name = "NU_COURSE")
    private Integer id;

    @Column(name = "NA_COURSE")
    private String name;

    @Column(name = "DE_COURSE")
    private String description;

    @ManyToOne
    @JoinColumn(name = "NU_GRADE")
    private Grade grade;

}
