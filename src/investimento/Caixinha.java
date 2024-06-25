package investimento;

public abstract class Caixinha {

    //Atributos
    public String nome;
    public double rentabilidadeAno = 0.1199;
    public double saldoAtual;


    //Construtor
    public Caixinha(String nome, double valor) {
        this.nome = nome;
        this.saldoAtual = valor;
    }


    //Metodos
    public void guardar(double valor){
        this.saldoAtual = valor + saldoAtual;
        System.out.println("Seu saldo atual: ", saldoAtual);
    }

    public void resgatar(double valor){
        this.saldoAtual = valor - saldoAtual;
        System.out.println("Seu saldo atual: ", saldoAtual);
    }
}

