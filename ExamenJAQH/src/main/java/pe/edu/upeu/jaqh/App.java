package pe.edu.upeu.jaqh;

import java.util.Scanner;

import pe.edu.upeu.jaqh.Examen.ResoluciondeExamen;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner leerT=new Scanner(System.in);

        System.out.println("Ponga el numero del ejercicio(2-5)");
        int n=leerT.nextInt();
        switch (n) {
            case 2: new ResoluciondeExamen().ejercicio_2(); break;
            case 3: new ResoluciondeExamen().ejercicio_3(); break;
            case 4: new ResoluciondeExamen().ejercicio_4(); break;
            case 5: new ResoluciondeExamen().ejercicio5_1();; break;
        
            default: System.out.println("Este ejercicio no existe"); break;
        }
    }
}
