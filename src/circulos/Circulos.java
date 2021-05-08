
package circulos;
import java.util.Scanner;
public class Circulos {
    
    public static void main(String[] args) {
        // Se declara un nuevo objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        double radio;
        int valor;
        
        
       System.out.println("Bienvenido a circulos");
        System.out.println("El programa mostrara los metodos disponibles para un circulo ");
          System.out.println("Metodo 1 = Area");
          System.out.println("Metodo 2 = Perimetro");
          System.out.println("Metodo 3 = Area y Perimetro");
          System.out.println("Introduzca el numero del metodo que quiere realizar");
           valor = sc.nextInt();
            sc.nextLine();
         System.out.println("Introduzca el valor que tendra el radio");
          radio = sc.nextDouble();
           sc.nextLine();
           
          circulos_1 cir = new circulos_1(radio); 
         
          switch(valor){
            case 1: cir.Area(radio);       break; 
            case 2: cir.Perimetro(radio);  break;  
            case 3:  cir.Area(radio);cir.Perimetro(radio);  break; 
            default:  System.out.println("Ingresaste un valor incorrecto"); break;    
            
        }
          System.out.println("Nueva Rama 1");
    }
 
   
    
}
