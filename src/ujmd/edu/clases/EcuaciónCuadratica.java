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
public class EcuaciónCuadratica {

    private Scanner teclado;
    private int a;
    private int b;
    private int c;
    
    public EcuaciónCuadratica() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void calcular() {
        int  a = 0, b = 0, c = 0;
        teclado = new Scanner(System.in);
        System.out.println("Introduzca el valor de a: ");
        a = teclado.nextInt();
        System.out.println("Introduzca el valor de b: ");
        b = teclado.nextInt();
        System.out.println("Introduzca el valor de c: ");
        c = teclado.nextInt();
        double resultado = Math.sqrt(b * b - 4*a*c);
        double x1 = (-b + resultado) / (2 * a);
        double x2 = (-b - resultado) / (2 * a);
        System.out.println("El resultado de x1 es: ");
        System.out.println(x1);
        System.out.println("El resultado de x2 es: ");
        System.out.println(x2);
    }
}
