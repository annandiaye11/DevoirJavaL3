package com.devoirjava.core.database.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface  DataBase {
    void getConnection() throws SQLException;
    void closeConnection() throws SQLException;
    ResultSet executeSelect(String req) throws SQLException;
    void initPreparedStatement(String req) throws SQLException;
    int executeUpdate() throws SQLException;
}
