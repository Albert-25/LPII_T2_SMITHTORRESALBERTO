package com.empresa.dao;
import com.empresa.interfaces.IUsuarioDAO;
import com.empresa.model.Usuario;
import javax.persistence.*;

public class UsuarioDAO implements IUsuarioDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("erpUnit");
    
    @Override
    public Usuario validar(String usuario, String password) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.usuario = :user AND u.password = :pass", Usuario.class);
        query.setParameter("user", usuario);
        query.setParameter("pass", password);
        
        Usuario user = null;
        try {
            user = query.getSingleResult();
        } catch (NoResultException e) {
            System.out.println("Usuario no encontrado");
        }
        
        em.close();
        return user;
    }
}
