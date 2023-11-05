import java.time.LocalDateTime;

public class Locacao {
    Carro c;
    LocalDateTime data_locacao;
    LocalDateTime data_devolucao;
    double valor;
    Cliente cliente;
    public Object dataLocacao;

    public void imprimirLocacao(){
        System.out.println("*** Locação de Veículo ***");
        System.out.println("Modelo: " + this.c.modelo);
        System.out.println("Placa: " + this.c.placa);
        System.out.println("Cor: "+ this.c.cor);
        System.out.println("Ano: "+ this.c.ano);
        System.out.println("Cliente: "+ this.cliente);
        System.out.println("Data de Locação: " + this.data_locacao.toString());
        System.out.println("Data de Devolução: "+ this.data_devolucao.toString());
        System.out.println("Valor a pagar: "+ this.valor);

    }
}
