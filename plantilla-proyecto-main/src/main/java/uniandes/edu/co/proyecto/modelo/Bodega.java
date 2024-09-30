package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bodegas")
public class Bodega {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String nombre;
    private Integer tamanio;

    public Bodega(String nombre, Integer tamanio)
    {
        this.nombre=nombre;
        this.tamanio=tamanio;

    }
    
    public Bodega()
    {;}

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    

    
}
