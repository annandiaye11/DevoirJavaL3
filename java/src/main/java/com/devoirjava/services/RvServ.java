package com.devoirjava.services;

import java.util.List;

import com.devoirjava.data.entities.Rv;
import com.devoirjava.data.repository.interfaces.RvInterf;

public class RvServ {
    private final RvInterf rvRepInterf;

    public RvServ(RvInterf rvRepInterf) {
        this.rvRepInterf = rvRepInterf;
    }

    public void CreateRv(Rv rv){
        rvRepInterf.add(rv);
    }

    public List<Rv> getRvs() {
        return rvRepInterf.getAll();
    }

    public Rv getRvsByDate(String date) {
        return rvRepInterf.getRvByDate(date);
    }
}
