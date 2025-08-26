public class App {
    public static void main(String[] args) {
        // usando codificação simples
        Codificador cod1 = new Codificador(new CodificacaoSimples());
        String msg = "ola mundo";
        String codificada = cod1.codifica(msg);
        System.out.println("Codificada (simples): " + codificada);
        System.out.println("Decodificada: " + cod1.decodifica(codificada));

        // trocando para codificação por deslocamento
        cod1.setEstrategia(new CodificacaoDesloca());
        codificada = cod1.codifica(msg);
        System.out.println("Codificada (desloca): " + codificada);
        System.out.println("Decodificada: " + cod1.decodifica(codificada));
    }
}

