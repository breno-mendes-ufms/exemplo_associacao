public class Produto {

    int codProduto;
    float valor;
    String descProduto;
    
    public Produto(int codProduto, float valor, String descProduto) {
        this.codProduto = codProduto;
        this.valor = valor;
        this.descProduto = descProduto;
      }

    public void status() {
        System.out.println("Produto [codProduto=" + codProduto + ", descProduto=" + descProduto +  ", valor=" + valor + "]");
    }

    
}
