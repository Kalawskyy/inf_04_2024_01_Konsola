import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz wyraz :");
        String pierwszyWyraz = scanner.nextLine();
        System.out.println("Liczba samogłosek w wyrazie "+pierwszyWyraz+" to "+EdytujString.zliczSamogloski(pierwszyWyraz));
        System.out.println("Wpisz wyraz z powtarzającymi się znakami obok siebie :");
        String drugiWyraz = scanner.nextLine();
        System.out.println("Poprawiony wyraz: "+EdytujString.usunPowtorzenia(drugiWyraz));
    }
}