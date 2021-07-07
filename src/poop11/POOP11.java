/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;

/**
 *
 * @author galic
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static poop11.Reader.muestraContenido;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         try {
            String ruta = "C:\\Users\\galic\\Documents\\Ejemplo1.txt";
            String contenido = "Soy el ejemplo 1";
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         
         try {
            String ruta = "C:\\Users\\galic\\Documents\\Ejemplo2.txt";
            String contenido = "Estoy en la ruta "+ruta;
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
         
         
         muestraContenido("C:\\\\Users\\\\galic\\\\Documents\\\\Ejemplo1.txt");
         muestraContenido("C:\\\\Users\\\\galic\\\\Documents\\\\Ejemplo2.txt");
         
         
         
         
         
           new Serializer();
           new Deserializer();
        
    }
    
    


}
