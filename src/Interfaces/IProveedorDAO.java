package com.empresa.interfaces;
import com.empresa.model.Proveedor;
import java.util.List;

public interface IProveedorDAO {
    void registrar(Proveedor proveedor);
    List<Proveedor> listar();
}
