public class Pessoa {
    String nome;
    String idade;
    Endereco endereco;

    public void status() {
        System.out.println("Pessoa [endereco=" + endereco + ", idade=" + idade + ", nome=" + nome + "]");
    }

}
