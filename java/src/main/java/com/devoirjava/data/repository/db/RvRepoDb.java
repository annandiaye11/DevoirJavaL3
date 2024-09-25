package com.devoirjava.data.repository.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.devoirjava.core.database.DataBaseImpl;
import com.devoirjava.data.entities.Rv;
import com.devoirjava.data.repository.interfaces.RvInterf;
public class RvRepoDb extends DataBaseImpl implements RvInterf{
    public RvRepoDb(){
        try {
            this.getConnection();
        } catch (SQLException e) {
        }
    }

    @Override
    public Rv getRvByDate(String date) {
        String req = String.format("Select * from rv where date = '%s'", date);
        try {
            this.initPreparedStatement(req);
            ResultSet rs = this.ps.executeQuery();
            if (rs.next()) {
                Rv rv = this.convertToObject(rs);
                return rv;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    @Override
    public Rv convertToObject(ResultSet rs) {
        try {
            return new Rv(rs.getString("date"), rs.getString("heure"));
        } catch (SQLException e) {
        }
        return null;
    }

    @Override
    public void add(Rv rv) {
        String req = String.format("INSERT INTO rv (date, heure) VALUES ('%s', '%s')",
                rv.getDate(), rv.getHeure());
        try {
            this.initPreparedStatement(req);
            this.ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public List<Rv> getAll() {
        List<Rv> rvs = new ArrayList<>();

        String req = "Select * from rv";
        try {
            this.initPreparedStatement(req);
            ResultSet rs = this.ps.executeQuery();
            while (rs.next()) {
                rvs.add(this.convertToObject(rs));
            }
        } catch (SQLException e) {
        }

        return rvs;
    }



}
