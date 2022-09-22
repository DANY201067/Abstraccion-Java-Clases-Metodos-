
package ClasesMetodos;


public  class AnimalHerbivoro extends Animal {//la clase AnimalHerbivoro hereda de Animal
    
    @Override //nos permite sobreescribir el metodo abstracto de la clase padre
    
    //implementar el metodo abstract  alimentarse 
    public void Alimentarse(){
        System.out.println("El animal herbivoro se alimenta de hierva");
    }
}
