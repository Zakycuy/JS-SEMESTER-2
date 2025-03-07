import java.util.Scanner;

public class CarPlateLookup {
    public static void main(String[] args) {
        char[] CODE = {'A', 'B', 'D', 'E', 'F', 'T', 'Z', 'N', 'L', 'M'};
        String[][] CITY = {
            {"A", "Jakarta"},
            {"B", "Bandung"},
            {"D", "Surabaya"},
            {"E", "Yogyakarta"},
            {"F", "Semarang"},
            {"T", "Bogor"},
            {"Z", "Malang"},
            {"N", "Medan"},
            {"L", "Bali"},
            {"M", "Makassar"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car plate code: ");
        char inputCode = scanner.next().charAt(0);

        boolean found = false;
        for (String[] city : CITY) {
            if (city[0].charAt(0) == inputCode) {
                System.out.println("City: " + city[1]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Code not found!");
        }
        scanner.close();
    }
}
