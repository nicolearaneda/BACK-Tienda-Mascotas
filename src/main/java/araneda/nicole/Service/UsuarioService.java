package araneda.nicole.Service;

import araneda.nicole.Model.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario>listadoUsuarios();
    Usuario eliminarUsuario(int id_u);
    Usuario altaUsuario(Usuario u);
    Usuario editarUsuario(Usuario u);
  Usuario listadoUsuarioUnico(int id_u);
    
}