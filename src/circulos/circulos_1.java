
package circulos;


public class circulos_1 {
    private double radio;
    
    circulos_1(double radio){
        this.radio = radio;
    }
     public double getRadio(){return radio;}
     
     public static void Area (double radio){
        double area;
        
        area = Math.PI * Math.pow(radio,2);
        System.out.println("El area del circulo intoducido es igual a: " + area);
    }
      public static void Perimetro(double radio){
        double perimetro;
        
        perimetro = Math.PI * (radio*2);
        System.out.println("El perimetro del circulo intoducido es igual a: " + perimetro);
    }
}
