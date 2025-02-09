package com.empresa.dao;
import com.empresa.interfaces.IProveedorDAO;
import com.empresa.model.Proveedor;
import javax.persistence.*;
import java.util.List;

public class ProveedorDAO implements IProveedorDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("erpUnit");

    @Override
    public void registrar(Proveedor proveedor) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(proveedor);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Proveedor> listar() {
        EntityManager em = emf.createEntityManager();
        List<Proveedor> lista = em.createQuery("SELECT p FROM Proveedor p", Proveedor.class).getResultList();
        em.close();
        return lista;
    }
}
