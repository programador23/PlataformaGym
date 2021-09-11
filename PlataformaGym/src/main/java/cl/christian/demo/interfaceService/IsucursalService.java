package cl.christian.demo.interfaceService;

import java.util.List;

import cl.christian.demo.modelo.Sucursal;

public interface IsucursalService {
public List<Sucursal>listarSucursal();
public Sucursal listarIdsucursal(int id);
public int saveSucursal (Sucursal s);
public void deleteSucursal(int id);
}
