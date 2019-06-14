package com.hernandez.Practica;

public class PracticaMain {
    public static void main (String[] args) {

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = i;
        }

        for (int temp : numeros) {
            System.out.print(temp + ",");
        }

        }
    }
