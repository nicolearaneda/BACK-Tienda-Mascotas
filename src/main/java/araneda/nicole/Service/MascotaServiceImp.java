package araneda.nicole.Service;

import araneda.nicole.Model.Mascota;
import araneda.nicole.Repository.MascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImp implements MascotaService
{
@Autowired
private MascotaRepository repositorio;
	@Override
	public List<Mascota> listadoMascotas() {
		return repositorio.findAll();
	}

	@Override
	public Mascota listadoMascotaUnica(int id_m) 
        {
            return repositorio.findById(id_m);
		
	}

	@Override
	public Mascota altaMascota(Mascota m) {
		
		return repositorio.save(m);
	}

	@Override
	public Mascota editarMascota(Mascota m)
        {
		return repositorio.save(m);
	}

	@Override
	public Mascota eliminarMascota(int id_m) {
            Mascota m = repositorio.findById(id_m);
            if (m!=null)
            {
                repositorio.delete(m);
            }
            return m;
	}

}