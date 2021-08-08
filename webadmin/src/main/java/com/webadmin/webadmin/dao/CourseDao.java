package com.webadmin.webadmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webadmin.webadmin.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
