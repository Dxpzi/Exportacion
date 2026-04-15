import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {

    public LinkedList<ObjEstudiante> LLenarLista(LinkedList<ObjEstudiante> l, Scanner sc) {

        boolean pedir = true;

        while (pedir) {

            ObjEstudiante o = new ObjEstudiante();

            System.out.println("Ingrese el nombre del estudiante");
            o.setNombre(sc.next());

            System.out.println("Ingrese el carnet");
            o.setCarnet(sc.next());

            System.out.println("Ingrese la cédula");
            o.setCedula(sc.nextInt());

            l.add(o);
            System.out.println("Desea seguir Ingresando 1) Si , 2) No");

            int opt = sc.nextInt();

            if (opt == 2) {

                pedir = false;
            }
        }
        return l;
    }

    public void MostrarLista(LinkedList<ObjEstudiante> l) {
        for (ObjEstudiante o : l) {
            System.out.println("Nombre: " + o.getNombre());
            System.out.println("Carnet: " + o.getCarnet());
            System.out.println("Cédula: " + o.getCedula());
            System.out.println("--------------------------------------");
            System.out.println();
        }
    }

    public ObjEstudiante ConsultarEstudiante(int Cedula, LinkedList<ObjEstudiante> l) {

        ObjEstudiante o = new ObjEstudiante();

        for (ObjEstudiante c : l) {

            if (c.getCedula() == Cedula) {
                o.setCedula(Cedula);
                o.setNombre(c.getNombre());
                o.setCarnet(c.getCarnet());
            }
        }

        return o;
    }
}
