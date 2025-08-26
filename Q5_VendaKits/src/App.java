public class App {
    public static void main(String[] args) {
        VendasFachada fachada = new VendasEmMemoria();

        System.out.println("Produtos disponíveis:");
        for (ProdutoComponent p : fachada.buscarProdutos()) {
            System.out.printf("%d - %s (%.2f)%n", p.getId(), p.getNome(), p.getPreco());
        }

        Venda venda = fachada.iniciarVenda();
        fachada.registrarVenda(venda, 1, 2); // 2 canetas
        fachada.registrarVenda(venda, 4, 1); // 1 kit estudante (com desconto)

        System.out.println("\n" + fachada.emitirComprovante(venda));
    }
}
