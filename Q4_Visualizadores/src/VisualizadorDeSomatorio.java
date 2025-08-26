import java.util.List;

public class VisualizadorDeSomatorio implements Observador {
    private List<Integer> valores;

    @Override
    public void atualizar(List<Integer> valores) {
        this.valores = valores;
        exibeSomatorio();
    }

    private void exibeSomatorio() {
        int soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: " + soma + ", quantidade de elementos: " + valores.size());
    }
}
