/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.jobvacancy.entity;

/**
 *
 * @author ASUS
 */
public class Candidate {
    private String CID;
    private String FName;
    private String LName;
    private String Date_Of_Birth;
    private String Gender;
    private String Address;
    private int  Tele_NO;
    private String Email;

    public Candidate() {
    }

    public Candidate(String CID, String FName, String LName, String Date_Of_Birth, String Gender, String Address, int Tele_NO, String Email) {
        this.CID = CID;
        this.FName = FName;
        this.LName = LName;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Gender = Gender;
        this.Address = Address;
        this.Tele_NO = Tele_NO;
        this.Email = Email;
    }

    /**
     * @return the CID
     */
    public String getCID() {
        return CID;
    }

    /**
     * @param CID the CID to set
     */
    public void setCID(String CID) {
        this.CID = CID;
    }

    /**
     * @return the FName
     */
    public String getFName() {
        return FName;
    }

    /**
     * @param FName the FName to set
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     * @return the LName
     */
    public String getLName() {
        return LName;
    }

    /**
     * @param LName the LName to set
     */
    public void setLName(String LName) {
        this.LName = LName;
    }

    /**
     * @return the Date_Of_Birth
     */
    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    /**
     * @param Date_Of_Birth the Date_Of_Birth to set
     */
    public void setDate_Of_Birth(String Date_Of_Birth) {
        this.Date_Of_Birth = Date_Of_Birth;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Tele_NO
     */
    public int getTele_NO() {
        return Tele_NO;
    }

    /**
     * @param Tele_NO the Tele_NO to set
     */
    public void setTele_NO(int Tele_NO) {
        this.Tele_NO = Tele_NO;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    
}
