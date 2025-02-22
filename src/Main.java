import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sumaMes = 0;
        long valorMeces = 1000;
        System.out.println("introduce la cantidad de meces");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("El valor del mes " + (i+1) + " es de " + valorMeces);
            valorMeces *= 2;
            sumaMes += valorMeces;
        }
        System.out.println("El coste total por " + n + " meces es de " +sumaMes);

    }
}