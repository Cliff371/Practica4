package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    //El siguiente metodo retorna una lista con las productos
    //Que estan en la tabla producto, todas o solo los activas

    public List<Producto> getProductos(boolean activos);
    //aca siguen los metodos para hacer un CRUD de la tabla productos

    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}
