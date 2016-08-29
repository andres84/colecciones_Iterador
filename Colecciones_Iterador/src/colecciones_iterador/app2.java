package colecciones_iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class app2 {

    public static void main(String[] args) {

        
        Persona per1 = new Persona();
        per1.setNombre("andres");
        
        Persona per2 = new Persona();
        per2.setNombre("sara");
        
        Persona per3 = new Persona();
        per3.setNombre("isabella");
        
        List<Persona> lista = new ArrayList();
        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        
        Iterator<Persona> iterador = lista.iterator();

        while(iterador.hasNext()){
            
            System.out.println(iterador.next().getNombre());
            
        }
        
        
        
    }

}
