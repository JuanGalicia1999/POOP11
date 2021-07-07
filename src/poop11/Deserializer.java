/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 *
 * @author galic
 */
public class Deserializer {
    
    Deserializer(){
    Date d=null;
    try{
        FileInputStream f=new FileInputStream("date.ser");
        ObjectInputStream s=new ObjectInputStream(f);
        d=(Date) s.readObject();
        s.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    System.out.println("Se deserializo la fecha anterio.");
    System.out.println("Date:"+d);
    
    
    }
    
}
