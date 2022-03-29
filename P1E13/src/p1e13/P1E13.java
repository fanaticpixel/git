/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e13;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Vector;

/**
 *
 * @author administrador
 */
public class P1E13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datos[];
        Vector<Alumno> alumnos = new Vector<Alumno>();

        Path fichero = Paths.get("alumnos.txt");
        Charset charset = Charset.forName("UTF-8");
        BufferedReader reader = null;

        try {
            //Creamos un BuffereReader de java.io
            reader = Files.newBufferedReader(fichero, charset);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                datos=line.split(",");
                alumnos.add(new Alumno(datos[0],datos[1],datos[2],datos[3]));
            }
            System.out.println("alumnos: "+alumnos);
            burbuja(alumnos);
            System.out.println("alumnos: "+alumnos);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        } finally {

            if (reader != null) {
                //reader.close();
            }
        }

    }
    
    public static void burbuja(Vector<Alumno> A) {
        int i, j;
        Alumno aux=null;
        for (i = 0; i < A.size() - 1; i++) {
            for (j = 0; j < A.size() - i - 1; j++) {                                                              
                //if (A[j + 1] < A[j]) {
                if (A.get(j+1).getNota() < A.get(j).getNota())
                    //aux = A[j + 1];
                    aux = A.get(j+1);
                    //A[j + 1] = A[j];
                    A.set(j+1,A.get(j));
                    //A[j] = aux;
                    A.set(j,aux);                }
            }
        }
}


