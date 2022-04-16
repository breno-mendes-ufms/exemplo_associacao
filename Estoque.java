import java.util.ArrayList;

public class Estoque {

    ArrayList<String> local = new ArrayList<String>();
    ArrayList<Integer> quantidade = new ArrayList<Integer>();
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void addProduto(int codProduto, float valor, String descProduto, int estQtdd, String estLocal) {
        this.produtos.add(new Produto(codProduto, valor, descProduto));
        this.quantidade.add(estQtdd);
        this.local.add(estLocal);

    }

    void status(){
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(this.quantidade.get(i) + " | " + this.produtos.get(i).codProduto + " | " + this.produtos.get(i).descProduto);
            
        }
    }

}
