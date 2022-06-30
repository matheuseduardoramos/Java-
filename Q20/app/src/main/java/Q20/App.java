/*A concession�ria de ve�culos �CARANGO VELHO� est� vendendo os seus ve�culos com desconto. Fa�a 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de v�rios carros. O 
desconto dever� ser calculado de acordo com o ano do ve�culo. At� 2000 - 12% e acima de 2000 - 7%. O 
sistema dever� perguntar se deseja continuar calculando desconto at� que a resposta seja: �(N) N�o�. 
Informar total de carros com ano at� 2000 e total geral*/
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
        System.out.println("Carros at� anos 2000: " + c2000);
        System.out.println("total de carros: " + ctotal);
    }
}
