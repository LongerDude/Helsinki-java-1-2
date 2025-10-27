/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salma
 */
public class Result {

    private String country;
    private String sex;
    private int year;
    private double literacyPercent;

    public Result(String sex, String country, int year, double literacyPercent) {
        this.country = country;
        this.sex = sex;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyPercent;
    }

}
