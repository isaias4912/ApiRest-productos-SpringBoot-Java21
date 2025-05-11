package com.javaconspringboot.productos.service;

import com.javaconspringboot.productos.entity.Producto;
import com.javaconspringboot.productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //esto indica q es una clase de servicio y q se puede inyectar en cualquier lado de la app
public class ProductoServiceImpl implements IProducto{

    private ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> finAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto finById(Integer id) {
        return productoRepository.findById(id).get();
    }

    @Override
    public void eliminarId(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto actualizar(Producto producto) {
        Producto productoBDD=productoRepository.findById(producto.getId()).get();

        productoBDD.setNombre(producto.getNombre());
        productoBDD.setDetalle(producto.getDetalle());
        productoBDD.setPrecio(producto.getPrecio());
        return productoRepository.save(productoBDD);
    }


}
