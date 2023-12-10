/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject;

/**
 *
 * @author franc
 */
public class Mavenproject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("¿Es el Lunes un dia laboral?" + MiClase.dia_laboral("Lunes"));
    }
}
class MiClase {
public static boolean dia_laboral(String dia) {
    return switch (dia) {
        case "Lunes" -> true;
        case "Martes" -> true;
        case "Miercoles" -> true;
        case "Jueves" -> true;
        case "Viernes" -> true;
        case "Sabado" -> false;
        case "Domingo" -> false;
        default -> false;
    };
}
}
