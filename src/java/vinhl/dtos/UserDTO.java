/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.dtos;

import java.io.Serializable;

/**
 *
 * @author Luu Thieu Gia
 */
public class UserDTO implements Serializable{
    private int userID;
    private String username, fullname, password, email, phone, role, address;
    
    private boolean isDelete;
    
    public UserDTO() {
    }

    public UserDTO(int userID, String username, String fullname, String email, String phone, String address) {
        this.userID = userID;
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    
    

    public UserDTO(String username, String fullname, String password, String email, String phone, String role, String address, boolean isDelete) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.address = address;
        this.isDelete = isDelete;
    }

    
    
    public UserDTO(int userID, String username, String fullname, String password, String email, String phone, String address) {
        this.userID = userID;
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public UserDTO(int userID, String username, String fullname, String password, String email, String phone, String role, String address, boolean isDelete) {
        this.userID = userID;
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.address = address;
        this.isDelete = isDelete;
    }
    
    

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }
    
    

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

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

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

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
