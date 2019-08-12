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
public class DeleteUserAction {
    
    private int userID;
    private List<UserDTO> listUser;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<UserDTO> getListUser() {
        return listUser;
    }

    public void setListUser(List<UserDTO> listUser) {
        this.listUser = listUser;
    }
    
    
    
    public DeleteUserAction() {
    }
    
    public String execute() throws Exception {
        UserDAO dao = new UserDAO();
        if(dao.deleteUser(userID))
        {
            listUser = dao.getListUser();
            return "success";
        }
        
        return "fail";
    }
    
}
