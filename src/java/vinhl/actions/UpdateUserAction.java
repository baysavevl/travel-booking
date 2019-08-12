/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import java.util.List;
import java.util.Map;
import vinhl.daos.UserDAO;
import vinhl.dtos.UserDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class UpdateUserAction extends ActionSupport{
    private int userID;
    private String username, fullname, phone, role, address, email;

    private List<UserDTO> listUser;
    private UserDTO user;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "FullName is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "3", maxLength = "30",
                        message = "FullName length must be 6 to 30 chars"
                        )
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    @RegexFieldValidator(type = ValidatorType.FIELD, regex="\\d{3}-\\d{7}", message = "PhoneNo is invalid (xxx-xxxxxxx)")
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Address is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "5", maxLength = "40",
                        message = "Address length must be 6 to 20 chars"
                        )
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    @EmailValidator(type = ValidatorType.FIELD, message = "Email is invalid")
    public void setEmail(String email) {
        this.email = email;
    }

    public List<UserDTO> getListUser() {
        return listUser;
    }

    public void setListUser(List<UserDTO> listUser) {
        this.listUser = listUser;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
    
    
    
    public UpdateUserAction() {
    }
    
    public String execute() throws Exception {
        UserDAO dao = new UserDAO();
        Map session = ActionContext.getContext().getSession();
        int id = (int) session.get("ID");
        this.setUserID(id);       
        user = dao.getUserByID(id);
        UserDTO dto = new UserDTO(userID, username, fullname, email, phone, address);
        if (dao.updateUser(dto))
        {
            user = dao.getUserByID(id);
            return "success";
        }
        
        return "fail";
        
    }
    
}
