/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.jobvacancy.bo.custom;

import lk.ijse.jobvacancy.bo.SuperBO;
import lk.ijse.jobvacancy.model.CandidateDTO;

/**
 *
 * @author ASUS
 */
public interface CanditateBO extends SuperBO{

    public boolean savecustomer(CandidateDTO can) throws Exception;
    
}
