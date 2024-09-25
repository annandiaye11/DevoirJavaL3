package com.devoirjava.core.repository;

import java.util.List;

import com.devoirjava.core.database.DataBaseImpl;
import com.devoirjava.core.repository.interfaces.Repository;

public abstract class RepositoryDbImpl<T> extends DataBaseImpl implements Repository<T>{
public  RepositoryDbImpl() {
    super();
}

    @Override
    public void add(Object object) {
        // TODO Auto-generated method stub
    }

    @Override
    public List<T> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
}
