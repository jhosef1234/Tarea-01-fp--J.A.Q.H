package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentaDao extends AppCrud {
    LeerTeclado leerT=new LeerTeclado();
    LeerArchivo leerA; 
    UtilsX util=new UtilsX();
    UsuarioTO uTo;
    final static String TABLA_VENTA="Venta.txt";
    final static String TABLA_PRODUCTO="Producto.txt";
    final static String TABLA_DETALLEVENTA="DetalleVenta.txt";
    final static String TABLA_CLIENTE="Cliente.txt";

    VentaTO vTo;
    VentaDetalleTO vdTo;

    public void registroVentaGeneral() {
        util.clearConsole();
        System.out.println("*********************Realizar Venta******************");
        String dnix=leerT.leer("", "Ingrese DNI del cliente");
        if (validarCliente(dnix)) {
            vTo=new VentaTO();
            vTo.setDni(dnix);
            vTo.setDescuento(0);
            leerA=new LeerArchivo(TABLA_VENTA)
            String idv=generarId(leerA, 0, "v", 1)
            vTo.setIdVenta(idv);
            
        }
    }

    public void Venta() {
        leerA=new LeerArchivo(TABLA_VENTA);
    }

    public void carritoVenta() {
        
    }

    public boolean validarCliente(String dni) {
        leerA=new LeerArchivo(TABLA_CLIENTE);
        Object[][] dataC=buscarContenido(leerA, 0, dni);
        if (dataC==null || dataC.length==0) {
            new ClienteDao().crearCliente();
            return true;
        }else{
            return true;
        }
    }


}
