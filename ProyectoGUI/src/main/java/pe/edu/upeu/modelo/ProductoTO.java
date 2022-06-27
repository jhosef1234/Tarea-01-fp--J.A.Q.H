package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class ProductoTO {
    public String idProducto, nombreProd;
    public String uniMed, idCat, idMod;
    public double precioUnidad, utilidad, stock, cantMayor;
}
