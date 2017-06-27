package kz.instagram.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class AbstractDaoImpl<T> implements AbstractDao<T>{
    private Class<T> type;

    @Autowired
    protected HibernateTemplate hibernateTemplate;

    public AbstractDaoImpl(Class<T> type) {
        this.type = type;
    }

    public T getById(Integer id) {
        return hibernateTemplate.get(type, id);
    }

    public List<T> findAll() {
        return hibernateTemplate.loadAll(type);
    }

    public T create(T entity) {
        hibernateTemplate.save(entity);
        return entity;
    }

    public T update(T entity) {
        hibernateTemplate.getSessionFactory().getCurrentSession().clear();
        hibernateTemplate.saveOrUpdate(entity);
        return entity;
    }

    public void delete(T entity) {
        hibernateTemplate.delete(entity);
    }
}
