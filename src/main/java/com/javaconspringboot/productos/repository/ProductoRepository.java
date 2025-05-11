package com.javaconspringboot.productos.repository;

import com.javaconspringboot.productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
