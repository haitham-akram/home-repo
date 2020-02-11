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
public class ItStudent extends Studant implements Serializable{
    protected double mid;
    protected double project;
    protected double fina1 ;
     public ItStudent(String name,String major ,double mid, double project, double fina1) {
        setName(name);
        setMajor(major);
        this.mid = mid;
        this.project = project;
        this.fina1 = fina1; 
       
        
    }
    @Override
    public double getGrade(){ 
    return mid*0.30+project*0.30+fina1*40;
    }

    @Override
    public String toString() {
        return " ItStudant{" + "The name: " + getName() + ", major: " + getMajor() + ", grade is: " + getGrade() + '}';
    }

    @Override
    public int compareTo(Studant o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
