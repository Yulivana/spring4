package com.hibernate.ex1.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDao<T, K>  implements Dao<T, K> {

    Class<T> clazz;
    ThreadLocal<EntityManager> em
            = new ThreadLocal<>();

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public T add(T t) {
        begin();
        getEm().persist(t);
        commit();
        return t;
    }

    @Override
    public T get(K id) {
        return getEm().find(clazz, id);
    }

    @Override
    public T update(T t) {
        begin();
        getEm().merge(t);
        commit();
        return t;
    }
    @Override
    public void delete(K id) {
        begin();
        T t = getEm().find(clazz, id);
        getEm().remove(t);
        commit();
    }
    public EntityManager getEm() {
        if (em.get() == null) {
            em.set(factory.createEntityManager());
        }
        return em.get();
    }
    public void begin() {
        getEm().getTransaction().begin();
    }
    public void commit() {
        getEm().getTransaction().commit();
    }
}