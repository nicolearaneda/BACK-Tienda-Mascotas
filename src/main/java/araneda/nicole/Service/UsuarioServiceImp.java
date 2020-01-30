package araneda.nicole.Service;

import araneda.nicole.Model.Usuario;
import araneda.nicole.Repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService{

@Autowired
private UsuarioRepository repositorio;
	@Override
	public List<Usuario> listadoUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuario listadoUsuarioUnico(int id_u) {
		return repositorio.findById(id_u);
		
	}

	@Override
	public Usuario altaUsuario(Usuario u) {
		
		return repositorio.save(u);
	}

	@Override
	public Usuario editarUsuario(Usuario u) {
		return repositorio.save(u);
		
	}

	@Override
	public Usuario eliminarUsuario(int id_u) {
            Usuario u = repositorio.findById(id_u);
            if (u!=null)
            {
                repositorio.delete(u);
            }
            return u;
	}
}