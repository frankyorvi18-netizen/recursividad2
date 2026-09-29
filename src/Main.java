import java.util.Scanner;
public class Main {
    public static int factorial(int n){
        //formula de recursividad

        //caso base
        if (n==1){
            return 1;

        }
        //aplicando recursividad
        return  n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner jhoel=new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO ENTERO PARA HALLAR SU RECURSIVIDAD:");
        int numero=jhoel.nextInt();
        System.out.println("El factorial del numero es :"+numero+" es el siguiente:"+factorial(numero));

    }
}