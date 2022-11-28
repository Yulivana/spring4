package com.hibernate.ex4.service;

import com.hibernate.ex4.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true, timeout = 60)
    public T get(K id) {
        return baseDao.get(id);
    }
    @Override
    public void delete(K id) {
        baseDao.delete(id);
    }

}
