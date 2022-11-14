/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.jobvacancy.bo.custom.impl;

import lk.ijse.jobvacancy.bo.custom.CanditateBO;
import lk.ijse.jobvacancy.dao.Custom.CanditateDAO;
import lk.ijse.jobvacancy.dao.Custom.Impl.CanditateDAOImpl;
import lk.ijse.jobvacancy.entity.Candidate;
import lk.ijse.jobvacancy.model.CandidateDTO;

/**
 *
 * @author ASUS
 */
public class CanditateBOImpl implements CanditateBO{
    private static CanditateDAO canDAO=new CanditateDAOImpl();
    @Override
    public boolean savecustomer(CandidateDTO can) throws Exception{
        return canDAO.save(new Candidate(can.getCID(),can.getFName(),can.getLName(),can.getDate_Of_Birth(),can.getGender(),can.getAddress(),can.getTele_NO(),can.getEmail()));
    }
    
}
