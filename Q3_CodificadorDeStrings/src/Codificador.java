public class Codificador {
    private EstrategiaCodificacao estrategia;

    // injeção da estratégia
    public Codificador(EstrategiaCodificacao estrategia) {
        this.estrategia = estrategia;
    }

    public String codifica(String str) {
        return estrategia.codifica(str);
    }

    public String decodifica(String str) {
        return estrategia.decodifica(str);
    }

    // permite trocar a estratégia em tempo de execução
    public void setEstrategia(EstrategiaCodificacao estrategia) {
        this.estrategia = estrategia;
    }
}
