package eu.europa.ec.oib.training.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "OIB_PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "CO_TYPE")
public abstract class Person implements Idable<Integer> {

    @Id
    @SequenceGenerator(name = "SQ_PERSON", sequenceName = "OIB_SEQ_PERSON")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PERSON")
    @Column(name = "NU_PERSON")
    private Integer id;

    @Column(name = "NA_PERSON")
    private String name;

    @Column(name = "DE_ADDRESS")
    private String address;

    @Column(name = "NU_MOBILE")
    private Integer mobile;

    @Column(name = "DT_CREATION")
    private LocalDate birth;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "CO_STATUS")
    private StatusCodeEnum statusCodeEnum;

}
