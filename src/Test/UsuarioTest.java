package Test;

import DaoImp.UsuarioDaoImp;
import model.Usuario;

public class UsuarioTest {
    public static void main(String[] args) {
        UsuarioDaoImp usuarioDao = new UsuarioDaoImp();

        Usuario u1 = new Usuario();
        u1.setUsuarioT1("admin");
        u1.setPasswordT1("123456");
        usuarioDao.create(u1);

        Usuario usuario = usuarioDao.read(1);
        System.out.println("Usuario: " + usuario.getUsuarioT1());

        usuario.setPasswordT1("654321");
        usuarioDao.update(usuario);

        usuarioDao.delete(1);
    }
}
