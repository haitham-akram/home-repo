
package studentapp;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Haitham
 */
public class ArtStudent extends Studant implements Serializable{
    protected double mid;
    protected double report;
    protected double fina1 ;

    public ArtStudent(String name,String major ,double mid, double report, double fina1) {
        setName(name);
        setMajor(major);
        this.mid = mid;
        this.report = report;
        this.fina1 = fina1;  
    }
    
    
    @Override
    public double getGrade(){ 
    return mid*0.40+report*0.10+fina1*50;
    }
     @Override
    public String toString() {
        return " ArtStudant{" + "The name: " + getName() + ", major: " + getMajor() + ", grade is: " +getGrade() + '}';
    }

    @Override
    public int compareTo(Studant o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
