package clase12_recursividad;

public class EjemploRecursividad {

    public static int factorialR(int n) {
        if (n>1) {
            return  factorialR(n-1)*n;
        }
        return 1;
    }

    public static int fibonaciR(int n) {
        if (n>1){
            return fibonaciR(n-1)+fibonaciR(n-2);
        }
        return n;
    }
    public static double potenciaR(int base, int exponente) {
        if(exponente ==0){
            return 1;
        }else if (exponente ==1) {
            return base;
        }else if (exponente < 0) {
            return potenciaR(base, exponente +1) / base;
        }else{
            return base * potenciaR(base, exponente - 1);
        }


    }
    public static void main(String[] args) {
        System.out.println(factorialR(10));
        System.out.println("fibonacci");
        System.out.println(fibonaciR(6));
        System.out.println("potenciaR");
        System.out.println(potenciaR(2, 3));
    }
}

