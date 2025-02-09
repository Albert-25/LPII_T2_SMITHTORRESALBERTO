package Interfaces;
import com.empresa.model.Usuario;

public interface IUsuarioDAO {
    Usuario validar(String usuario, String password);
}
