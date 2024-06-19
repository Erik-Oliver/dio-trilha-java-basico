import java.util.Scanner;


public class ContaTerminal {


    private String nomeCliente;
    private String agencia;
    private int numeroConta;
    private double saldo;

    public ContaTerminal (String nomeCliente, String agencia, int numeroConta){

        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;

    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o nome do titular da conta: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Por favor, informe o numero da agência: ");
        String agencia = scanner.nextLine();


        System.out.println("Por favor, informe qual o numero da conta: ");
        int numeroConta = scanner.nextInt();






        ContaTerminal contaTerminal = new ContaTerminal(nomeCliente, agencia, numeroConta);


        System.out.println("Olá " + contaTerminal.getNomeCliente() + " obrigado por criar uma conta em nosso banco, sua agência é: "
        + contaTerminal.getAgencia() + ", conta: " + contaTerminal.getNumeroConta() + " e seu saldo " + contaTerminal.getSaldo() +
                " já está disponivel para saque.");


        scanner.close();

    }



}
