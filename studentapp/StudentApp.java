/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Haitham
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws  IOException {
       Studant []arraystd=new Studant[4];
       arraystd[0]=new ItStudent("haitham","second level",30,28,38);
       arraystd[1]=new ItStudent("abood","third level",30,25,36);
       arraystd[2]=new ArtStudent("mohammed","first level",38,8,46);
       arraystd[3]=new ArtStudent("ali","second level",32,7,40);
        for (Studant arraystd1 : arraystd) {
            System.out.println(arraystd1.toString()); 
        }




Arrays.sort(arraystd,new Comparator<Studant>() {
           @Override
           public int compare(Studant o1, Studant o2) {
               return  (int) (o2.getGrade()-o1.getGrade());
           }});
        System.out.println("Sorted ---------------------------");
 for (Studant arraystd1 : arraystd) {
            System.out.println(arraystd1.toString()); 
        }
 
   try{new File("C:\\Users\\Haitham\\Desktop\\std\\studant.txt").mkdirs(); 
    FileOutputStream fos = new FileOutputStream("C:\\Users\\Haitham\\Desktop\\std\\studant.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(arraystd);
    oos.close();
   }catch (FileNotFoundException e) {
    
       System.out.println("try again ");
    }
    }  
}
