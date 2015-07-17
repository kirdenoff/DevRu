
package repository;

import java.util.List;

/**
 *
 * @author d.kiryanov
 */
public interface ApplicationRepository<T>{
    void addEntity(T entity);
    void deleteEntity(int id);
    T findEntity(int id);
    T updateEntity(T entity);
    List<T> getAllEntities(String className);
}
