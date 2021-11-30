package com.skni.workshopspring3;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRep courseRepository;
    public Course addCourse(String name, int term, String uni, CourseTypeEnum courseTypeEnum) {
        Course course = Course.builder().name(name).term(term).university(uni).type(courseTypeEnum).build();
        return courseRepository.save(course);
    }
}