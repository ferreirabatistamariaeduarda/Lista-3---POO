public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta() {
        this.aberta = false; 
        this.cor = "Branco"; 
        this.dimensaoX = 80.0; 
        this.dimensaoY = 200.0;
        this.dimensaoZ = 4.0;
    }

    public void abre() {
        aberta = true;
    }

    public void fecha() {
        aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return aberta;
    }

    public static void main(String[] args) {
        Porta minhaPorta = new Porta();

        System.out.println("A porta está aberta? " + minhaPorta.estaAberta());

        minhaPorta.abre();
        System.out.println("A porta está aberta? " + minhaPorta.estaAberta());

        minhaPorta.fecha();
        System.out.println("A porta está aberta? " + minhaPorta.estaAberta());

        minhaPorta.pinta("Azul");
        System.out.println("A cor da porta é: " + minhaPorta.cor);

        minhaPorta.dimensaoX = 90.0;
        minhaPorta.dimensaoY = 210.0;
        minhaPorta.dimensaoZ = 5.0;
        System.out.println("Dimensões da porta: " + minhaPorta.dimensaoX + "x" + minhaPorta.dimensaoY + "x" + minhaPorta.dimensaoZ);
    }
}
