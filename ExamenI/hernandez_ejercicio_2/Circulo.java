package com.hernandez.hernandez_ejercicio_2;
import java.util.Scanner;
public class Circulo {

    public Circulo() {


    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Radio del circulo");

            double radio=sc.nextDouble();

            double areaCirculo=Math.PI*Math.pow(radio, 2);

            System.out.println("El area es "+areaCirculo);


        }
    }

