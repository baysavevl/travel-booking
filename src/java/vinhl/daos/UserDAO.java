/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.daos;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import vinhl.dtos.TourDTO;
import vinhl.dtos.UserDTO;
import vinhl.models.MyConnection;

/**
 *
 * @author Luu Thieu Gia
 */
public class UserDAO implements Serializable{
    
    private PreparedStatement preStm;
    private Connection conn;
    private ResultSet rs;

    public UserDAO() {
    }
    
    private void closeConnection()
    {
        try {
            if (rs != null)
                rs.close();
            if (preStm != null)
                preStm.close();
            if (conn != null)
                conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String checkLogin(String username, String password)
    {
        String role = "failed";
        try {
            String sql = "Select Role from tbl_User where username = ? and password = ?";
            //String sql = "Select Role from Registration where username = ? and password = ?";
            conn = MyConnection.getMyConnection();
            
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
            preStm.setString(2, password);
            
            rs = preStm.executeQuery();
            if (rs.next())
            {
                role = rs.getString("Role");
            }
            
            role = role.trim();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return role;
    }
    public String getUserPassword(int userID)
    {
        String password = null;
        try {
            String sql = "Select password from tbl_User where userID = ?";           
            conn = MyConnection.getMyConnection();
            
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, userID);
         
            
            rs = preStm.executeQuery();
            if (rs.next())
            {
                password = rs.getString("password");
            }
            
            password = password.trim();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return password;
    }
    
    public boolean resetPassword(int userID, String password)
    {
        boolean check = false;
        try {
            String sql = "Update tbl_User set Password = ? where userID = ?";           
            conn = MyConnection.getMyConnection();
            
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, password);
            preStm.setInt(2, userID);
         
            check = preStm.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        return check;
    }
    
    public String getUserFullName(String username)
    {
        String fullname = null;
        try {
            String sql = "Select Fullname from tbl_User where username = ?";           
            conn = MyConnection.getMyConnection();
            
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
         
            
            rs = preStm.executeQuery();
            if (rs.next())
            {
                fullname = rs.getString("FullName");
            }
            
            fullname = fullname.trim();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return fullname;
    }
    
   public int getUserID(String username)
    {
        int ID = 0;
        try {
            String sql = "Select UserID from tbl_User where username = ?";           
            conn = MyConnection.getMyConnection();
            
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
         
            
            rs = preStm.executeQuery();
            if (rs.next())
            {
                ID = rs.getInt("UserID");
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return ID;
    }
    
    
    public List<UserDTO> getListUser()
    {
        conn = MyConnection.getMyConnection();
        String sql = "Select userID, userName, fullname, password, email, phone, address, role from tbl_User where isDelete = 'false'";
        List<UserDTO> list = new ArrayList();
        try{
            preStm = conn.prepareStatement(sql);
            rs = preStm.executeQuery();
            while(rs.next())
            {
                int userID = rs.getInt("userID");
                String userName = rs.getString("userName");
                String fullname = rs.getString("fullname");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String role = rs.getString("role");
                
               // UserDTO dto = new UserDTO(userID, userName, password, password, email, phone, address);
                UserDTO dto = new UserDTO(userID, userName, fullname, password, email, phone, role, address, false);
                //TourDTO dto = new TourDTO(tourID, tourName, desc, vehicle, price, nTicket);
                
                list.add(dto);
            }
            
        } catch(SQLException e)
        {
            e.printStackTrace();
            //Logger.getLogger(TourDAO.class.getName()).log(Level.SEVERE, null, e);
            //Logger.getLogger(TourDAO.class.getName()).
        } finally{
            closeConnection();
        }       
        return list;   
    }
    
    public boolean insertUser(UserDTO dto) 
    {
        int result = 0;
        String sql = "Insert into tbl_User values(?,?,?,?,?,?,?,?)";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            
            preStm.setString(1, dto.getUsername());
            preStm.setString(2, dto.getFullname());
            preStm.setString(3, dto.getPassword());
            preStm.setString(4, dto.getAddress());
            preStm.setString(5, dto.getPhone());
            String role = "user";
            preStm.setString(6, role);
            preStm.setString(7, dto.getAddress());
            preStm.setBoolean(8, false);
            
            result = preStm.executeUpdate();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
     
        return result > 0;
    }
   
    public boolean updateUser(UserDTO dto)
    {
        boolean result = false;
        String sql = "Update tbl_User set userName = ?, fullName = ?, email = ?, phone = ?, role =?, address =? where userID = ?";
        conn = MyConnection.getMyConnection();
        try {
            preStm = conn.prepareStatement(sql);
            
            preStm.setString(1, dto.getUsername());

            preStm.setString(2, dto.getFullname());
            
            preStm.setString(3, dto.getEmail());
            preStm.setString(4, dto.getPhone());
            String role = "user";
            preStm.setString(5, role);
            preStm.setString(6, dto.getAddress());
            preStm.setInt(7, dto.getUserID());
            
            result = preStm.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return result;
    }
    
    public boolean deleteUser(int userID)
    {
        boolean result = false;
        String sql = "Update tbl_User set isDelete = 'true' where userID = ?";
        conn = MyConnection.getMyConnection();
        try {
            preStm = conn.prepareStatement(sql);
            
            preStm.setInt(1, userID);
            result = preStm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally
        {
            closeConnection();
        }
        return result;
    }
    
    
    public List<TourDTO> getTourList()
    {
        conn = MyConnection.getMyConnection();
        String sql = "Select tourID, tourName, description, price, numberTicket, vehicle, isDelete from tbl_Tour where isDelete = 'false'";
        List<TourDTO> list = new ArrayList();
        try{
            preStm = conn.prepareStatement(sql);
            rs = preStm.executeQuery();
            while(rs.next())
            {
                int tourID = rs.getInt("tourID");
                String tourName = rs.getString("tourName");
                String desc = rs.getString("description");
                float price = rs.getFloat("price");
                int nTicket = rs.getInt("numberTicket");
                String vehicle = rs.getString("vehicle");
                Date checkInDate = rs.getDate("checkInDate");
                Date checkOutDate = rs.getDate("checkOutDate");
                String depLocation = rs.getString("depLocation");
                String desLocation = rs.getString("desLocation");
                String img = rs.getString("Img");
                TourDTO dto = new TourDTO();
                dto = new TourDTO(tourID, tourName, desLocation, vehicle, price, true, nTicket, depLocation, desLocation, checkInDate, checkOutDate, img);
                list.add(dto);
            }
            
        } catch(SQLException e)
        {
            e.printStackTrace();
            //Logger.getLogger(TourDAO.class.getName()).log(Level.SEVERE, null, e);
            //Logger.getLogger(TourDAO.class.getName()).
        } finally{
            closeConnection();
        }       
        return list;   
    }
    
    public UserDTO getUserByID(int userID)
    {
        
        UserDTO user = null;
        
        String sql = "Select userName, fullName, passWord, email, phone, role, address from tbl_User where UserID = ?";
        conn = MyConnection.getMyConnection();
        try {
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, userID);
            rs = preStm.executeQuery();
            
            while(rs.next())
            {
                String userName = rs.getString("userName");
                String fullname = rs.getString("fullname");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                
                user = new UserDTO(userID, userName, fullname, password, email, phone, address);
                //user = new UserDTO(userID, rs.getString(1), sql, sql, sql, sql, sql)
                preStm.executeUpdate();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally
        {
            closeConnection();
        }
        
        return user;
    }
    
     public List<UserDTO> searchUserByName(String name)
    {
         UserDTO dto = null;
         List<UserDTO> result = null;
        try {
            String sql = "Select userID, userName, fullname, password, email, phone, address, role from tbl_User where isDelete = 'false' and UserName like ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, "%" + name +"%");
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while(rs.next())
            {
                int userID = rs.getInt("userID");
                String userName = rs.getString("userName");
                String fullname = rs.getString("fullname");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String role = rs.getString("role");
                
                //dto = new UserDTO(userID, userName, fullname, password, email, phone, role, address, true);
                dto = new UserDTO(userID, userName, fullname, password, email, phone, role, address, true);
                
                result.add(dto);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return result;
    }
     
     public boolean checkUsername(String username)
     {
        boolean check = false;
        try {
            String sql = "Select userName from tbl_User where isDelete = 'false' and UserName = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
            rs = preStm.executeQuery();
            
            if(rs.next())
            {
                String name = rs.getString("username");
                if(name.equalsIgnoreCase(username))
                    check = true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return check;
     }
     
     public boolean checkEmail(String email)
     {
        boolean check = false;
        try {
            String sql = "Select email from tbl_User where isDelete = 'false' and UserName = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, email);
            rs = preStm.executeQuery();
            
            if(rs.next())
            {
                String mail = rs.getString("username");
                if(mail.equalsIgnoreCase(email))
                    check = true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return check;
     }
}
