package com.devoirjava.data.repository.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.devoirjava.core.database.DataBaseImpl;
import com.devoirjava.core.repository.interfaces.Repository;
import com.devoirjava.data.entities.Medecin;

public class MedecinRepoDb extends  DataBaseImpl implements Repository<Medecin>{

    @Override
    public void add(Medecin medecin) {
        String req = String.format("INSERT INTO medecin (nom, prenom) VALUES ('%s', '%s')",
                medecin.getNom(), medecin.getPrenom());
        try {
            this.initPreparedStatement(req);
            this.ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public List<Medecin> getAll() {
        List<Medecin> medecins = new ArrayList<>();

        String req = "Select * from medecin";
        try {
            this.initPreparedStatement(req);
            ResultSet rs = this.ps.executeQuery();
            while (rs.next()) {
                medecins.add(this.convertToObject(rs));
            }
        } catch (SQLException e) {
        }

        return medecins;
    }

    @Override
    public Medecin convertToObject(ResultSet rs) {
        try {
            return new Medecin(rs.getString("nom"), rs.getString("prenom"));
        } catch (SQLException e) {
        }
        return null;
    }

}

