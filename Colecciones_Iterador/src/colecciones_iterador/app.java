package colecciones_iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class app {

    public static void main(String[] args) {

        List<String> lista = new ArrayList();

        lista.add("andres");
        lista.add("fragozo");
        lista.add("rios");

        /*for (String s : lista) {

            System.out.println(s);

        }*/
        //maneja agrupaciones de objetos por ejemplo una lista
        Iterator<String> iterador = lista.iterator();

        while(iterador.hasNext()){
            
            System.out.println(iterador.next());
            
        }
    }

}
