
package ClasesMetodos;


public class Principal {
   
    public static void main(String[] args) {
       /*SerVivo servivo = new SerVivo();//no se puede instanciar no se puede
        crear objetos de esta clase SerVivo */
        
       Planta  planta = new Planta();//creamos un objeto de la clase Planta 
       AnimalCarnivoro animalc = new AnimalCarnivoro();//creamos un objeto de la clase AnimalCarnivoro
       AnimalHerbivoro animalh = new AnimalHerbivoro();
      

       planta.Alimentarse();
       animalc.Alimentarse();
       animalh.Alimentarse();
       
    }
}
