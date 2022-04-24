
public class Endereco {

    String pais, estado, cidade, bairro, rua;
    int numero;
    String complemento;
    String cep;

    public Endereco(String cep, int numero, String complemento) {
      
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;


        this.completarComCEP(cep);
    }

   

    public void completarComCEP(String cep) {

        this.pais = "Completou automaticamente";
        this.estado = "Completou automaticamente";
        this.cidade = "Completou automaticamente";
        this.bairro = "Completou automaticamente";
        this.rua = "Completou automaticamente";

    
    }



     void status() {
System.out.println( "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", complemento=" + complemento
                + ", estado=" + estado + ", numero=" + numero + ", pais=" + pais + ", rua=" + rua + "]");
    }
}
