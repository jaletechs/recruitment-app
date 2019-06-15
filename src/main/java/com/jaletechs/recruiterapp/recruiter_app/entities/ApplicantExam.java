/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaletechs.recruiterapp.recruiter_app.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jaletechs
 */
@Entity
@Table(name = "applicant_exam", catalog = "recruitment_app", schema = "")
@NamedQueries({
    @NamedQuery(name = "ApplicantExam.findAll", query = "SELECT a FROM ApplicantExam a"),
    @NamedQuery(name = "ApplicantExam.findById", query = "SELECT a FROM ApplicantExam a WHERE a.id = :id"),
    @NamedQuery(name = "ApplicantExam.findByChoice", query = "SELECT a FROM ApplicantExam a WHERE a.choice = :choice")})
public class ApplicantExam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "choice")
    private String choice;
    @JoinColumn(name = "applicant_id", referencedColumnName = "applicant_id")
    @ManyToOne(optional = false)
    private Applicant applicantId;
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Question questionId;

    public ApplicantExam() {
    }

    public ApplicantExam(Integer id) {
        this.id = id;
    }

    public ApplicantExam(Integer id, String choice) {
        this.id = id;
        this.choice = choice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Applicant getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Applicant applicantId) {
        this.applicantId = applicantId;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
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
        if (!(object instanceof ApplicantExam)) {
            return false;
        }
        ApplicantExam other = (ApplicantExam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jaletechs.recruiterapp.recruiter_app.entities.ApplicantExam[ id=" + id + " ]";
    }
    
}
