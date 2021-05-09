
package caracteres;
import java.util.Scanner;

public class Caracteres {


    public static void main(String[] args) {  
       Scanner sc = new Scanner(System.in);
       String N;
       String Cadena = "Esto es una cadena de texto";
       char[] Caracteres ;
       
           System.out.println("Ingresa un nombre");
           N = sc.nextLine();
           int length = N.length();
           Cadena = N ;
           Caracteres = Cadena.toCharArray();
           
           for(int i=0; i<=Caracteres.length - 1; i++){ 
              System.out.println("Arreglo en el indice " + i + " es igual a: " + Caracteres[i] );
              
           }
           
    }  
}


