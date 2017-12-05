package com.cice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.print("Di un número, por favor: ");

        Scanner scan = new Scanner(System.in);

        //Creo un escanner

        long numeroSC = scan.nextInt();

        //Asigno el escanner a un long
        
        long resultado = 1;

        //La variable resultado es para que numeroSC no asigne el valor con la operaicón x= dando bucles infinitos!



        for (int i = 1; i <= numeroSC; i++) {

            System.out.println(resultado + "x" + i + " = " + (resultado *= i));

            //El bucle empezara por 1 por lo que empezara multiplicando por 1
            //Y su limite no sera mayor que el numero que haya puesto el usuario por scanner
            //por lo que operara todos sus operandos posteriores y asiganar su resulado al nuevo valor (factoriales)
        }


    }
}
