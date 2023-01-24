/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thomas.medevapp;

/**
 *
 * @author Thomas
 */
public class Adresse {
    private String streetNumber;
    private String streetName;
    private String city;
    private String country;

    /**
     *
     * @param streetNumber
     * @param streetName
     * @param city
     * @param country
     */
    public Adresse(String streetNumber, String streetName, String city, String country) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
    }

    /**
     *
     * @return
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     *
     * @param streetNumber
     */
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     *
     * @return
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     *
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
