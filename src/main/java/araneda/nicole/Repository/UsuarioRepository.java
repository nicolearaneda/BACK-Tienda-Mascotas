package araneda.nicole.Repository;

import araneda.nicole.Model.Usuario;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface UsuarioRepository extends Repository<Usuario,Integer>{

List<Usuario>findAll();
Usuario findById(int id_u);
//Usuario findByNombre(String nombre);
Usuario save(Usuario u);
void delete(Usuario u);
}
