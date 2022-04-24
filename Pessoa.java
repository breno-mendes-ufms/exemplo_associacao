import java.io.ObjectInputFilter.Status;

public class Pessoa {
    String nome;
    Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        
    }

    public void status() {
        System.out.println("Pessoa [endereco=" + endereco + ", nome=" + nome + "]");
        this.endereco.status();
    }

   
    

}
