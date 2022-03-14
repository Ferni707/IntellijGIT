package com.company;

public class Main {
    /**
     * Genera los valores del objeto
     * @param args
     */
    public static void main(String[] args) {
	Persona p = new Persona();
    p.nombre = "Pepa";
    p.edad = 18;
    p.estatura = 1.89;
    System.out.println(p.nombre);
    }
}
