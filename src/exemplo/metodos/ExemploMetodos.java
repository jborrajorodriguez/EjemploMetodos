
package exemplo.metodos;

import java.util.Scanner;

public class ExemploMetodos {
    
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();//crear objecto
        Scanner teclado=new Scanner(System.in);
        rectangulo.amosar();
        System.out.println("Escribe la base del rectángulo");
        float base= teclado.nextFloat();
        System.out.println("Escribe la altura del rectángulo");
        float altura=teclado.nextFloat();
        Rectangulo rectangulo2=new Rectangulo(base,altura);
        rectangulo2.amosar();
        rectangulo2.calcularArea(base, altura);
//        float perimetro=rectangulo2.calcularPerimetro(base, altura);
//        System.out.println("perimetro = "+perimetro);
//        Tamen se pode facer desta outra forma
        System.out.println("perimetro = "+rectangulo2.calcularPerimetro(base, altura));
        rectangulo2.setbase(10);
        rectangulo2.amosar();
        //Se puede realizar de forma mas resumida.
        //rectangulo2.getaltura();
        //float mostrarAltura=rectangulo2.getaltura();
        //System.out.println("Altura"+mostrarAltura);
        System.out.println("Altura = "+rectangulo2.getaltura());
    
        
    }
    
}
