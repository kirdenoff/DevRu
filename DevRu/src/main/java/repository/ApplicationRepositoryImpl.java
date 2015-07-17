package repository;

import java.util.List;
import util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author d.kiryanov
 * @param <T>
 */
public abstract class ApplicationRepositoryImpl<T> implements ApplicationRepository<T> {

    private Session session;

    public ApplicationRepositoryImpl() {
    }

    @Override
    public void addEntity(T entity) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<T> getAllEntities(String className) {
        
        List<T> entities;
        
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        entities = session.createCriteria(className).list();
        
        session.close();
        
        return entities;
    }

    @Override
    public void deleteEntity(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T findEntity(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T updateEntity(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
