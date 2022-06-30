/*A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral*/
package Q20;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean condicao = true;
        Carro carro = new Carro();
        Scanner scan = new Scanner(System.in);
        int c2000 = 0;
        int ctotal = 0;
        char v;
        while (condicao == true) {
            System.out.println("Ano do veiculo:");
            carro.setAno(scan.nextInt());
            if (carro.getAno() <= 2000) {
                c2000++;
            }
            ctotal++;
            System.out.println("Valor: ");
            carro.setValor(scan.nextFloat());
            System.out.printf("Desconto: R$:%.2f\n", carro.Desconto());
            System.out.printf("Valor Final: R$:%.2f\n", carro.ValorFinal());
            System.out.println("Deseja verificar outro desconto?[s/n]:");
            v = scan.next().charAt(0);
            if (v != 's' && v != 'S') {
                condicao = false;
            }
        }
        System.out.println("Carros até anos 2000: " + c2000);
        System.out.println("total de carros: " + ctotal);
    }
}
