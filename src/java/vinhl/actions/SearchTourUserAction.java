/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import java.util.List;
import vinhl.daos.TourDAO;
import vinhl.dtos.TourDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class SearchTourUserAction {
    private List<TourDTO> list;

    public List<TourDTO> getList() {
        return list;
    }

    public void setList(List<TourDTO> list) {
        this.list = list;
    }
    
    
    public SearchTourUserAction() {
    }
    
    public String execute() throws Exception {
        TourDAO dao = new TourDAO();
        list = dao.getList();
        
        return "success";
    }
    
}
