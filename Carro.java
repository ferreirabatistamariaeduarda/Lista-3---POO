public class Carro{
    String placa;
    String cor;
    int ano;
    String tipo_combustivel;
    int portas;
    double kilometragrem;
    String renavam;
    String chassi;
    double valor_locacao;
    Modelo modelo = new Modelo();
    Marca marca = new Marca();

    public void cadastrarCarro(String p, String c, int a, String comb, 
            int portas, double kilom, String modelo, String marca ){
                this.placa=p;
                this.ano=a;
                this.cor=c;
                this.tipo_combustivel=comb;
                this.portas=portas;
                this.kilometragrem=kilom;
                this.modelo.descricao=modelo;
                this.marca.descricao=marca;
    }
}