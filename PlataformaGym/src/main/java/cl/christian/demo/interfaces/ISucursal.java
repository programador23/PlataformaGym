package cl.christian.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.christian.demo.modelo.Sucursal;
@Repository
public interface ISucursal extends CrudRepository<Sucursal, Integer>{

}
