
public class Bhaskara {
    int a;
    int b;
    int c;
    int delta;
    float resultado_x1;
    float resultado_x2;

    public static Integer calculaBhaskara(int a, int b, int c) {
        int delta = (b*b) - (4*a*c);
        return delta;
    }
    public static Float calcula_x1(int a, int b, int delta) {
        float resultado_x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
        return resultado_x1;
    }
    public static Float calcula_x2(int a, int b, int delta) {
        float resultado_x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
        return resultado_x2;
    }
}
