package com.javaconspringboot.productos.controller;

import com.javaconspringboot.productos.entity.Producto;
import com.javaconspringboot.productos.service.IProducto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    private IProducto iProducto;

    public  ProductoController(IProducto iProducto){
        this.iProducto=iProducto;
    }

    // con la anot requestbody trasforma de jason a un objeto de tipo producto
    @PostMapping
    public Producto save(@RequestBody Producto producto){
        return iProducto.save(producto);
    }

    @GetMapping
    public List<Producto> finAll(){
        return iProducto.finAll();
    }

    //aqui se mapea por id : http//localohost:8080/1
    @GetMapping("/{id}")
    public Producto findById(@PathVariable Integer id){
        return iProducto.finById(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarId(@PathVariable("id") Integer id){
        iProducto.eliminarId(id);
    }

    @PutMapping
    public void actualizar(@RequestBody
                               Producto producto){
        iProducto.actualizar(producto);
    }
}
