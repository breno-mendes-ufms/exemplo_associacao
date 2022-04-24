import java.util.ArrayList;

public class Estoque {

    static ArrayList<String> local = new ArrayList<String>();
    static ArrayList<Integer> quantidade = new ArrayList<Integer>();
    static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void addProduto(int codProduto, float valor, String descProduto, int estQtdd, String estLocal) {
        Estoque.produtos.add(new Produto(codProduto, valor, descProduto));
        Estoque.quantidade.add(estQtdd);
        Estoque.local.add(estLocal);

    }

    void status() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(Estoque.quantidade.get(i) + " | " + Estoque.produtos.get(i).codProduto + " | "
                    + Estoque.produtos.get(i).descProduto);

        }
    }

}
