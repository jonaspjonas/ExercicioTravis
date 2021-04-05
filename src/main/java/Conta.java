import java.util.*;

public class Conta {
    String num;
    String nome;
    double saldo;
    double especial;
    double limite;

    public Conta() {
    }

    public Conta(String num, String nome, double saldo, double especial, double limite) {
        this.num = num;
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getEspecial() {
        return especial;
    }

    public void setEspecial(double especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    Scanner sc = new Scanner(System.in);

    void saldo(Conta c){
        double total = saldo+especial;
        System.out.println("Composição do saldo");
        System.out.println("Saldo : "+saldo);
        System.out.println("Especial : "+especial);
        System.out.println("Total para saque : "+total);
    }

    void sacar(Conta c){
        double saq;
        double total = saldo+especial;
        System.out.println("Informe o valor a sacar :");
        saq = sc.nextDouble();
        if(saq <= limite && saq <= total){
            saldo -= saq;
            System.out.println("Saque efetivado");
        }else{
            System.out.println("Saldo indisponível!!");
        }
    }

    void depositar(Conta c){
        double dep;
        System.out.println("Informe o valor a depositar :");
        dep = sc.nextDouble();
        c.saldo += dep;
        System.out.println("Deposito efetivado.");
    }
}
