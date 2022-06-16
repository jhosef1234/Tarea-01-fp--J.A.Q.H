package pe.edu.upeu.arrays;

import java.util.Scanner;

import pe.edu.upeu.modelo.persona;

/**
 * vectoresEjemplo
 */
public class vectoresEjemplo {

    public void vectoresX() {
        int edades[]=new int[10];
        edades=new int[12];
        edades[0]=20;
        edades[1]=18;
        edades[11]=30;
        System.out.println("Edades");
        System.out.println("Indice 0:"+edades[0]);
        System.out.println("Indice 11:"+edades[11]);
        //forma dos
        System.out.println("Forma dos");
        int edadesX[]={20,18,30,40,16};
        System.out.println(edadesX.length);
        System.out.println("Indice 0:"+edadesX[0]);
        System.out.println("Indice 4:"+edadesX[4]);
    }

    /*public void vectorObjetos() {
        persona[] p=new persona[27];
        p[0]=new persona("43631917", "David", false);
        p[26]=new persona("202211720", "jhosef", false);
        System.out.println(p[26].nombres);

        persona[] pp={
            new persona("202012374", "Alejo Castillo Cristhian Brandonlyn	", true),
            new persona("202212437", "ARCE MAYTA EFRAIN NAYDER	", true),
            new persona("202212436", "ARCE MAYTA Daniel	", true),
            new persona("202212435", "ARCE MAYTA Michael	", true),
            new persona("202212434", "ARCE MAYTA Yesenia	", true),
        };
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < pp.length; i++) {
            System.out.print(pp[i].codigo+"\t"+pp[i].nombres+"\t");
            System.out.println("presente");
            pp[i].asistencia=sc.nextBoolean();
            System.out.println("");
            
        }

        System.out.println("***************Registro Asistencia**********");
        for (int i = 0; i < pp.length; i++) {
            System.out.println(pp[i].codigo+"\t"+pp[i].nombres+"\t"+pp[i].asistencia);
        }
        
    } */

    public static void main(String[] args) {
        vectoresEjemplo objx=new vectoresEjemplo();
        objx.vectoresX();
        //objx.vectorObjetos();
        //new vectoresEjemplo().vectoresX();
    }
}