package cl.christian.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.christian.demo.interfaceService.IsucursalService;
import cl.christian.demo.modelo.Sucursal;


@Controller
@RequestMapping
public class ControladorSucursal {

	@Autowired
	private IsucursalService service;
	
	@GetMapping("listarSucursal")
	public String listarSucursal(Model model) {
		List<Sucursal>sucursal=service.listarSucursal();
		model.addAttribute("sucursales", sucursal);
		return "Sucursal/sucursales";
	}
	
	@GetMapping("/agregarSucursal")
	public String agregarSucursal(Model model) {
		model.addAttribute("sucursal", new Sucursal());
		return "Sucursal/formularioAgregarSucursal";
	}
	
	@PostMapping("/saveSucursal")
	public String saveSucursal(@Validated Sucursal s, Model model) {
		service.saveSucursal(s);
		
		return"redirect:listarSucursal";
	}
	@GetMapping("/modificarSucursal/{id}")
	public String ModificarSucursal(@PathVariable int id, Model model) {
		Sucursal sucursal=service.listarIdsucursal(id);
		model.addAttribute("sucursal", sucursal);
		return"Sucursal/formularioAgregarSucursal";
	}
}
