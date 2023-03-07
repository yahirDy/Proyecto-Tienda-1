package cosas_emp;

import cosas_emp.Empleado;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextField;
import cosas_prod.Producto;
import cosas_prov.Provedores;

public class Busqueda {

    public static int buscarIdArrayList(ArrayList<Empleado> emps, int id) throws IOException {
        int po = -1;        
        for (int i = 0; i < emps.size(); i++) {
            if (emps.get(i).getId() == id) {
                po = i;
                break;
            }
        }
        return po;
    }  
    
    public static int buscarIdpArrayList(ArrayList<Producto> prodc, int idces) throws IOException {
        int po = -1;        
        for (int i = 0; i < prodc.size(); i++) {
            if (prodc.get(i).getId() == idces) {
                po = i;
                break;
            }
        }
        return po;
    }
    
    public static int buscarIdprovArrayList(ArrayList<Provedores> prov, int id) throws IOException {
        int po = -1;        
        for (int i = 0; i < prov.size(); i++) {
            if (prov.get(i).getId() == id) {
                po = i;
                break;
            }
        }
        return po;
    }

}
