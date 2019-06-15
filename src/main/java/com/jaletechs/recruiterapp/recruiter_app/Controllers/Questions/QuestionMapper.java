package com.jaletechs.recruiterapp.recruiter_app.Controllers.Questions;

import com.jaletechs.recruiterapp.recruiter_app.entities.Question;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionMapper {

    public static QuestionDto maptoQuestionDto (Question question){
        QuestionDto dto = new QuestionDto();
        dto.setQuestionText(question.getQuestionText());
        dto.setOptionA(question.getOptionA());
        dto.setOptionB(question.getOptionB());
        dto.setOptionC(question.getOptionC());
        dto.setOptionD(question.getOptionD());
        dto.setListing(question.getListing().name());
        return dto;

    }

    public static List<QuestionDto> mapToQuestionDtos(List<Question> questions) {
        if(questions.isEmpty())  throw new IllegalArgumentException(" empty list passed to mapToQuestions");
        return questions.stream()
                .map(QuestionMapper::maptoQuestionDto)
                .collect(Collectors.toList());
    }

}
