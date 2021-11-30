package com.skni.workshopspring3;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "Course")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Term")
    private int term;
    @Column(name = "University")
    private String university;
    @Enumerated(EnumType.STRING)
    @Column(name = "Type")
    private CourseTypeEnum type;
}