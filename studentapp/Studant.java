/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import java.io.Serializable;

/**
 *
 * @author Haitham
 */
public abstract class Studant implements Comparable<Studant>, Serializable{
    private String name;
    private String major;
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
 
    @Override
    public String toString() {
        return "Studant{" + "The name: " + name + ", major: " + major + ", grade is: " + getGrade() + '}';
    }
   
//     @Override
//    public int compareTo(Studant o) {
//        return toString().compareTo(o.toString());
//    }
//    
   

   

    
}
