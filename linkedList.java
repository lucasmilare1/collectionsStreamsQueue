import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class linkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteaSerAtendido = filaBanco.poll();

        System.out.println(clienteaSerAtendido);

        System.out.println(filaBanco);

  //      filaBanco.clear();

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        String primeiroclienteOuErro = filaBanco.element();

        System.out.println(primeiroclienteOuErro);

        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println("-->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

   }
}
