package io.curly.springbootstarter.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseService
{


    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String topicId)
    {
        List<Course> courses = new ArrayList<>();
        //courseRepository.findAll().forEach(courses::add);
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }


    public Course getCourse(String id)
    {
        //return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findOne(id);
    }


    public void addCourse(Course course)
    { courseRepository.save(course); }


    public void updateCourse(Course course)
    { courseRepository.save(course); }


    public void deleteCourse(String id)
    {
        //courses.removeIf(t -> t.getId().equals(id));
        courseRepository.delete(id);
    }


}
