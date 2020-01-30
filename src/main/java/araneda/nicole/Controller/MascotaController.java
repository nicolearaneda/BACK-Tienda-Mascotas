package araneda.nicole.Controller;

import araneda.nicole.Model.Mascota;
import araneda.nicole.Service.MascotaService;
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
public class MascotaController {
    
@Autowired
MascotaService service;

@GetMapping("/mascotas")
public List<Mascota>listar()
{
	return service.listadoMascotas();
}

@PostMapping("/mascotas")
public Mascota agregar(@RequestBody Mascota m)
{
   return service.altaMascota(m); 
}


@GetMapping({"/mascotas/{id_m}"})
public Mascota listarId(@PathVariable("id_m") int id_m)
{
    return service.listadoMascotaUnica(id_m);
}


@PutMapping(path={"/mascotas/{id_m}"})
public Mascota editar(@RequestBody Mascota m, @PathVariable("id_m") int id_m)
{
    m.setId_m(id_m);
    return service.editarMascota(m);
}


@DeleteMapping(path={"/mascotas/{id_m}"})
public Mascota delete(@PathVariable ("id_m") int id_m)
{
    return service.eliminarMascota(id_m);
}
}
