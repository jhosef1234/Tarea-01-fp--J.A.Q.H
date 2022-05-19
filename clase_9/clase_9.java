package clase_9;

import java.util.Scanner;

/**
 * clase_9
 */
public class clase_9 {
    static Scanner leerT=new Scanner(System.in);

    public static long factorialN(int numero) {
        long resultado=1;
        if (numero>1) {
            for (int i = 1; i <= numero; i++) {
                resultado=resultado*i;
            }
            }  
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese un numero:");
        int num=leerT.nextInt();
        for (int i = 0; i <=num; i++) {
            System.out.println("Factorial de "+ i+" es:"+factorialN(i));
        }
    }  
}        

