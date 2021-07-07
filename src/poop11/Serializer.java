/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author galic
 */
public class Serializer {
     Serializer() throws FileNotFoundException, IOException{
     Date d=new Date();
     System.out.println(d);
     
     try{
         FileOutputStream f=new FileOutputStream("date.ser");
         ObjectOutputStream s=new ObjectOutputStream(f);
         s.writeObject(d);
         s.close();
     }catch(IOException e)
     {
     e.printStackTrace();
     }
     }
 
  
 
 
 }

    

