
package exemplo.metodos;

public class Rectangulo {

    private float base,altura;
    
    //constructor
    
    public Rectangulo(){
        
    }
    public Rectangulo (float ba,float al){
        base=ba;
        altura= al;   
   
    }
    
    //Metodos de acceso
    public void setbase(float ba){
        base=ba;
    }
    public float getbase(){
     return base;   
    }
    
    public void setaltura(float al){
        altura=al;
    }
    public float getaltura(){
        return altura;
    }
    public void amosar(){
        System.out.println("base = "+base+"altura = "+altura);
    }
    
    public void calcularArea(float ba,float al){
        float calcularArea = ba * al;
        System.out.println("Area del rectangulo = "+calcularArea);    
    }
    
    public float calcularPerimetro(float ba,float al){
        float calcularPerimetro= 2*ba +2*al;
        return calcularPerimetro;
    }
    public String visualizar(){
        return ("base = "+base + "\naltura = "+altura);
    }
    
}
