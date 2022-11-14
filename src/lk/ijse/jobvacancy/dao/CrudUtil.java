/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.jobvacancy.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import lk.ijse.DBconnection.DBConnection;



/**
 *
 * @author Sanu AK
 */
public class CrudUtil {

    public static PreparedStatement getPreaparedStatement(String sql, Object... params) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            pstm.setObject(i + 1, params[i]);
        }
        return pstm;
    }

    public static int executeUpdate(String sql, Object... params) throws Exception {
        return getPreaparedStatement(sql, params).executeUpdate();
    }

    public static ResultSet executeQuery(String sql,Object... params) throws Exception {
        return getPreaparedStatement(sql, params).executeQuery();
    }

}
