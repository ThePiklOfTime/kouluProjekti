import java.util.ArrayList;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Anna eläintarhalle nimi:");
        var x = new Animal("kani", "jäbä", 12);
        try (var scanner = new Scanner(System.in)) {
            String eläintarha = scanner.nextLine();
            System.out.println(eläintarha);
        }
        
        

    }
}
