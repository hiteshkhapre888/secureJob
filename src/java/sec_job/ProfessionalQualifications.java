package sec_job;
// Generated Feb 7, 2014 3:34:15 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * ProfessionalQualifications generated by hbm2java
 */
public class ProfessionalQualifications  implements java.io.Serializable {


     private Integer idProfessionalQualifications;
     private Persons persons;
     private Sectors sectors;
     private String qualificationName;
     private String otherSector;
     private String awardingBody;
     private Date yearObtained;
     private String result;
     private Boolean verified;
     private String howVerified;

    public ProfessionalQualifications() {
    }

	
    public ProfessionalQualifications(Persons persons, String qualificationName) {
        this.persons = persons;
        this.qualificationName = qualificationName;
    }
    public ProfessionalQualifications(Persons persons, Sectors sectors, String qualificationName, String otherSector, String awardingBody, Date yearObtained, String result, Boolean verified, String howVerified) {
       this.persons = persons;
       this.sectors = sectors;
       this.qualificationName = qualificationName;
       this.otherSector = otherSector;
       this.awardingBody = awardingBody;
       this.yearObtained = yearObtained;
       this.result = result;
       this.verified = verified;
       this.howVerified = howVerified;
    }
   
    public Integer getIdProfessionalQualifications() {
        return this.idProfessionalQualifications;
    }
    
    public void setIdProfessionalQualifications(Integer idProfessionalQualifications) {
        this.idProfessionalQualifications = idProfessionalQualifications;
    }
    public Persons getPersons() {
        return this.persons;
    }
    
    public void setPersons(Persons persons) {
        this.persons = persons;
    }
    public Sectors getSectors() {
        return this.sectors;
    }
    
    public void setSectors(Sectors sectors) {
        this.sectors = sectors;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }
    
    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }
    public String getOtherSector() {
        return this.otherSector;
    }
    
    public void setOtherSector(String otherSector) {
        this.otherSector = otherSector;
    }
    public String getAwardingBody() {
        return this.awardingBody;
    }
    
    public void setAwardingBody(String awardingBody) {
        this.awardingBody = awardingBody;
    }
    public Date getYearObtained() {
        return this.yearObtained;
    }
    
    public void setYearObtained(Date yearObtained) {
        this.yearObtained = yearObtained;
    }
    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }
    public Boolean getVerified() {
        return this.verified;
    }
    
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
    public String getHowVerified() {
        return this.howVerified;
    }
    
    public void setHowVerified(String howVerified) {
        this.howVerified = howVerified;
    }




}


