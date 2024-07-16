package com.tomcatserver.sms.repository;

import com.tomcatserver.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
