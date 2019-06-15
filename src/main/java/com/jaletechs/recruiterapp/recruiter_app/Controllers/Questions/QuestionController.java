package com.jaletechs.recruiterapp.recruiter_app.Controllers.Questions;
import com.jaletechs.recruiterapp.recruiter_app.repository.QuestionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/questions")
public class QuestionController {

    private QuestionRepository em;

    @GetMapping
    ResponseEntity<List<QuestionDto>> getQuestionsForListType( @PathVariable String listingType) {
        return ResponseEntity.ok(QuestionMapper.mapToQuestionDtos(em.getUserApplication(listingType)) );
    }
}
