import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Infome seu peso em kg: ");
    double peso = leitor.nextDouble();
    peso = peso * 1000;
    System.out.println("Peso em gramas: " + peso);
  }
}
