package com.skni.workshopspring3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "BirthDate")
    private LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "Gender")
    private GenderEnum gender;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CourseId", nullable = false)
    private Course course;
}