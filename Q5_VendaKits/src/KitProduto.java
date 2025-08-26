import java.util.ArrayList;
import java.util.List;

public class KitProduto implements ProdutoComponent {
    private int id;
    private String nome;
    private List<ProdutoComponent> itens;

    public KitProduto(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto borracha) {
        itens.add((ProdutoComponent) borracha);
    }

    public List<ProdutoComponent> getItens() {
        return itens;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double soma = 0.0;
        for (ProdutoComponent item : itens) {
            soma += item.getPreco();
        }
        return soma * 0.9; // aplica desconto de 10%
    }
}

