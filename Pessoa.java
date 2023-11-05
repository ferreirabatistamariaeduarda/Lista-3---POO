public class Pessoa {

    String nome;
    int idade;    

public void fazAniversario(){
    idade++;
}

public void imprimirIdade(){
    System.out.println(nome + " tem " + idade + " anos.");
}

public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}

public static void main(String[] args) {
    Pessoa p = new Pessoa("", 1);

    p.fazAniversario();
    p.imprimirIdade();

    }
}