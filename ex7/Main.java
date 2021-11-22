import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite a diagonal maior e menor ");
    double Diagonal1 = leitor.nextDouble();
    double Diagonal2 = leitor.nextDouble();
    double AreaLosang;
    AreaLosang = (Diagonal1 * Diagonal2) / 2;
    System.out.println("Area do Losango: " + AreaLosang);
  }
}
