package com.example.studentapp.repo;

import com.example.studentapp.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface StudentRepo extends JpaRepository<Student,String> {
    @Query(value = "SELECT COUNT(student_Id) FROM student WHERE name LIKE ?1 OR address LIKE ?1",nativeQuery = true)
    public long getCountWithSearchText(String text);

    @Query(value = "SELECT * FROM student WHERE name LIKE ?1 OR address LIKE ?1",nativeQuery = true)
    public Page<Student> findAllWithSearchText(String text, PageRequest request);
}
