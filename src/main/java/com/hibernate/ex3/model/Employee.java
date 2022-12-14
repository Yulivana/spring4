package com.hibernate.ex3.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(exclude = {"department", "meetings", "employeeDetail"})
@ToString(exclude = {"department", "meetings", "employeeDetail"})
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @CreationTimestamp
    private LocalDateTime date;

    @OneToOne(mappedBy = "employee",
            cascade = CascadeType.PERSIST)
    private EmployeeDetail employeeDetail;

   @ManyToOne
   @JoinColumn(name = "DEPARTMENT_ID")
   private Department department;

   @ManyToMany(cascade = CascadeType.ALL)
   private List<Meeting> meetings = new ArrayList<>();


}
