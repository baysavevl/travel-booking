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
public class SearchTourAdminAction {
    
    private List<TourDTO> list;
    private String searchName;

    public List<TourDTO> getList() {
        return list;
    }

    public void setList(List<TourDTO> list) {
        this.list = list;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
    
    
    
    public SearchTourAdminAction() {
    }
    
    public String execute() throws Exception {
        list = null;
        TourDAO dao = new TourDAO();
        list = dao.searchTourByName(searchName);
        return "success";
    }
    
}
