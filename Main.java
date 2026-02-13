import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


       double total = 0.00;
       double salario = 0.00;
       double salFinal = 0.00;
       double comissao = 0.00;
       String nome = "";


       System.out.println("Qual o nome do cidadão: ");
       nome = scan.nextLine();
       System.out.println("Qual o salario fixo:  ");
       salario = scan.nextDouble();
       System.out.println("Total de vendas : ");
       total = scan.nextDouble();


       comissao = total * 0.15;
       salFinal = salario + comissao;
       System.out.println("O salario  total do funcionario" + nome + "é R$ " + salFinal);


   }
}
