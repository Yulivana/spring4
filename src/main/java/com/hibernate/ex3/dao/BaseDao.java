package com.hibernate.ex3.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Getter;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao<T, K> implements Dao<T, K> {

    Class<T> clazz;
    @PersistenceContext
    @Getter
    private EntityManager em;

    @Override
    public T add(T t) {
        em.persist(t);
        return t;
    }

    @Override
    public T get(K id) {
        return em.find(clazz, id);
    }

    @Override
    public T update(T t) {
        em.merge(t);
        return t;
    }
    @Override
    public void delete(K id) {
        T t = em.find(clazz, id);
        em.remove(t);
    }
}
