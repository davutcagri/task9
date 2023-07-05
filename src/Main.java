import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tersten yazılmasını istediğiniz metni girin: ");
        String text = scanner.nextLine();

        for(int i = text.length() -1; i > -1; i--) {
            System.out.print(text.charAt(i));
        }
    }
}