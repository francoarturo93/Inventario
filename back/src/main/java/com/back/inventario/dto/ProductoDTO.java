package com.back.inventario.dto;

import com.back.inventario.entities.Categoria;

import lombok.Data;

@Data
public class ProductoDTO {
    private Long id;
    private String nombre;
    private Integer precio;
    private Integer entradas;
    private Categoria categoria;
}
