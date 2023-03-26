    import java.util.Scanner;

public class Reto4 {
    
    public static void main(String[] args) {
                Scanner lectura = new Scanner(System.in);
        String[][] catalogo = new String[16][3]; 

        

        for (int i = 0; i < 16; i++) {
            System.out.print("Ingrese el nombre del producto #" + (i+1) + ": ");
            catalogo[i][1] = lectura.nextLine();
            System.out.print("Ingrese el precio del producto #" + (i+1) + ": ");
            catalogo[i][2] = lectura.nextLine();
            catalogo[i][0] = Integer.toString(i+1); 
        }
        
        System.out.println("Catálogo de productos:");
        System.out.println("Código\tNombre\t\tPrecio");
        for (int i = 0; i < 16; i++) {
            System.out.println(catalogo[i][0] + "\t" + catalogo[i][1] + "\t" + catalogo[i][2]);
        }
    }
}


