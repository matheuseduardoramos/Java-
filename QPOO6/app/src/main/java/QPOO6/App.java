/*
Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de inform�tica para 
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informa��es 
como atributos:
a. o n�mero do item faturado,
b. a descri��o do item,
c. a quantidade comprada do item e
d. o pre�o unit�rio do item
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade n�o for positiva, ela 
deve ser configurada como 0. Se o pre�o por item n�o for positivo ele deve ser configurado como 0.0. 
Forne�a os m�todos getters e setters para cada vari�vel de inst�ncia. Al�m disso, forne�a um m�todo 
chamado getInvoiceAmount que calcula o valor da fatura (isso �, multiplica a quantidade pelo pre�o por 
item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as 
capacidades da classe Invoice.

 */
package QPOO6;

public class App {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(1, "Mouse", 5, 15.99f);
        System.out.printf("Produto: %s\nValor total: R$%.2f",invoice.getDescricao(), invoice.getInvoiceAmount());
    }
}
