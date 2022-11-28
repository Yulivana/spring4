package com.hibernate.ex2.dao;

public interface Dao<T, K> {
    T add(T t);
    T update(T t);
    T get(K id);
    void delete(K id);
}
