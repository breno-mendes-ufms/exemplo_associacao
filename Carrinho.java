import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> listaItem = new ArrayList<Produto>();
    ArrayList<Integer> listaQuantidades = new ArrayList<Integer>();


    Pessoa pessoa;

    public Carrinho(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void addItem(int idx, int qtt) {
        listaItem.add(Estoque.produtos.get(idx));
        Estoque.quantidade.set(idx, (Estoque.quantidade.get(idx) - qtt));
        listaQuantidades.add(qtt);
        
    }

    public void status(){
        for (int i = 0; i < listaItem.size(); i++) {
            
            System.out.println("Carrinho de compras:");
            System.out.print(listaItem.get(i).descProduto);
            System.out.print(" - ");
            System.out.print(listaQuantidades.get(i));

            
        }


    }

}
