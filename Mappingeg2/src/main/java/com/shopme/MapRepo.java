package com.shopme;


import com.shopme.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MapRepo extends JpaRepository<Student, Integer> {

}
