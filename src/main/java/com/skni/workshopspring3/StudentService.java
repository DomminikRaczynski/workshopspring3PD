package com.skni.workshopspring3;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRep studentRepository;
    public Student addStudent(String firstName, String lastName, LocalDate birthDate, GenderEnum gender, Course course) {
        Student student = Student.builder().firstName(firstName).lastName(lastName).birthDate(birthDate).gender(gender).course(course).build();
        return studentRepository.save(student);
    }
    public List<Student> findAllByLastName(String lastName) {
        return studentRepository.findAllByLastName(lastName);
    }
    public Optional<Student> getStudentByGenderAndByCourseType(GenderEnum gender, CourseTypeEnum type) {
        return studentRepository.findStudentByGenderAndCourse_Type(gender, type);
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public String deleteStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            studentRepository.deleteById(id);
            return "Deleted "+ student;
        }
        return "There is no"+ student+"in db";
    }
}