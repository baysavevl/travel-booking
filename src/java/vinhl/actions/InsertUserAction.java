/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.FieldExpressionValidator;
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
public class InsertUserAction extends ActionSupport{
    private String username, fullname, phone, password, role, address, email, confirmPassword;

    
    
    private List<UserDTO> list;

    public String getUsername() {
        return username;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Username is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "6", maxLength = "20",
                       message = "Username length must be 6 to 20 chars"
                       )
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

    public String getPassword() {
        return password;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Password is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "6", maxLength = "20",
                        message = "Password length must be 6 to 20 chars"
                        )
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getConfirmPassword() {
        return confirmPassword;
    }

    @FieldExpressionValidator(expression = "confirmPassword == password", message = "Confirm must match password")
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public List<UserDTO> getList() {
        return list;
    }

    public void setList(List<UserDTO> list) {
        this.list = list;
    }

    
    public InsertUserAction() {
    }
    
    public String execute() throws Exception {
        UserDAO dao = new UserDAO();
        Map session = ActionContext.getContext().getSession();
            session.put("USER", username);           
            session.put("USERNAME", fullname);
            session.put("ROLE", role);
        
        UserDTO dto = new UserDTO(username, fullname, password, email, phone, role, address, false);
        if(dao.insertUser(dto))
        {    
            return "success";
        }
        return "fail";
    }
    
}
