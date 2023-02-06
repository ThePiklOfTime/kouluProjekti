import java.util.ArrayList;

public class Zoo {
   
    private ArrayList<Animal> lista = new ArrayList<Animal>();



    public Zoo() {}

    public void addAnimal(Animal eläin) {
        this.lista.add(eläin);
    }
    public void listAnimal(){
        for (Animal eläin : this.lista) {
          System.out.println(eläin);  
        }
    }
    public void runAnimals(){
        
    }

 
}
