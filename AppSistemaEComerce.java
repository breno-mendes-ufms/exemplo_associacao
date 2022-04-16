public class AppSistemaEComerce {
    public static void main(String[] args) {

        // cadastro de produtos - Estoque
        Estoque estoque = new Estoque();

        estoque.addProduto(555, 50f, "arduinoNano", 50, "a-10");
        estoque.addProduto(556, 70f, "arduinoUno", 50, "a-11");
        

        estoque.status();

    

    }
}
