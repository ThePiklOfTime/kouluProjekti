import java.util.ArrayList;

public class Zoo {
   public String name;
    private ArrayList<Animal> lista = new ArrayList<Animal>();



    public Zoo(String nimi) {
        this.name = nimi;
    }

    public void addAnimal(Animal eläin) {
        this.lista.add(eläin);
    }
    public void listAnimal(){
        for (Animal eläin : this.lista) {
          System.out.println(eläin.laji + ":" + eläin.nimi + "." + eläin.ikä + " vuotta");  
        }
    }
    public void runAnimals(int times){
        for (Animal animal : this.lista) {
            for(int i = 0; i < times; i++) {
                 String na = animal.nimi;
                 System.out.println(na +" juoksee kovaaa vauhtia!");
            }
        }
    }

 
}
