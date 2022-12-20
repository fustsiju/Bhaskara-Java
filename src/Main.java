import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Bhaskara bhaskara = new Bhaskara();
       int delta = bhaskara.calculaBhaskara(3, -15, 12);
        System.out.println(bhaskara.calcula_x1(3, -15, delta));
        System.out.println(bhaskara.calcula_x2(3, -15, delta));
    }
}