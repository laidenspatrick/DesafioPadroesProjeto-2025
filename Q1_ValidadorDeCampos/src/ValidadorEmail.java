public class ValidadorEmail implements Validador {
    @Override
    public boolean valida(String valor) {
        int posA = valor.indexOf('@');
        int posPt = valor.indexOf('.');
        return !(posA <= 0 || posPt <= 0);
    }
}