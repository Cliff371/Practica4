package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    //El siguiente metodo retorna una lista con las categorias
    //Que estan en la tabla categoria, todas o solo los activas
    
    public List<Categoria> getCategorias(boolean activos);
    
    //aca siguen los metodos para hacer un CRUD de la tabla categorias
}
