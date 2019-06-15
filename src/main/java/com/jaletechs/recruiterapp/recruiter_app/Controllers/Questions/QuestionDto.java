package com.jaletechs.recruiterapp.recruiter_app.Controllers.Questions;

import com.jaletechs.recruiterapp.recruiter_app.type.Listing;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class QuestionDto  implements Serializable{
    @NotNull
    private Integer id;
    private String questionText;
    @NotNull
    private String optionA;
    @NotNull
    private String optionB;
    @NotNull
    private String optionC;
    @NotNull
    private String optionD;
    @NotNull
    private String correctOption;
    @NotNull
    private String listing;

    public QuestionDto ( @NotNull Integer id, String questionText, @NotNull String optionA, @NotNull String optionB, @NotNull String optionC, @NotNull String optionD, @NotNull String correctOption, @NotNull String listing ) {
        this.id = id;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
        this.listing = listing;
    }

    public QuestionDto () {
    }

    public Integer getId () {
        return id;
    }

    public void setId ( Integer id ) {
        this.id = id;
    }

    public String getQuestionText () {
        return questionText;
    }

    public void setQuestionText ( String questionText ) {
        this.questionText = questionText;
    }

    public String getOptionA () {
        return optionA;
    }

    public void setOptionA ( String optionA ) {
        this.optionA = optionA;
    }

    public String getOptionB () {
        return optionB;
    }

    public void setOptionB ( String optionB ) {
        this.optionB = optionB;
    }

    public String getOptionC () {
        return optionC;
    }

    public void setOptionC ( String optionC ) {
        this.optionC = optionC;
    }

    public String getOptionD () {
        return optionD;
    }

    public void setOptionD ( String optionD ) {
        this.optionD = optionD;
    }

    public String getCorrectOption () {
        return correctOption;
    }

    public void setCorrectOption ( String correctOption ) {
        this.correctOption = correctOption;
    }

    public String getListing () {
        return listing;
    }

    public void setListing ( String listing ) {
        this.listing = listing;
    }
}
