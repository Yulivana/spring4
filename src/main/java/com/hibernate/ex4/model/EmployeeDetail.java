package com.hibernate.ex4.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(exclude = {"employees"})
@ToString(exclude = {"employees"})
@Entity
public class EmployeeDetail implements Serializable {

    @Id
    @GenericGenerator(name = "one-one",
                      strategy = "foreign",
                      parameters = @Parameter(name = "property", value = "employee"))
    @GeneratedValue(generator = "one-one")
    private Long id;

    private String street;

    private String city;

    private String state;

    private String country;

    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    private Employee employee;
}
