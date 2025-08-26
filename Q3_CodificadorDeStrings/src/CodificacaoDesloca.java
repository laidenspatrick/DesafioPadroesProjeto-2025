public class CodificacaoDesloca implements EstrategiaCodificacao {
    @Override
    public String codifica(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for (int i = 0; i < aux.length; i++) {
            resp[i] = (char)(aux[i] + 1);
        }
        return new String(resp);
    }

    @Override
    public String decodifica(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for (int i = 0; i < aux.length; i++) {
            resp[i] = (char)(aux[i] - 1);
        }
        return new String(resp);
    }
}
