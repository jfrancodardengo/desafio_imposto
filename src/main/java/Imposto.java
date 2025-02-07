import java.util.Locale;
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double rendaAnualSalario, rendaAnualServico, rendaAnualCapital, gastosMedicos, gastosEducacionais, salarioMensal;
        double impostoSalario, impostoServico, impostoCapital, impostoTotal, maximoDedutivel, gastosDedutiveis;
        double abatimento, impostoDevido;

        System.out.println("Renda anual com salário:");
        rendaAnualSalario = sc.nextDouble();
        System.out.println("Renda anual com prestação de serviço:");
        rendaAnualServico = sc.nextDouble();
        System.out.println("Renda anual com ganho de capital:");
        rendaAnualCapital = sc.nextDouble();
        System.out.println("Gastos médicos:");
        gastosMedicos = sc.nextDouble();
        System.out.println("Gastos educacionais:");
        gastosEducacionais = sc.nextDouble();

        salarioMensal = rendaAnualSalario / 12;

        if(salarioMensal < 3000.00){
            impostoSalario = 0.00;
        } else if (salarioMensal < 5000.00) {
            impostoSalario = rendaAnualSalario * 0.1;
        } else {
            impostoSalario = rendaAnualSalario * 0.2;
        }

        System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA\n");

        impostoServico = rendaAnualServico != 0 ? rendaAnualServico * 0.15 : 0.00;
        impostoCapital = rendaAnualCapital != 0 ? rendaAnualCapital * 0.2 : 0.00;

        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n\n", impostoCapital);

        impostoTotal = impostoSalario + impostoServico + impostoCapital;
        maximoDedutivel = impostoTotal * 0.3;
        gastosDedutiveis = gastosMedicos + gastosEducacionais;

        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f\n\n", gastosDedutiveis);

        abatimento = gastosDedutiveis < maximoDedutivel ? gastosDedutiveis : maximoDedutivel;
        impostoDevido = impostoTotal - abatimento;

        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoTotal);
        System.out.printf("Abatimento: %.2f\n", abatimento);
        System.out.printf("Imposto devido: %.2f\n", impostoDevido);

        sc.close();
    }
}

