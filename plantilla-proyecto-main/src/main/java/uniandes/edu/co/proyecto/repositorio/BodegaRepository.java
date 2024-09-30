package uniandes.edu.co.proyecto.repositorio;


import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import uniandes.edu.co.proyecto.modelo.Bodega;

public interface BodegaRepository extends JpaRepository<Bodega, Integer>{

    @Query(value = "SELECT * FROM bodegas")
    Collection<Bodega> darBodegas();
    
    @Query(value = "SELECT * FROM bodegas WHERE id= : id", nativeQuery=true)
    Bodega darBodega(@Param("id") int id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO bodegas(id,nombre,tamanio) VALUES(proyecto_sequence.nextval, :nombre, :tamanio)", nativeQuery = true)
    void insertarBodega(@Param("nombre") String nombre, @Param("tamanio") Integer tamanio);


    @Modifying
    @Transactional
    @Query(value = "UPDATE bodegas SET nombre=:nombre, tamanio=:tamanio WHERE id=:id", nativeQuery = true)
    void actualizarBodega(@Param("id") String id, @Param("nombre") String nombre, @Param("tamanio") Integer tamanio);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM bodegas WHERE id = :id", nativeQuery = true)
    void eliminarBodega(@Param("id") String id);



}
