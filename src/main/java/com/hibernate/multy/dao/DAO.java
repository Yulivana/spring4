package com.hibernate.multy.dao;

public interface DAO<T> {

    T get(long id);
}
