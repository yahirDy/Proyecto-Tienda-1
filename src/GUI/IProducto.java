package GUI;

import java.util.ArrayList;

/**
 *
 * @author Alan Nava Martinez
 */
public interface IProducto {
    public void Altas(Producto p);
    public void Bajas(Producto p);
    public void Modificar(Producto p);
    public void Consultar(Producto p);
    ArrayList<Producto> Reportes();
}
