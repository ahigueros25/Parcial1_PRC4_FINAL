/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.clases;

import java.util.Scanner;

/**
 *
 * @author Ale Higueros
 */
public class Persona {

    String nombre, apellido, cargo;
    private Scanner teclado;
    
     public Persona() {

    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void IngresarEmpleado(){
        teclado = new Scanner(System.in);
        String nombre, apellido, cargo;
        System.out.println("Introduzca el nombre: ");
        nombre = teclado.next();
        System.out.println("Introduzca el apellido: ");
        apellido = teclado.next();
        System.out.println("Introduzca el cargo: ");
        cargo = teclado.next();
        System.out.println("Nombre del trabajador: " + nombre+" "+apellido);
        System.out.println("Cargo del trabajador: " + cargo);
    }
}
