package com.hibernate.ex1.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(exclude = {"employees"})
@ToString(exclude = {"employees"})
@Entity
public class Meeting implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long meetingId;
    private String subject;
    @CreationTimestamp
    private LocalDateTime startDate;
    @ManyToMany(mappedBy = "meetings", cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();
    public Meeting(String subject) {
        this.subject = subject;
    }
}
