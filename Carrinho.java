import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> listaItem = new ArrayList<Produto>();

    Pessoa pessoa;

    public void addItem(Produto produto, int qtt) {
        listaItem.add(produto);
       // produto.estoque.quantidade = produto.estoque.quantidade - qtt;

    }

}
