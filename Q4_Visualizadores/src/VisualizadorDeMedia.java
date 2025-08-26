import java.util.List;

public class VisualizadorDeMedia implements Observador {
    private List<Integer> valores;

    @Override
    public void atualizar(List<Integer> valores) {
        this.valores = valores;
        exibeMedia();
    }

    private void exibeMedia() {
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: " + media + ", quantidade de elementos: " + valores.size());
    }
}
