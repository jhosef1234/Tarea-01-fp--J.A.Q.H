package clase_8;

import java.util.Scanner;

public class EstructurasRepetitivas {
  
    static Scanner lt=new Scanner(System.in);

    public static void suma10Cantidades41() {
        //Definir variables
        int contador=1;
        double numeroX;
        double sumaNumeros=0;
        //Proceso Datos de entrada
        while (contador<=10) {
            System.out.print("Ingrese el valor de "+contador+": ");
            numeroX=lt.nextDouble();
            sumaNumeros=sumaNumeros+numeroX;
            contador++;
            System.out.println("");
        }
        //Datos de Salida
        System.out.println("La suma de los "+(contador-1)+" valores introducidos es: "+ sumaNumeros);
    }
    public static void focosColores44() {
        //Definir Variables
        int cantfocoV=0, cantfocoB=0, cantfocoR=0;
        String colorF="";
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese el color de Foco:\nV=Verde\nB=Blanco\nR-Rojo");
            colorF=lt.next().toUpperCase();
            if (colorF.charAt(0)=='V') {
                cantfocoV++;
            }else if (colorF.charAt(0)=='B') {
                cantfocoB++;
            } else if (colorF.charAt(0)=='R') {
                cantfocoR++;
            }else{
                System.err.println("No es correcto el color de foco");
            }

            System.out.println("Tiene mas focos a evaluar?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        //Datos de salida
        System.out.println("La cantidad de focos de color Verde es: "+cantfocoV);
        System.out.println("La cantidad de focos de color Blanco es:" +cantfocoB);
        System.out.println("La cantidad de focos de color Rojo es: "+cantfocoR);
        System.out.println("La cantidad Total de focos son: "+(cantfocoV+cantfocoB+cantfocoR));

    }
    public static void numMayoresCeroMenores47() {
        //Definir Variables
        int cantNumMayorcero=0, cantNumMenorIgualCero=0;
        double numN=0;
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese un numero:");
            numN=lt.nextDouble();
            if (numN<=0) {
                cantNumMenorIgualCero++;
            }else{
                cantNumMayorcero++;
            }
            System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }  
        //Datos de salida
        System.out.println("Cantidad de numeros Mayores de cero: "+cantNumMayorcero);
        System.out.println("Cantidad de numeros menores e iguales a cero: "+cantNumMenorIgualCero);
        System.out.println("Total de numeros introducidos: "+(cantNumMayorcero+cantNumMenorIgualCero));

    }
    public static void impuestoVehiculo418() {
        //Definir variables
        String cateV="";
        int cantidad=0;
        double costV=0,impUnit=0, impToltal=0, totalImpV=0;
        //Datos de entrada y proceso y salida
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Cantidad Vehiculos de Categoria "+ (i+1)+": ");
            cantidad=lt.nextInt();
            System.out.println("ingrese el precio de la categoria " +(i+1)+":");
            costV=lt.nextDouble();
            if(i==0){
                impUnit=costV*0.10;
            }else if(i==1){
                impUnit=costV*0.07;
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
    public static void sumarlosnumerosparesentre1al20() {
        //Definir Variables

    }



    public static void main(String[] args) {
        //Definir variable
        int numero;
        System.out.println("ingrese el numero del ejercicio que desea");
        numero=lt.nextInt();
        switch (numero) {
            case 1:suma10Cantidades41(); break;
            case 2:focosColores44(); break;
            case 3:numMayoresCeroMenores47(); break;
            case 4:impuestoVehiculo418(); break;
        
            default:break;
        }

    }
}