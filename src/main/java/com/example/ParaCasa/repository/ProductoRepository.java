package com.example.ParaCasa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ParaCasa.model.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
