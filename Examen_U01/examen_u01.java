package Examen_U01;

import java.util.Scanner;

/**
 * ExamenU1
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
            estado="\n\nAprobo \n\tSe encuentra en el nivel 4 y alcansa una vacante";
        }else if(promedio<17 && promedio>=14){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 3 y alcansa una vacante";
        }else if(promedio<14 && promedio>=11){
            estado="\n\nAprobo \n\tSe encuentra en el nivel 2 y alcansa una vacante";
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
        //Datos de entrada
        System.out.println("Ingrese el precio del articulo: ");
        precio=leerTeclado.nextDouble();
        //Proceso
        if (precio>=2000){
            descuento=precio*0.10;
        }else if (precio>1000 && precio<2000){
            descuento=precio*0.05;
        }else if (precio>=500 && precio<1000){
            descuento=precio*0.02;
        }else{
            descuento=precio*0;
        }
        total=precio-descuento;
        igv=total*0.18;
        PF=total+igv;
        //Datos de salida
        System.out.println("El igv total es: "+igv);
        System.out.println("El descuento total es :"+descuento);
        System.out.println("El total a pagar es :"+PF);
    }
    public static void pregunta3JAQH() {
        //Definir variables
        double num1, num2, total,signo; 
        //Datos de entrada
        System.out.println("ingrese el primer numero");
        num1=leerTeclado.nextDouble();
        System.out.println("ingrese el segundo numero");
        num2=leerTeclado.nextDouble();
        System.out.println("1 = (+=suma) \n2 = (-=resta) \n3 = (*=multiplicacion) \n4 = (/=division) \n5 = (R=raiz) \n6 = (^=potencia) \n7 = (%=modulo de 2) \ningrese el signo: ");
        signo=leerTeclado.nextDouble();
        //Proceso
        if (signo==1) {
            total=num1+num2;
        }else if (signo==2) {
            total=num1-num2;
        }else if (signo==3) {
            total=num1*num2;
        }else if (signo==4) {
            total=num1/num2;
        }else if (signo==5) {
            total=Math.pow(num1,0.5);   
        }else if (signo==6) {
            total=Math.pow(num1,num2);
        }else{
            total=num1%num2;
        }
        //Datos de salida
        System.out.println("el resusltado es: "+total);
    }
    public static void pregunta4JAQH() {
        //Definir variables
        double anho;
        String mensaje, genero;
        //Datos de entrada
        System.out.println("ingrese la cantidad de años: ");
        anho=leerTeclado.nextDouble();
        System.out.println("ingrese el genero (masculino o femenino): ");
        genero=leerTeclado.next();
        //Proceso
        if (anho>=70) {
            mensaje=("su vauna es de tipo C");
        }else if (anho>=16 && anho<=69 && genero=="masculino") {
            mensaje=("su vacuna es de tipo A");
        }else if (anho>=16 && anho<=69 && genero=="femenino") {
            mensaje=("su vacuna es de tipo B");
        }else{
            mensaje=("vacuna de tipo A");
        }
        //Datos de salida
        System.out.println(mensaje);
    }
    public static void main(String[] args) {
        //Definir variable
        int numero;
        System.out.println("ingrese el numero del ejercicio que desa ejecutar");
        numero=leerTeclado.nextInt();
        switch (numero) {
            case 1:pregunta1JAQH(); break;
            case 2:pregunta2JAQH(); break;
            case 3:pregunta3JAQH(); break;
            case 4:pregunta4JAQH(); break;
        
            default: break;
        }
        
    }
}

