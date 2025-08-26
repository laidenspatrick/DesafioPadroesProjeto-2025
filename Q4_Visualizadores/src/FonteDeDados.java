import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados {
    private List<Integer> lst;
    private List<Observador> observadores;

    public FonteDeDados() {
        lst = new LinkedList<>();
        observadores = new ArrayList<>();
    }

    public void add(Integer value) {
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificarObservadores();
    }

    public int quantidade() {
        return lst.size();
    }

    public List<Integer> getValores() {
        return new ArrayList<>(lst);
    }

    public void registrarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }

    private void notificarObservadores() {
        for (Observador obs : observadores) {
            obs.atualizar(getValores());
        }
    }
}
