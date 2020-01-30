package araneda.nicole.Service;

import araneda.nicole.Model.Mascota;
import java.util.List;

public interface MascotaService {
List<Mascota>listadoMascotas();
Mascota listadoMascotaUnica(int id_m);
Mascota altaMascota(Mascota m);
Mascota editarMascota(Mascota m);
Mascota eliminarMascota(int id_m);
    
}
