package com.jaletechs.recruiterapp.recruiter_app.repository;

import com.jaletechs.recruiterapp.recruiter_app.entities.ApplicantExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jaletechs on 2019-06-15.
 */
@Repository
public interface ApplicantExamRepository extends JpaRepository<ApplicantExam, Integer> {
} 
