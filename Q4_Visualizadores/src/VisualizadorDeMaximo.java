import java.util.List;

public class VisualizadorDeMaximo implements Observador {
    private List<Integer> valores;

    @Override
    public void atualizar(List<Integer> valores) {
        this.valores = valores;
        exibeMaximo();
    }

    private void exibeMaximo() {
        int max = valores.stream()
            .mapToInt(Integer::intValue)
            .max()
            .orElse(0);
        System.out.println("Maximo: " + max + ", quantidade de elementos: " + valores.size());
    }
}

