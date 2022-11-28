package com.hibernate.ex3.service;

import com.hibernate.ex3.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;


public class BaseService<T, K> implements IService<T, K> {
    @Autowired
    private Dao<T, K> baseDao;

    @Override
    public T add(T t) {
        return baseDao.add(t);
    }
    @Override
    public T update(T t) {
        return null;
    }
    @Override
    public T get(K id) {
        return baseDao.get(id);
    }
    @Override
    public void delete(K id) {
        baseDao.delete(id);
    }

}
