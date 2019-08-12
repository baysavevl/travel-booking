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
public class BillDTO implements Serializable{
    
    private int billID, userID, tourID, number, isPaid;
    private float price, total;
    
    private String tourName;

    public BillDTO() {
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public BillDTO(int userID, int tourID, int number, int isPaid, float price, float total, String tourName) {
        this.userID = userID;
        this.tourID = tourID;
        this.number = number;
        this.isPaid = isPaid;
        this.price = price;
        this.total = total;
        this.tourName = tourName;
    }

    
    
    public BillDTO(int userID, int tourID, int number, int isPaid, float price, float total) {
        this.userID = userID;
        this.tourID = tourID;
        this.number = number;
        this.isPaid = isPaid;
        this.price = price;
        this.total = total;
    }

    public BillDTO(int billID, int userID, int tourID, int number, int isPaid, float price, float total, String tourName) {
        this.billID = billID;
        this.userID = userID;
        this.tourID = tourID;
        this.number = number;
        this.isPaid = isPaid;
        this.price = price;
        this.total = total;
        this.tourName = tourName;
    }
    
    
    

    public BillDTO(int billID, int userID, int tourID, int number, int isPaid, float price, float total) {
        this.billID = billID;
        this.userID = userID;
        this.tourID = tourID;
        this.number = number;
        this.isPaid = isPaid;
        this.price = price;
        this.total = total;
    }
    
    

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(int isPaid) {
        this.isPaid = isPaid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
