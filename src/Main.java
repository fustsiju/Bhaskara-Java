import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Fulvio Stefanine\\Desktop\\teste\\dados.txt");
            Scanner scanner = new Scanner(file);
            float a, b, c, d, x1, x2;
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            d = (b*b) - (4*a*c);
            if (d < 0) {
                System.out.println("Impossivel calcular");
            } else {
                x1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(d)) / (2 * a));
                System.out.println("S: {" + x1 + "," + x2 + "}");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            //e.printStackTrace();
        }
    }
}