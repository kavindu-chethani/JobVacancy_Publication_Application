/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.jobvacancy.dao.Custom.Impl;

import java.util.ArrayList;
import lk.ijse.jobvacancy.dao.CrudUtil;
import lk.ijse.jobvacancy.dao.Custom.CanditateDAO;
import lk.ijse.jobvacancy.entity.Candidate;

/**
 *
 * @author ASUS
 */
public class CanditateDAOImpl implements CanditateDAO{

    @Override
    public boolean save(Candidate can) throws Exception {
       return CrudUtil.executeUpdate("insert into candidate values (?,?,?,?,?,?,?,?)", can.getCID(),can.getFName(),can.getLName(),can.getDate_Of_Birth(),can.getGender(),can.getAddress(),can.getTele_NO(),can.getEmail())>0;
    }

    @Override
    public boolean update(Candidate entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Candidate search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Candidate> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
