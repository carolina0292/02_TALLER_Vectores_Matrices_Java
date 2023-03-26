    import java.util.Scanner;
public class Reto1 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de números a verificar: ");
        n = lectura.nextInt();
        int[] numeros = new int[n];
        int contador = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = lectura.nextInt();
            if (numeros[i] % 2 == 0) {
                
            }
        }
        if (contador == n) {
            System.out.println("Todos los números ingresados son múltiplos de 2.");
        } else {
            System.out.println("No todos los números ingresados son múltiplos de 2.");
        }
    }
}

