package com.jaletechs.recruiterapp.recruiter_app.repository;

import com.jaletechs.recruiterapp.recruiter_app.entities.Question;
import com.jaletechs.recruiterapp.recruiter_app.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by jaletechs on 2019-06-15.
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    // get questions on listing type
    @Query ("select q from Question q where q.listing=?1 ")
    List<Question> getUserApplication( @Param ("listing") String listingType);
} 
