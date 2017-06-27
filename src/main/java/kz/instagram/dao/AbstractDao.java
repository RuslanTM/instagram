package kz.instagram.dao;

import java.util.List;

public interface AbstractDao<T> {
    T getById(Integer id);
    List<T> findAll();
    T create(T entyty);
    T update(T entity);
    void delete(T entity);
}
