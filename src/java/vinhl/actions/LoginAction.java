/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import vinhl.daos.TourDAO;
import vinhl.daos.UserDAO;
import vinhl.dtos.TourDTO;
import vinhl.dtos.UserDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class LoginAction {
    private static final String ADMIN = "admin";
    private static final String USER = "user";
    private static final String ERROR = "error";
    
    private String username, password;
    private List<TourDTO> list;
    private List<UserDTO> listUser;
    
    private String fullname;
    private int userID;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

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
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TourDTO> getList() {
        return list;
    }

    public void setList(List<TourDTO> list) {
        this.list = list;
    }

    

    public LoginAction() {
    }
    
    public String execute() throws Exception {
        String url = ERROR;
        UserDAO dao = new UserDAO();
        String role = dao.checkLogin(username, password);
        
        HttpServletRequest request = ServletActionContext.getRequest();
        if(role.equals("failed"))
        {
            request.setAttribute("Error", "Invalid Username or Password");
        } else
        {
            fullname = dao.getUserFullName(username);
            userID = dao.getUserID(username);
            Map session = ActionContext.getContext().getSession();
            session.put("USER", username);
            session.put("ID", userID);
            session.put("USERNAME", fullname);
            session.put("ROLE", role);
            
            if(role.equals("admin"))
            {
                TourDAO daoT = new TourDAO();
                listUser = dao.getListUser();
                list = daoT.getList();
                session.put("LIST", list);
                url = ADMIN;
            }
            if(role.equals("user"))
            {   
                url = USER;
                TourDAO daoT = new TourDAO();
                list = daoT.getList();
            }
            else request.setAttribute("ERROR", "Your Role is not existed");
        }
        
        return url;
    }
    
}
