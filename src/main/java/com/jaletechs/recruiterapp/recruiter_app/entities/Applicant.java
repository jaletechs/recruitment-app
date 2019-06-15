/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaletechs.recruiterapp.recruiter_app.entities;

import com.jaletechs.recruiterapp.recruiter_app.type.Listing;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jaletechs
 */
@Entity
@Table(name = "applicant")
@NamedQueries({
    @NamedQuery(name = "Applicant.findAll", query = "SELECT a FROM Applicant a"),
    @NamedQuery(name = "Applicant.findByApplicantId", query = "SELECT a FROM Applicant a WHERE a.applicantId = :applicantId"),
    @NamedQuery(name = "Applicant.findByFullName", query = "SELECT a FROM Applicant a WHERE a.fullName = :fullName"),
    @NamedQuery(name = "Applicant.findByDob", query = "SELECT a FROM Applicant a WHERE a.dob = :dob"),
    @NamedQuery(name = "Applicant.findByListing", query = "SELECT a FROM Applicant a WHERE a.listing = :listing")})
public class Applicant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "applicant_id")
    private String applicantId;
    @Basic(optional = false)
    @Column(name = "full_name")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "listing")
    @Enumerated(EnumType.STRING)
    private Listing listing;
    @Lob
    @Column(name = "passport")
    private byte[] passport;
    @Lob
    @Column(name = "document")
    private byte[] document;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicantId")
    private List<ApplicantExam> applicantExamList;

    public Applicant() {
    }

    public Applicant(String applicantId) {
        this.applicantId = applicantId;
    }

    public Applicant(String applicantId, String fullName, Date dob) {
        this.applicantId = applicantId;
        this.fullName = fullName;
        this.dob = dob;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Listing getListing() {
        return listing;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }

    public byte[] getPassport() {
        return passport;
    }

    public void setPassport(byte[] passport) {
        this.passport = passport;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
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
        hash += (applicantId != null ? applicantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Applicant)) {
            return false;
        }
        Applicant other = (Applicant) object;
        if ((this.applicantId == null && other.applicantId != null) || (this.applicantId != null && !this.applicantId.equals(other.applicantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jaletechs.recruiterapp.recruiter_app.entities.Applicant[ applicantId=" + applicantId + " ]";
    }
    
}
