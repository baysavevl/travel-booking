/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import vinhl.daos.UserDAO;
import vinhl.dtos.UserDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class EditPasswordUserAction {
    
    private int userID;
    private UserDTO user;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
    
    
    
    public EditPasswordUserAction() {
    }
    
    public String execute() throws Exception {
        UserDAO dao = new UserDAO();
        UserDTO dto = dao.getUserByID(userID);
        
        if (dto.getFullname() != null)
        {           
            return "success";
        }
        
        return "fail";
    }
    
}
