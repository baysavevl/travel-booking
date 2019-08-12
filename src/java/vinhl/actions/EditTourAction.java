/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import vinhl.daos.TourDAO;
import vinhl.dtos.TourDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class EditTourAction {
    public int tourID;
    private TourDTO tour;
    
 

    public TourDTO getTour() {
        return tour;
    }

    public void setTour(TourDTO tour) {
        this.tour = tour;
    }
    
    
    
    public EditTourAction() {
    }
    
    public String execute() throws Exception {
        TourDAO dao = new TourDAO();
        TourDTO dto = dao.getTourByID(tourID);
        //System.out.println("Tour Name = " + dto.getTourName());
        if (dto.getTourName() != null)
        {
            tour = dto;
            return "success";
        }
        
        return "fail";
    }
    
 
    
}
