package io.curly.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String>
{
    List<Course> findById(String id);
    List<Course> findByName(String name);
    List<Course> findByDescription(String description);
    List<Course> findByTopicId(String topicId);
}
