import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Anna eläintarhalle nimi:");
        var scanner = new Scanner(System.in); 
        String eläintarha = scanner.nextLine();

        var tarha = new Zoo(eläintarha);
        
        boolean exit = false;
        while(!exit) {
            int i = 0;
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            String option = scanner.nextLine();

            try {
                i = Integer.parseInt(option);
            }
            catch (NumberFormatException e) {
                break;
            }
            switch (i) {
                case 1:
                    System.out.println("Mikä laji?");
                    String laji = scanner.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    String nimi = scanner.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    String ikä = scanner.nextLine();
                    int ikäInt = Integer.parseInt(ikä);
                    Animal animal = new Animal(laji, nimi, ikäInt);
                    tarha.addAnimal(animal);
                    break;
                case 2:
                    tarha.listAnimal();
                    break;
                
                case 3:
                    System.out.println("Kuinka monta kierrosta");
                    String kierros = scanner.nextLine();
                    int kierrosInt = Integer.parseInt(kierros);
                    tarha.runAnimals(kierrosInt);
                    break;
                
                case 0:
                    exit = true;
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                }
               
                

        }
        
        scanner.close();
        
        

    }
}
