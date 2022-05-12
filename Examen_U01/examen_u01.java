package Examen_U01;

import java.util.Scanner;

/**
 * ReforzamientoU1
 */
public class examen_u01 {
    //examen unidad 01-jhosef anthony quispe huarilloclla
    static Scanner leerTeclado=new Scanner(System.in);

    public static void pregunta1JAQH() {
        //Definir Variables
        double EC, EP, TP, promedio;
        String estado;
        //Datos de Entrada
        System.out.println("Ingrese la nota de el examen de conocimientos:");
        EC=leerTeclado.nextDouble();
        System.out.println("Ingrese Nota de la entrevista persona:");
        EP=leerTeclado.nextDouble();
        System.out.println("Ingrese Nota del test psicologico:");
        TP=leerTeclado.nextDouble();
        //Proceso
        promedio=EC*0.4+EP*0.25+TP*0.35;
        /* >=17 y <=20 Se encuentra en el nivel 4; <17 y >=14 Se encuentra en el nivel 3; <14 y >=11 Se encuentra en el nivel 2; <11 Pierde  la vacante y se encontraria en el nivel 1; */
        if (promedio>=17 && promedio<=20) {
            estado="\n\nAprobo \n\tSe encuentra en el nivel 4";
        }else if(promedio<17 && promedio>=14){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 3";
        }else if(promedio<14 && promedio>=11){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 2";
        }else if(promedio<11){
            estado="\n\nDesaprobo y pierde la vacante \n\tSe encuentra en el nivel 1";
        }else{
            estado="\n\nDesaprobado";
        }
        //Datos de salida
        System.out.println(estado);
    }
    
    public static void pregunta2JAQH() {
        //Definir variables
        double precio, descuento, igv, total, PF;
        String estado;
        //Datos de entrada
        System.out.println("Ingrese el precio del articulo: ");
        precio=leerTeclado.nextDouble();
        //Proceso
        total=precio-descuento;
        igv=total*0.18;
        PF=total+igv;
        if (precio>=2000){
            estado=precio*0.10;
        }else if (precio>1000 && precio<2000){
            estado=precio*0.05;
        }else if (precio>=500 && precio<1000){
            estado=precio*0.02;
        }else{
            estado=precio*0;
        }
        //Datos de salida
        System.out.println(igv);
        System.out.println(estado);
        System.out.println(PF);
    }
    public static void pregunta3JAQH() {
        
    }
    }
}
