package uniandes.edu.co.proyecto.modelo;

import java.util.Date;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private String codigoBarras;
    private String nombre;
    private Integer precioUnitarioVenta;
    private String presentacion;
    private Integer cantidadPresentacion;
    private String unidadMedida;
    private Date fechaExpiracion;

    public Producto(String nombre, Integer precioUnitarioVenta, String presentacion, Integer cantidadPresentacion, String unidadMedida, Date fechaExpiracion)
    {
        this.nombre = nombre;
        this.precioUnitarioVenta = precioUnitarioVenta;
        this.presentacion = presentacion;
        this.cantidadPresentacion = cantidadPresentacion;
        this.unidadMedida = unidadMedida;
        this.fechaExpiracion = fechaExpiracion;
    }

    public Producto()
    {;}

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public Integer getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioUnitarioVenta(Integer precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setCantidadPresentacion(Integer cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    
    
}
