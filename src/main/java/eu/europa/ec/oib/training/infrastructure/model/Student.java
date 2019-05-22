package eu.europa.ec.oib.training.infrastructure.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("S")
@Getter
@Setter
public class Student extends Person{

    @ManyToMany(mappedBy = "studentList")
    private List<Classroom> classrooms;

}
