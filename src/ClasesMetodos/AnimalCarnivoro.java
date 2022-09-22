
package ClasesMetodos;


public  class AnimalCarnivoro extends Animal {//la clase AnimalCarnivoro hereda de animal 
    
    @Override //nos permite sobreescribir el metodo abstracto de la clase padre
    
    public void Alimentarse(){//implementamos el metodo abstracto alimentarse
        System.out.println("El animal carnivoro se alimenta de carne"); 
    }
}
