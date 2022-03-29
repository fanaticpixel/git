/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author administrador
 */
public class Alumno {
    
    private String nombre,apellido;
    private double nota;
    private LocalDate fnac;

    public Alumno(String nombre, String apellido, double nota, LocalDate fnac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.fnac = fnac;
    }
    
    public Alumno(String nombre, String apellido, String nota, String fnac){
        DateTimeFormatter patron=DateTimeFormatter.ofPattern ("dd/LL/yyyy");
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota =Double.parseDouble(nota);
        this.fnac = LocalDate.parse(fnac, patron);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + ", fnac=" + fnac + '}';
    }

    public double getNota() {
        return nota;
    }
    
    
}
