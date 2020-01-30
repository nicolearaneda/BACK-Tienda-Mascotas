package araneda.nicole.Repository;

import araneda.nicole.Model.Mascota;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface MascotaRepository extends Repository<Mascota,Integer>{
List<Mascota> findAll();
Mascota findById(int id_m);
Mascota findByNombre(String nombre);
Mascota save(Mascota m);
void delete(Mascota m);
}