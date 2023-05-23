package ifpr.pgua.eic.tads.banco;

import ifpr.pgua.eic.tads.banco.entidades.ContaPoupanca;
import ifpr.pgua.eic.tads.banco.entidades.ContaCorrente;
import ifpr.pgua.eic.tads.banco.entidades.Pessoa;

public class AppTest
{

    public static void main(String[] args)
    {
        Pessoa ze =new Pessoa("Zé", "0123", 25, 500);
        Pessoa chico = new Pessoa("Chico", "4567", 35, 1000);

        ContaPoupanca poupanca = new ContaPoupanca("123", "009988", chico, 100, 0.05);

        ContaCorrente corrente= new ContaCorrente("123", "1000156", ze, 100, 100);

        System.out.println(poupanca.gerarExtrato());
        System.out.println(corrente.gerarExtrato());

        poupanca.setTxRendimento(0.00001);

        String retPoupanca=poupanca.sacar(200);
        String retContaCorrente=corrente.sacar(99);

        System.out.println(retPoupanca);
        System.out.println(retContaCorrente);

        System.out.println(poupanca.tipo());
        System.out.println(corrente.tipo());
    }




}

