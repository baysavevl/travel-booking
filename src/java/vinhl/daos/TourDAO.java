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
import vinhl.models.MyConnection;

/**
 *
 * @author Luu Thieu Gia
 */
public class TourDAO implements Serializable{
    
    private PreparedStatement preStm;
    private Connection conn;
    private ResultSet rs;

    public TourDAO() {
    }
    public boolean updateTicketLeft(int tourID, int number)
    {
        boolean check = false;
        conn = MyConnection.getMyConnection();
        try {
             String sql = "Update tbl_Tour set numberTicket = ? where tourID = ?";
             preStm = conn.prepareStatement(sql);
             
             preStm.setInt(1, number);
             preStm.setInt(2, tourID);
             check = preStm.executeUpdate() > 0;
             
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            closeConnection();
        }
        return check;
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
     
    public List<TourDTO> getList()
    {
        conn = MyConnection.getMyConnection();
        String sql = "Select tourID, tourName, description, price, numberTicket, vehicle, isDelete, desLocation, depLocation, checkInDate, checkOutDate, Img from tbl_Tour where isDelete = 'false'";
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
               
                TourDTO dto = new TourDTO(tourID, tourName, desc, vehicle, price, true, nTicket, depLocation, desLocation, checkInDate, checkOutDate, img);
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
     
    public boolean insertTour(TourDTO dto) throws Exception
    {
       int result = 0;
       String sql = "Insert into tbl_Tour values(?,?,?,?,?,?,?,?,?,?,?)";
       conn = MyConnection.getMyConnection();
       try{
           preStm = conn.prepareStatement(sql);
           preStm.setString(1, dto.getTourName());
           preStm.setString(2, dto.getDescription());
           preStm.setFloat(3, dto.getPrice());
           preStm.setInt(4, dto.getNumberTicket());
           
           preStm.setString(5, dto.getVehicle());
           boolean isDelete = false;
           preStm.setBoolean(6, isDelete);
           java.sql.Date cIDate = new java.sql.Date(dto.getCheckInDate().getTime());
           java.sql.Date cODate = new java.sql.Date(dto.getCheckOutDate().getTime());
           
           
           preStm.setDate(7, cIDate);
           preStm.setDate(8, cODate);
           preStm.setString(9, dto.getDesLocation());
           preStm.setString(10, dto.getDepLocation());
           preStm.setString(11, dto.getImg());
           
           result = preStm.executeUpdate();
       } finally{
           closeConnection();
       }
       
       return result > 0;
    }
    
    public boolean updateTour(TourDTO dto) {
        int result = 0;
        String sql = "Update tbl_Tour set tourName = ?, description = ?, price = ?, numberTicket = ?, vehicle = ?, desLocation = ?, depLocation =?, checkInDate = ?, checkOutDate = ?, img = ? where tourID = ?";
        conn = MyConnection.getMyConnection();
        try {
            preStm = conn.prepareStatement(sql);
            String tourName  = dto.getTourName();
            preStm.setString(1, tourName);
            preStm.setString(2, dto.getDescription());
            preStm.setFloat(3, dto.getPrice());
            preStm.setInt(4, dto.getNumberTicket());

            String vehicle = dto.getVehicle();
            preStm.setString(5, vehicle);
            
            preStm.setString(6, dto.getDesLocation());
            preStm.setString(7, dto.getDepLocation());
            
            java.sql.Date cIDate = new java.sql.Date(dto.getCheckInDate().getTime());
            java.sql.Date cODate = new java.sql.Date(dto.getCheckOutDate().getTime());
           
            preStm.setDate(8, cIDate);
            preStm.setDate(9, cODate);
      
            preStm.setString(10, dto.getImg());
            int tourID = dto.getTourID();
            preStm.setInt(11, tourID);
            

            result = preStm.executeUpdate();
        } catch (SQLException e) {
        } finally {
            closeConnection();
        }

        return result > 0;
    }
    
    public TourDTO getTourByID(int tourID)
    {
        TourDTO dto = null;
        
        String sql = "select tourName, description, price, numberTicket, vehicle, desLocation, depLocation, checkInDate, checkOutDate, Img from tbl_Tour where tourID = ?";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, tourID);
            rs = preStm.executeQuery();
            if(rs.next())
            {
                
               
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
                
                dto = new TourDTO(tourID, tourName, desc, vehicle, price, true, nTicket, depLocation, desLocation, checkInDate, checkOutDate, img);
               
                
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return dto;
    }
    
    public boolean deleteTourisDelete(int tourID)
    {
        int result = 0;
        String sql = "Update tbl_Tour set isDelete ='true' where tourID = ?";
        conn = MyConnection.getMyConnection();
        try{
            preStm = conn.prepareStatement(sql);
            
            preStm.setInt(1, tourID);
            result = preStm.executeUpdate();
        } catch(Exception e)
        {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return result > 0;
    }
    
    public List<TourDTO> searchTourByName(String name)
    {
         TourDTO dto = null;
         List<TourDTO> result = null;
        try {
            //String sql = "Select AccessoryID, AccessoryName, Price, Description, Brand, isDelete From tbl_Accessories where AccessoryID = ?";
            String sql = "Select tourID, tourName, description, price, numberTicket, vehicle, isDelete, desLocation, depLocation, checkInDate, checkOutDate, Img from tbl_Tour where isDelete = 'false' and TourName Like ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, "%" + name +"%");
            rs = preStm.executeQuery();
            result = new ArrayList<>();
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
                //dto = new TourDTO(tourID, tourName, desc, vehicle, depLocation, desLocation, checkInDate, checkOutDate, price, false, nTicket);
                dto = new TourDTO(tourID, tourName, desLocation, vehicle, price, true, nTicket, depLocation, desLocation, checkInDate, checkOutDate, img);

                result.add(dto);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConnection();
        }
        
        return result;
    }
    
}
