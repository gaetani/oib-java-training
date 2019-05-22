package eu.europa.ec.oib.training.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "OIB_CLASSROOM_STUDENT",
            joinColumns = @JoinColumn(name = "NU_CLASSROOM"),
            inverseJoinColumns = @JoinColumn(name = "NU_PERSON")
    )
    private List<Student> studentList;


    @ManyToOne
    @JoinColumn(name = "NU_TEACHER")
    private Teacher teacher;

}
