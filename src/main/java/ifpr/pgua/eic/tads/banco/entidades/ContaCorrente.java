package ifpr.pgua.eic.tads.banco.entidades;

public class ContaCorrente extends Conta
{
    public ContaCorrente(String agencia, String numero, Pessoa cliente, double saldo, double limite) 
    {
        super(agencia, numero, cliente, saldo);
        this.limite=limite;
    }

    private double limite;

    public double getLimite() 
    {
        return limite;
    }

    public void setLimite(double limite) 
    {
        this.limite = limite;
    }

    @Override
    public String gerarExtrato()
    {
        String texto="";

        texto=super.gerarExtrato();
        texto=texto+" limite: " + limite;
            
        return texto;
    }

    @Override
    public String sacar(double valor)
    {
        if(valor < 0)
        {
            return "Valor Inválido!";
        }        

        if(valor > saldo+limite)
        {
            return "Saldo Insuficiente";
        }

        saldo = saldo-valor;
        return "Saldo Realizado";
    }    

    @Override
    public String tipo()
    {
        return "Conta Corrente";
    }
}