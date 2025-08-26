import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String> {
    private static LogSimples instancia;
    private List<String> mensagens;

    private LogSimples() {
        mensagens = new LinkedList<>();
    }

    public static synchronized LogSimples getInstancia() {
        if (instancia == null) {
            instancia = new LogSimples();
        }
        return instancia;
    }

    public void log(String m) {
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
