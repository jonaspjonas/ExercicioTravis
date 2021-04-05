import java.text.SimpleDateFormat;
import java.util.*;

public class MainConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date data = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        Conta c1 = new Conta();
        c1.setNum("111");
        c1.setSaldo(0);
        c1.setLimite(500);
        c1.setEspecial(1000);

        System.out.println(sd.format(data));
        System.out.println("Informe seu nome:");
        c1.setNome(sc.nextLine());
        System.out.println("Bem vindo: "+c1.getNome());
        int op = -1;
        while (op != 0) {
            System.out.println("Escolha uma opção:"+"\n1 - Saldo\n2 - Saque\n3 - Deposito\n0 - Sair");
            op = sc.nextInt();

            switch(op){
                case 1:
                    System.out.println("====================");
                    c1.saldo(c1);
                    System.out.println("====================");
                    break;
                case 2:
                    System.out.println("====================");
                    c1.sacar(c1);
                    System.out.println("====================");
                    break;
                case 3:
                    System.out.println("====================");
                    c1.depositar(c1);
                    System.out.println("====================");
                    break;
                default:System.out.println("Opção inválida");
                    break;
                case 0:
                    System.out.println("====================");
                    System.out.println("Volte sempre ;)");
                    System.out.println("====================");

            }
        }

    }
}
