import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite 3 das suas notas");
    float num1 = leitor.nextFloat();
    float num2 = leitor.nextFloat();
    float num3 = leitor.nextFloat();
    float mult = (num1 + num2 + num3) / 3;
    System.out.println("Resultado " + mult);
  }
}
