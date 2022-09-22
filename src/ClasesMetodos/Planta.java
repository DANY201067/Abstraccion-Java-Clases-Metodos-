
package ClasesMetodos;


public class Planta extends SerVivo{//planta hereda del ser vivo

    @Override //nos permite sobreescribir el metodo abstracto de la clase padre 
    
    //implementar el metodo abstract  alimentarse 
    public void Alimentarse() {
    System.out.println("La planta se alimenta a traves de la fotosintesis");
    }
     
}
