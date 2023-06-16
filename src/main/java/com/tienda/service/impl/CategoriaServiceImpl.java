package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    //La anotación Autowired crea un único objeto sin hacer new.. y se mantiene
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategorias(boolean activos) {
        var lista=categoriaDao.findAll();
        if (activos) {  //si quiere solo las categorias activas
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

}