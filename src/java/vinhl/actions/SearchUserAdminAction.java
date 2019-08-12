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
public class SearchUserAdminAction {
    
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
    
    
    
    public SearchUserAdminAction() {
    }
    
    public String execute() throws Exception {
        listUser = null;
        UserDAO dao = new UserDAO();
        listUser = dao.searchUserByName(searchUserName);
        return "success";
    }
    
}
