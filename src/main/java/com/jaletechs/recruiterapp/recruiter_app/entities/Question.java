/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaletechs.recruiterapp.recruiter_app.entities;

import com.jaletechs.recruiterapp.recruiter_app.type.Listing;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jaletechs
 */
@Entity
@Table(name = "question", catalog = "recruitment_app", schema = "")
@NamedQueries({
    @NamedQuery(name = "Question.findAll", query = "SELECT q FROM Question q"),
    @NamedQuery(name = "Question.findById", query = "SELECT q FROM Question q WHERE q.id = :id"),
    @NamedQuery(name = "Question.findByQuestionText", query = "SELECT q FROM Question q WHERE q.questionText = :questionText"),
    @NamedQuery(name = "Question.findByOptionA", query = "SELECT q FROM Question q WHERE q.optionA = :optionA"),
    @NamedQuery(name = "Question.findByOptionB", query = "SELECT q FROM Question q WHERE q.optionB = :optionB"),
    @NamedQuery(name = "Question.findByOptionC", query = "SELECT q FROM Question q WHERE q.optionC = :optionC"),
    @NamedQuery(name = "Question.findByOptionD", query = "SELECT q FROM Question q WHERE q.optionD = :optionD"),
    @NamedQuery(name = "Question.findByCorrectOption", query = "SELECT q FROM Question q WHERE q.correctOption = :correctOption"),
    @NamedQuery(name = "Question.findByListing", query = "SELECT q FROM Question q WHERE q.listing = :listing")})
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "question_text")
    private String questionText;
    @Basic(optional = false)
    @Column(name = "option_a")
    private String optionA;
    @Basic(optional = false)
    @Column(name = "option_b")
    private String optionB;
    @Basic(optional = false)
    @Column(name = "option_c")
    private String optionC;
    @Basic(optional = false)
    @Column(name = "option_d")
    private String optionD;
    @Basic(optional = false)
    @Column(name = "correct_option")
    private String correctOption;
    @Column(name = "listing")
    @Enumerated(EnumType.STRING)
    private Listing listing;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "questionId")
    private List<ApplicantExam> applicantExamList;

    public Question() {
    }

    public Question(Integer id) {
        this.id = id;
    }

    public Question(Integer id, String questionText, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        this.id = id;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public Listing getListing() {
        return listing;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }

    public List<ApplicantExam> getApplicantExamList() {
        return applicantExamList;
    }

    public void setApplicantExamList(List<ApplicantExam> applicantExamList) {
        this.applicantExamList = applicantExamList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Question)) {
            return false;
        }
        Question other = (Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jaletechs.recruiterapp.recruiter_app.entities.Question[ id=" + id + " ]";
    }
    
}
