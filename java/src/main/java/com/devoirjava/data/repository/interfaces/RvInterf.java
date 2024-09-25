package com.devoirjava.data.repository.interfaces;

import com.devoirjava.core.repository.interfaces.Repository;
import com.devoirjava.data.entities.Rv;

public interface RvInterf extends Repository<Rv>{
    public Rv getRvByDate(String date);
}
