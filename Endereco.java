
public class Endereco {

    String pais, estado, cidade, bairro, rua;
    int numero;
    String complemento;
    String cep;

    public Endereco(String pais, String estado, String cidade, String bairro, String rua, int numero,
            String complemento, String cep) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public void status() {
        System.out.println(
                "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", complemento=" + complemento
                        + ", estado=" + estado + ", numero=" + numero + ", pais=" + pais + ", rua=" + rua + "]");
    }

}
