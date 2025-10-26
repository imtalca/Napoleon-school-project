import java.util.Scanner;

public class Napoleon {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String noms = "Napoleon Bonaparte Bill Gates Claudia Schiffer Martina Hingis ";
        System.out.print("Enter a name : ");
        String prenom = scanner.nextLine();
        int initPosit = noms.indexOf(prenom);

        int startNom = noms.indexOf(' ', initPosit) + 1;
        int endNom = noms.indexOf(' ', startNom);


        String nom = noms.substring(startNom, endNom);

        System.out.println(nom);
    }
}

