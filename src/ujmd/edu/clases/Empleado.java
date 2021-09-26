/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.clases;

import ujmd.edu.clases.Persona;
import java.util.Scanner;

/**
 *
 * @author Ale Higueros
 */
public class Empleado {

    int horas;
    private Scanner teclado;
    Persona persona = new Persona();
    Boolean salir;

    public Empleado() {

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void calculo() {
        teclado = new Scanner(System.in);
        int horas;
        double salario = 0;
        double descuentoISSS = 0.0525F, descuentoAFP = 0.0688F, descuentoRENTA = 0.1F, salarioBase, salarioFinal;
        int salir = 0;

        do {
            persona.IngresarEmpleado();
            System.out.println("Introduzca las horas trabajadas: ");
            horas = teclado.nextInt();
            if (horas <= 160) {
                salario = (horas * 9.75);
            }
            if (horas >= 160) {
                salario = ((160 * 9.75) + ((horas - 160) * 11.50));
            }
            salarioBase = salario - ((salario * descuentoISSS) + (salario * descuentoAFP));
            salarioFinal = salarioBase - (salarioBase * descuentoRENTA);
            
            System.out.println("Descuento de ISSS es: $" + salario * descuentoISSS);
            System.out.println("Descuento de AFP es: $" + salario * descuentoAFP);
            System.out.println("Descuento de RENTA es: $" + salarioBase * descuentoRENTA);
            System.out.println("Total a pagar: $" + salarioFinal);
            salir++;
        } while (salir <= 4);
    }
}
