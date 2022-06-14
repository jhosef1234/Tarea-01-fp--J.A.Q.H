package pe.edu.upeu.arrays;

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

    public void vectorObjetos() {
        persona[] p=new persona[27];
        p[0].codigo="202211720";
    }

    public static void main(String[] args) {
        vectoresEjemplo objx=new vectoresEjemplo();
        objx.vectoresX();

        //new vectoresEjemplo().vectoresX();
    }
}