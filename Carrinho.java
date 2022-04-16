import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> listaItem = new ArrayList<Produto>();

    Pessoa pessoa;

    public Carrinho(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void addItem(int idx, int qtt) {
        listaItem.add(Estoque.produtos.get(idx));
        Estoque.quantidade.set(idx, (Estoque.quantidade.get(idx) - qtt));
        
    }

}
