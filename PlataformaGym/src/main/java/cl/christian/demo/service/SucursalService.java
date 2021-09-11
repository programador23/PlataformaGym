package cl.christian.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.christian.demo.interfaceService.IsucursalService;
import cl.christian.demo.interfaces.ISucursal;
import cl.christian.demo.modelo.Sucursal;

@Service
public class SucursalService  implements IsucursalService{

	@Autowired
	private ISucursal data;
	
	@Override
	public List<Sucursal> listarSucursal() {
		
		return (List<Sucursal>)data.findAll();
	}

	@Override
	public Sucursal listarIdsucursal(int id) {
		
		return data.findById(id).orElse(null);
	}

	@Override
	public int saveSucursal(Sucursal s) {
		int res=0;
		Sucursal sucursal=data.save(s);
		if(!sucursal.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteSucursal(int id) {
		
		
	}

}
