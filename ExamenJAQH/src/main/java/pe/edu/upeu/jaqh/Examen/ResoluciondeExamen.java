package pe.edu.upeu.jaqh.Examen;

import java.util.Scanner;

/**
 * ResoluciondeExamen
 */
public class ResoluciondeExamen {
    
    static Scanner leerT = new Scanner(System.in);

    public void ejercicio_2() {
        //Definir variables
        String cateV="";
        int cantidad=0;
        double costV=0,impUnit=0, impToltal=0, totalImpV=0;
        //Datos de entrada y proceso y salida
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Cantidad Vehiculos de Categoria "+ (i+1)+": ");
            cantidad=leerT.nextInt();
            System.out.println("ingrese el precio de la categoria " +(i+1)+":");
            costV=leerT.nextDouble();
            if(i==0){
                impUnit=costV*0.12;
            }else if(i==1){
                impUnit=costV*0.08;
            }else{
                impUnit=costV*0.05;
            }
            impToltal=impUnit*cantidad;
            System.out.println("Impuesto de Categoria "+(i+1)+" es:"+impUnit);
            System.out.println("Impuesto Total de Categoria "+(i+1)+" es:"+impToltal);
            totalImpV=totalImpV+impToltal;
        }
        System.out.println("Impuesto Total de los vehiculos es :"+totalImpV);
    }

    public void ejercicio_3() {
        int h = 0;
        System.out.print("Introduce la altura (recuerda que debe de ser un numero mayor a 3 e impar): ");
        h = leerT.nextInt();
        if (h % 2 == 1 && h >= 3) {
            for (int fil = 1; fil <= h; fil++) {
                for (int col = 1; col <= h; col++) {
                    if ((fil == col) || (col == (h - fil) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("vuelva a intentarlo");
        }
    }

    public void ejercicio_4() {
        int i, j, suma, sec = 0;
        System.out.println("Ingrese la cantidad de numeros perfectos que desea ver: ");
        int canti = leerT.nextInt();
        System.out.println("Los numero perfectos son: ");
        for (i = 1; i > 0; i++) {

            suma = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {

                sec++;
                if (sec <= canti) {
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }

    }

    public void ejercicio5_1() {
        int n;
        do {
            System.out.print("Introduzca un numero que sea mayor a cero : ");
            n = leerT.nextInt();
        } while (n < 0);
        System.out.print("Binario: ");
        ejercicio5_2(n);
    }

    public static void ejercicio5_2(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            ejercicio5_2(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}
