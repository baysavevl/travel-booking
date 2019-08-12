/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import java.util.Map;
import vinhl.daos.UserDAO;

/**
 *
 * @author Luu Thieu Gia
 */
public class ResetPasswordUserAction {
    
    private String oldPassword, newPassword, confirmPassword;
    private int userID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
    
    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Password is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "6", maxLength = "20",
                        message = "Password length must be 6 to 20 chars"
                        )
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Confirm Password is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "6", maxLength = "20",
                        message = "Confirm Password length must be 6 to 20 chars"
                        )
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    
    
    public ResetPasswordUserAction() {
    }
    
    private String annouce;

    public String getAnnouce() {
        return annouce;
    }

    public void setAnnouce(String annouce) {
        this.annouce = annouce;
    }
    
    
    public String execute() throws Exception {
        UserDAO dao = new UserDAO();
        Map session = ActionContext.getContext().getSession();
        int id = (int) session.get("ID");
        this.setUserID(id);
        //UserDTO dto = dao.getUserByID(id);
        
       
        
        String password = dao.getUserPassword(userID);
        if(!oldPassword.equalsIgnoreCase(password))
        {
            annouce = "password is not correct !";
            return "input";
        }
        if(!newPassword.endsWith(confirmPassword))
        {
            annouce = "password must matches confirm !";
            return "input";
        }
        {
            annouce = "password is reseted !";
            dao.resetPassword(userID, newPassword);
            return "success";
        }
        
    }
    
}
