public class App {
    public static void main(String[] args) {
        // Dado normal
        IDado dadoNormal = new Dado(6);

        // Dado decorado com histórico
        IDado dadoComHistorico = new DadoComHistorico(new Dado(6));

        System.out.println("Jogadas com dado normal:");
        for (int i = 0; i < 3; i++) {
            dadoNormal.rolar();
            System.out.println("Valor: " + dadoNormal.getValor());
        }

        System.out.println("\nJogadas com dado com histórico:");
        DadoComHistorico dch = (DadoComHistorico) dadoComHistorico;
        for (int i = 0; i < 5; i++) {
            dch.rolar();
            System.out.println("Valor: " + dch.getValor());
        }

        System.out.println("\nHistórico do dado decorado: " + dch.getHistorico());
    }
}
