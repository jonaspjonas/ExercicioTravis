import org.junit.jupiter.api.Test;

public class Testes {
    @Test
    public void testSetNum() {
        System.out.println("setNum");
        String num = "";
        Conta instance = new Conta();
        instance.setNum(num);
    }


    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Conta instance = new Conta();
        instance.setNome(nome);
    }

    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Conta instance = new Conta();
        double expResult = 0.0;
        double result = instance.getSaldo();
    }

    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 0.0;
        Conta instance = new Conta();
        instance.setSaldo(saldo);
    }

    @Test
    public void testGetEspecial() {
        System.out.println("getEspecial");
        Conta instance = new Conta();
        double expResult = 0.0;
        double result = instance.getEspecial();
    }

    @Test
    public void testSetEspecial() {
        System.out.println("setEspecial");
        double especial = 0.0;
        Conta instance = new Conta();
        instance.setEspecial(especial);
    }

    @Test
    public void testGetLimite() {
        System.out.println("getLimite");
        Conta instance = new Conta();
        double expResult = 0.0;
        double result = instance.getLimite();
    }

    @Test
    public void testSetLimite() {
        System.out.println("setLimite");
        double limite = 0.0;
        Conta instance = new Conta();
        instance.setLimite(limite);
    }

    @Test
    public void testSaldo() {
        System.out.println("saldo");
        Conta c = null;
        Conta instance = new Conta();
        instance.saldo(c);
    }
}
