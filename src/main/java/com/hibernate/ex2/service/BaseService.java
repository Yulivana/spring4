package com.hibernate.ex2.service;

import com.hibernate.ex2.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class BaseService<T, K> implements IService<T, K> {
    @Autowired
    private Dao<T, K> baseDao;
    @Autowired
    TransactionTemplate transactionTemplate;

    @Override
    public T add(T t) {
        return transactionTemplate.execute(new TransactionCallback<T>() {
            public T doInTransaction(TransactionStatus transactionStatus) {
                try {
                    return baseDao.add(t);
                } catch (Exception e) {
                    transactionStatus.setRollbackOnly();
                }
                return null;
            }
        });
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
