public class AppSistemaEComerce {
    public static void main(String[] args) {

        // cadastro de produtos - Estoque
        Estoque estoque = new Estoque();

        estoque.addProduto(555, 50f, "arduinoNano", 50, "a-10");
        estoque.addProduto(556, 70f, "arduinoUno", 50, "a-11");


        estoque.status();

        // cadastro pessoa

        //Endereco endCliente = new Endereco("Brasil", "ms", "cg", "bairro", "rua", 100, "casa 2", "79 797 - 979");
        Pessoa cliente  = new Pessoa("joao", 20, new Endereco("Brasil", "ms", "cg", "bairro", "rua", 100, "casa 2", "79 797 - 979"));


    

    }
}
