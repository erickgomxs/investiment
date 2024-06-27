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
    public void guardar(int valor){
    	this.saldoAtual = saldoAtual + valor;
    	System.out.printf("\nValor guardado com sucesso!");
        System.out.printf("\nSeu saldo atual: " + saldoAtual);
    }

    public void resgatar(int valor){
        this.saldoAtual = saldoAtual - valor;
        System.out.printf("\nValor resgatado com sucesso!");
        System.out.printf("\nSeu saldo atual: " + saldoAtual);
    }
}

