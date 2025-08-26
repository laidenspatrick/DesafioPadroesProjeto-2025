import java.util.ArrayList;
import java.util.List;
import java.util.Random;


interface IDado {
    void rolar();
    int getValor();
}

class Dado implements IDado {
    private int lados;
    private int valorJogada;
    private final Random random;

    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    @Override
    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    @Override
    public int getValor() {
        return valorJogada;
    }
}

abstract class DadoDecorator implements IDado {
    protected IDado dado;

    public DadoDecorator(IDado dado) {
        this.dado = dado;
    }

    @Override
    public void rolar() {
        dado.rolar();
    }

    @Override
    public int getValor() {
        return dado.getValor();
    }
}

class DadoComHistorico extends DadoDecorator {
    private List<Integer> historico;

    public DadoComHistorico(IDado dado) {
        super(dado);
        historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        super.rolar();
        historico.add(dado.getValor());
    }

    public List<Integer> getHistorico() {
        return new ArrayList<>(historico);
    }
}