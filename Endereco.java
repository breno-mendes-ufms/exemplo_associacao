
public class Endereco {

    String pais, estado, cidade, bairro, rua;
    int numero;
    String complemento;
    String cep;

    public void status() {
        System.out.println(
                "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", complemento=" + complemento
                        + ", estado=" + estado + ", numero=" + numero + ", pais=" + pais + ", rua=" + rua + "]");
    }

}
