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
public class AddThisTourAction {
    
    private int tourID;
    private TourDTO tour;
    
    public AddThisTourAction() {
    }
    
    public String execute() throws Exception {
        TourDAO dao = new TourDAO();
        tour = dao.getTourByID(tourID);
        
        return "success";
    }

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public TourDTO getTour() {
        return tour;
    }

    public void setTour(TourDTO tour) {
        this.tour = tour;
    }
    
    
}
