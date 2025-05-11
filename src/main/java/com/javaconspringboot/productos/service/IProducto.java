package com.javaconspringboot.productos.service;

import com.javaconspringboot.productos.entity.Producto;

import java.util.List;

public interface IProducto {

    Producto save (Producto producto);

    List<Producto>finAll();

    Producto finById(Integer id);

    void eliminarId(Integer id);

    Producto actualizar(Producto producto);


}
