/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import java.util.List;
import vinhl.daos.UserDAO;
import vinhl.dtos.UserDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class ViewUserAdminAction {
    private List<UserDTO> listUser;
    private String searchUserName;

    public List<UserDTO> getListUser() {
        return listUser;
    }

    public void setListUser(List<UserDTO> listUser) {
        this.listUser = listUser;
    }

    public String getSearchUserName() {
        return searchUserName;
    }

    public void setSearchUserName(String searchUserName) {
        this.searchUserName = searchUserName;
    }
    
    
    
    public ViewUserAdminAction() {
    }
    
    public String execute() throws Exception {
       listUser = null;
        UserDAO dao = new UserDAO();
        listUser = dao.getListUser();
        return "success";
    }
    
}
