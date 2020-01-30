package araneda.nicole.Controller;

import araneda.nicole.Model.Usuario;
import araneda.nicole.Service.UsuarioService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping
public class UsuarioController {
	@Autowired
	UsuarioService service;
        
@GetMapping("/usuarios")
public List<Usuario>listar()
{
	return service.listadoUsuarios();
}

@PostMapping("/usuarios")
public Usuario agregar(@RequestBody Usuario u)
{
   return service.altaUsuario(u); 
}


@GetMapping({"/usuarios/{id_u}"})
public Usuario listarId(@PathVariable("id_u") int id_u)
{
    return service.listadoUsuarioUnico(id_u);
}


@PutMapping(path={"/usuarios/{id_u}"})
public Usuario editar(@RequestBody Usuario u, @PathVariable("id_u") int id_u)
{
    u.setId_u(id_u);
    return service.editarUsuario(u);
}


@DeleteMapping(path={"/usuarios/{id_u}"})
public Usuario delete(@PathVariable ("id_u") int id_u)
{
    return service.eliminarUsuario(id_u);
}
}
