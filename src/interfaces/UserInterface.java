
package interfaces;

import java.util.List;
import modelos.UserModel;

public interface UserInterface {
    public void Crear(UserModel user);
    public List<UserModel> listar();
    public void Actualizar(UserModel user);
    public void Eliminiar(UserModel userId);
}
