package com.aryausha.courseapp.repository;

import com.aryausha.courseapp.model.Courses;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Courses,String> {
}
