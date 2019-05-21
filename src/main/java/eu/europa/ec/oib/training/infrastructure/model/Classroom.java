package eu.europa.ec.oib.training.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "OIB_CLASSROOM")
public class Classroom implements Idable<Integer>{

    @Id
    @SequenceGenerator(name = "SQ_CLASSROOM", sequenceName = "OIB_SEQ_CLASSROOM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CLASSROOM")
    @Column(name = "NU_CLASSROOM")
    private Integer id;

    @Column(name = "NA_CLASSROOM")
    private String name;

    @Column(name = "DE_CLASSROOM")
    private String description;

    @Column(name = "NU_YEAR")
    private Integer year;

    @ManyToOne
    @JoinColumn(name = "NU_GRADE")
    private Grade grade;

    @ManyToOne
    @JoinColumn(name = "NU_TEACHER")
    private Teacher teacher;

}
