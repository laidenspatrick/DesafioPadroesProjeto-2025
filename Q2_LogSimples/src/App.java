public class App {
    public static void main(String[] args) {
        LogSimples log1 = LogSimples.getInstancia();
        log1.log("Sistema iniciado");

        LogSimples log2 = LogSimples.getInstancia();
        log2.log("Usuário logado");

        LogSimples log3 = LogSimples.getInstancia();
        log3.log("Operação concluída");

        System.out.println("Mensagens do Log:");
        for (String msg : log1) {
            System.out.println(msg);
        }

        System.out.println("\nlog1 == log2 ? " + (log1 == log2)); // true
        System.out.println("log2 == log3 ? " + (log2 == log3)); // true
    }
}
