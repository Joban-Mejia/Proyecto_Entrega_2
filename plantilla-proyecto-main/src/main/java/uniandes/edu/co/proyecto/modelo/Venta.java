package uniandes.edu.co.proyecto.modelo;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private Date fecha;
    
    public Venta(Integer id, Date fecha)
    {
        this.fecha = fecha;
    }

    public Venta()
    {;}

    public Integer getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
