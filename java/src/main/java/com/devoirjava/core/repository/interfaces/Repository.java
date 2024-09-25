package com.devoirjava.core.repository.interfaces;

import java.sql.ResultSet;
import java.util.List;

public interface  Repository<T> {
    public void add(T object);
    public List<T> getAll();
    public T convertToObject(ResultSet rs);
}
