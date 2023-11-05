public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    public Casa(String cor) {
        this.cor = cor;
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public int quantasPortasEstaoAbertas() {
        int contar = 0;
        if (porta1 != null && porta1.estaAberta()) {
            contar++;
        }
        if (porta2 != null && porta2.estaAberta()) {
            contar++;
        }
        if (porta3 != null && porta3.estaAberta()) {
            contar++;
        }
        return contar;
    }

    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Branco");

        Porta porta1 = new Porta(); 
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        minhaCasa.porta1 = porta1;
        minhaCasa.porta2 = porta2;
        minhaCasa.porta3 = porta3;

        porta1.abre();
        porta2.fecha();
        porta3.abre();

        minhaCasa.pinta("Azul");

        System.out.println("A cor da casa é " + minhaCasa.cor);
        System.out.println("Número de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
    }
}
