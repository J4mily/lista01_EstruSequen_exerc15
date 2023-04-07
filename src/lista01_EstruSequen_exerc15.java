import java.util.Scanner;
/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Salário e impostos pro usuário visualizar.
* Descrição: 15.  Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o 
//Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto. quanto pagou ao INSS. Quanto pagou ao sindicato. O salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.
* Data: 07/04/2023 */

public class lista01_EstruSequen_exerc15 {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);


        System.out.println("Quando você ganha por hora?");
        double vlSal = scan.nextDouble();

        System.out.println("Quantas horas por mês você trabalha?");
        double qntHora = scan.nextDouble();

        double salarioBruto = vlSal * qntHora;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;


        System.out.println("+ Salário Bruto:  R$" + salarioBruto);
        System.out.println("- IR: R$" +  ir);
        System.out.println("- INSS: R$" +  inss);
        System.out.println("- Sindicato: R$" +  sindicato);
        System.out.println("- Salário bruto: R$" +  (salarioBruto - (ir + inss + sindicato)));

        scan.close();
    }
}
