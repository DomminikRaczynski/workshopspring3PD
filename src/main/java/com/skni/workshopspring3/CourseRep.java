package com.skni.workshopspring3;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRep extends JpaRepository<Course, Long> {}