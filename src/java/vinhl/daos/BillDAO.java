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
import java.util.List;
import vinhl.dtos.BillDTO;
import vinhl.models.MyConnection;

/**
 *
 * @author Luu Thieu Gia
 */
public class BillDAO implements Serializable{
    
    private PreparedStatement preStm;
    private Connection conn;
    private ResultSet rs;

    public BillDAO() {
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
    
    public boolean insertBill(BillDTO dto) throws Exception{
        boolean check = false;
        String sql = "Insert into tbl_Cart values(?,?,?,?,?,?)";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, dto.getUserID());
            preStm.setInt(2, dto.getTourID());
            preStm.setInt(3, dto.getNumber());
            preStm.setFloat(4, dto.getPrice());
            
            dto.setTotal(dto.getNumber() * dto.getPrice());
            preStm.setFloat(5, dto.getTotal());
            preStm.setInt(6, 0);
            
            check = preStm.executeUpdate() > 0;
            
        } finally{
            closeConnection();
        }
        
        return check;
        
    }
    
    public boolean updateBill(BillDTO dto) throws Exception{
        boolean check = false;
        String sql = "Update tbl_Cart set number = ? where userID = ? and tourID = ?";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, dto.getNumber());
            preStm.setInt(2, dto.getUserID());
            preStm.setInt(3, dto.getTourID());

            check = preStm.executeUpdate() > 0;
            
        } finally{
            closeConnection();
        }
        
        return check;
    }
    
    public boolean updatePaid(int billID) throws SQLException
    {
        boolean check = false;
        String sql = "Update tbl_Cart set isPaid = '1' where billID = ?";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, billID);
            
            check = preStm.executeUpdate() > 0;
            
        } finally{
            closeConnection();
        }
        
        return check;
    }
    
    public BillDTO getBillByID(int billID) throws Exception
    {
        BillDTO dto = null;
        String sql = "Select userID, tourID, number, price, total, isPaid from tbl_Cart where billID = ?";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, billID);
            rs = preStm.executeQuery();
            if(rs.next())
            {
                int userID = rs.getInt("userID");
                int tourID = rs.getInt("tourID");
                int number = rs.getInt("number");
                int price = rs.getInt("price");
                int total = rs.getInt("total");
                int isPaid = rs.getInt("isPaid");
                
                dto = new BillDTO(billID, userID, tourID, number, isPaid, price, total);
            }
            
            
        } finally{
            closeConnection();
        }
        
        return dto;
    }
    
    
    
    
    public List<BillDTO> getBillunPaidByUserID(int userID) throws Exception{
        BillDTO dto = null;
        List<BillDTO> result = null;
        String sql = "Select billID, userID, tourID, number, price, total, isPaid from tbl_Cart where userID = ? and isPaid = '0'";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, userID);
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while(rs.next())
            {
                int billID = rs.getInt("billID");
                int tourID = rs.getInt("tourID");
                int number = rs.getInt("number");
                int price = rs.getInt("price");
                int total = rs.getInt("total");
                int isPaid = rs.getInt("isPaid");
                
                //String tourName = this.getTourNameByID(tourID);
               // dto = new BillDTO(billID, userID, tourID, number, isPaid, price);
                dto = new BillDTO(billID, userID, tourID, number, isPaid, price, total);
                result.add(dto);
            }
            
            
        } finally{
            closeConnection();
        }
        
        return result;
    }
    
    public List<BillDTO> getBillPaidByUserID(int userID) throws Exception{
        BillDTO dto = null;
        List<BillDTO> result = null;
        String sql = "Select billID, userID, tourID, number, price, total, isPaid from tbl_Cart where userID = ? and isPaid = '1'";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, userID);
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while(rs.next())
            {
                int billID = rs.getInt("billID");
                int tourID = rs.getInt("tourID");
                int number = rs.getInt("number");
                int price = rs.getInt("price");
                int total = rs.getInt("total");
                int isPaid = rs.getInt("isPaid");
                
                //String tourName = this.getTourNameByID(tourID);
               // dto = new BillDTO(billID, userID, tourID, number, isPaid, price);
                dto = new BillDTO(billID, userID, tourID, number, isPaid, price, total);
                result.add(dto);
            }
            
            
        } finally{
            closeConnection();
        }
        
        return result;
    }
    
    public List<BillDTO> getBillunPaidByTourID(int tourID) throws Exception{
        BillDTO dto = null;
        List<BillDTO> result = null;
        String sql = "Select billID, userID, tourID, number, price, total, isPaid from tbl_Cart where userID = ? nd isPaid = '0'";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, tourID);
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while(rs.next())
            {
                int billID = rs.getInt("billID");
                int userID = rs.getInt("userID");
                int number = rs.getInt("number");
                int price = rs.getInt("price");
                int total = rs.getInt("total");
                int isPaid = rs.getInt("isPaid");
                
               
                
                dto = new BillDTO(billID, userID, tourID, number, isPaid, price, total);
                result.add(dto);
            }
            
            
        } finally{
            closeConnection();
        }
        
        return result;
    }
    
     public List<BillDTO> getBillPaidByTourID(int tourID) throws Exception{
        BillDTO dto = null;
        List<BillDTO> result = null;
        String sql = "Select billID, userID, tourID, number, price, total, isPaid from tbl_Cart where userID = ? nd isPaid = '1'";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, tourID);
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while(rs.next())
            {
                int billID = rs.getInt("billID");
                int userID = rs.getInt("userID");
                int number = rs.getInt("number");
                int price = rs.getInt("price");
                int total = rs.getInt("total");
                int isPaid = rs.getInt("isPaid");
                
               
                
                dto = new BillDTO(billID, userID, tourID, number, isPaid, price, total);
                result.add(dto);
            }
            
            
        } finally{
            closeConnection();
        }
        
        return result;
    }
    
    public boolean deleteBillByID(int billID)
    {
        int result = 0;
        String sql = "delete from tbl_Cart where billID = ?";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            
            preStm.setInt(1, billID);
            result = preStm.executeUpdate();
        } catch(Exception e)
        {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return result > 0;
    }
    
    public int getNumberTicketByID(int userID, int tourID) throws Exception
    {
        int result = 0;
        String sql = "select number from tbl_Cart where userID = ? and tourID = ? and isPaid = '0'";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, userID);
            preStm.setInt(2, tourID);
            
            rs = preStm.executeQuery();
            if(rs.next())
            {
                result = rs.getInt("number");
            }
        } finally{
            closeConnection();
        }
        return result; 
    }
    
     public int getNumberTicketPaidByID(int userID, int tourID) throws Exception
    {
        int result = 0;
        String sql = "select number from tbl_Cart where userID = ? and tourID = ? and isPaid = '1'";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, userID);
            preStm.setInt(2, tourID);
            
            rs = preStm.executeQuery();
            if(rs.next())
            {
                result = rs.getInt("number");
            }
        } finally{
            closeConnection();
        }
        return result; 
    }
     
    public BillDTO getBillPaidByID(int userID, int tourID) throws Exception
    {
        BillDTO dto = null;
        String sql = "Select billID, userID, tourID, number, price, total, isPaid from tbl_Cart where userID = ? and tourID = ? and isPaid = '1'";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, userID);
            preStm.setInt(2, tourID);
            
            rs = preStm.executeQuery();
            if(rs.next())
            {
                int billID = rs.getInt("billID");
                //int tourID = rs.getInt("tourID");
                int number = rs.getInt("number");
                int price = rs.getInt("price");
                int total = rs.getInt("total");
                int isPaid = rs.getInt("isPaid");
                
                
                dto = new BillDTO(billID, userID, tourID, number, isPaid, price, total);
                
            }
        } finally{
            closeConnection();
        }
        return dto; 
    } 
     
    
    public String getTourNameByID(int tourID) throws Exception
    {
        String result = null;
        
        String sql = "Select tourName from tbl_Tour where tourID = ?";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            
            preStm.setInt(1, tourID);
            rs = preStm.executeQuery();
            if(rs.next())
            {
                result = rs.getString("tourName");
            }
        } finally{
            closeConnection();
        }
        
        return result;
    }
    
  
    
    public boolean checkUpdate(int billID, int number) throws Exception{
         boolean check = false;
        String sql = "Update tbl_Cart set number = ? where billID = ?";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, number);
            preStm.setInt(2, billID);
            
            
            check = preStm.executeUpdate() > 0;
            
        } finally{
            closeConnection();
        }
        
        return check;
    }
    
    public float totalMoneyByID(int userID) throws Exception
    {
        float total = 0;
        String sql = "Select number, price from tbl_Cart where userID = ? and isPaid = '1'";
        conn = MyConnection.getMyConnection();
        try {
             preStm = conn.prepareStatement(sql);
             preStm.setInt(1, userID);
             rs = preStm.executeQuery();
             while(rs.next())
             {
                 int number = rs.getInt("number");
                 float price = rs.getFloat("price");
                 total += number * price;
             }
        } finally {
            closeConnection();
        }
        return total;
    }
}
