package entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table
public class producto {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "elc campo nombre no debe estar vacío")
    @Size(min=4,max=255,message = "el campo nombre debe tener entre 4 y 255 caracteres")
    private String nombre;
    @Size(min=4,max=255,message = "el campo descripción debe tener no mas de 255 caracteres ")
    private String descripcion;
    @Min(value = 0,message = "el campo precio debe ser mayor o igual a cero")
    private double precio;
    @Min(value = 0,message = "el campo stock debe ser mayor o igual a cero")
    private long stock;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private Presentacion presentacion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }
}
