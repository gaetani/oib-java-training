package eu.europa.ec.oib.training.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "OIB_STUDENT")
public class Student {

    @Id
    @SequenceGenerator(name = "SQ_STUDENT", sequenceName = "OIB_SEQ_STUDENT")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_STUDENT")
    @Column(name = "NU_STUDENT")
    private Long id;


    @Column(name = "NA_STUDENT")
    private String name;

    @Column(name = "DE_ADDRESS")
    private String address;

    @Column(name = "NU_MOBILE")
    private Integer mobile;

    @Column(name = "DT_CREATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

}
