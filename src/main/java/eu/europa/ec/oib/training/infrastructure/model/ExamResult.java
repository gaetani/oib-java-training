package eu.europa.ec.oib.training.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "OIB_EXAM_RESULT")
public class ExamResult implements Idable<Integer>{

    @Id
    @SequenceGenerator(name = "SQ_EXAM_RESULT", sequenceName = "OIB_SEQ_EXAM_RESULT")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EXAM_RESULT")
    @Column(name = "NU_EXAM_RESULT")
    private Integer id;

    @Column(name = "NU_MARK")
    private Double mark;

    @Column(name = "DT_EXAM")
    private LocalDate dateExam;

    @ManyToOne
    @JoinColumn(name = "NU_TEACHER")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "NU_COURSE")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "NU_STUDENT")
    private Student student;

    
}
