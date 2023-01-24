/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thomas.medevapp;

/**
 *
 * @author Thomas
 */
public class Personne {
    private String firstname;
    private String lastname;
    private String email;
    private Adresse adresse;

    /**
     *
     * @param firstname
     * @param lastname
     * @param email
     */
    public Personne(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    /**
     *
     * @param firstname
     * @param lastname
     * @param email
     * @param adresse
     */
    public Personne(String firstname, String lastname, String email, Adresse adresse) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.adresse = adresse;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Personne{" + "firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", adresse=" + adresse + '}';
    }
    
    /**
     *
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     *
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     *
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    
    
}
