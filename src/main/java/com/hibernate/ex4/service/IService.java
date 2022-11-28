package com.hibernate.ex4.service;

public interface IService<T, K> {
    T add(T t);
    T update(T t);
    T get(K id);
    void delete(K id);
}
