/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.dtos;

import java.util.Date;

/**
 *
 * @author Luu Thieu Gia
 */
public class TourDTO {
    public int tourID;
    private String tourName, description, vehicle;
    
    private float price;
    private boolean isDelete;
    private int numberTicket;
    
    private String depLocation, desLocation;
    private Date checkInDate, checkOutDate;
    
    private String img;
    
    
    
    public TourDTO() {
    }

    public TourDTO(int tourID, String tourName, float price) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.price = price;
    }
    
    

    public TourDTO(String tourName, String description, String vehicle, float price, boolean isDelete, int numberTicket, String depLocation, String desLocation, Date checkInDate, Date checkOutDate, String img) {
        this.tourName = tourName;
        this.description = description;
        this.vehicle = vehicle;
        this.price = price;
        this.isDelete = isDelete;
        this.numberTicket = numberTicket;
        this.depLocation = depLocation;
        this.desLocation = desLocation;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.img = img;
    }

    public TourDTO(int tourID, String tourName, String description, String vehicle, float price, boolean isDelete, int numberTicket, String depLocation, String desLocation, Date checkInDate, Date checkOutDate, String img) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.description = description;
        this.vehicle = vehicle;
        this.price = price;
        this.isDelete = isDelete;
        this.numberTicket = numberTicket;
        this.depLocation = depLocation;
        this.desLocation = desLocation;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.img = img;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof TourDTO))
        {
            return false;
        }
        TourDTO other = (TourDTO) obj;
        if((this.tourID == 0 && other.tourID != 0) || (this.tourID != 0 && this.tourID != other.tourID))
                {
                    return false;
                }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tourID != 0 ? tourID : 0);
        return hash;
    }

   
    
    
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
    
    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }

    public String getDesLocation() {
        return desLocation;
    }

    public void setDesLocation(String desLocation) {
        this.desLocation = desLocation;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isIsDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }
    
    
}
