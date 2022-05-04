package entity;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
@Entity
@Table
public class Presentacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "elc campo nombre no debe estar vacío")
    @Size(min=4,max=255,message = "el campo nombre debe tener entre 4 y 255 caracteres")
    private String nombre;
    @Size(min=4,max=255,message = "el campo descripción debe tener no mas de 255 caracteres ")
    private String descripcion;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.MERGE,mappedBy = "presentacion")
    private List<producto> producto;
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
}
