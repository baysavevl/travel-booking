/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;


import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import java.util.Date;
import java.util.List;
import vinhl.daos.TourDAO;
import vinhl.dtos.TourDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class InsertTourAction {
    private String tourName, description, vehicle;
    private float price;
    private boolean isDelete;
    private int numberTicket;
    private List<TourDTO> list;
    private String depLocation, desLocation;
    private Date checkInDate, checkOutDate;
    
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    

    public String getDepLocation() {
        return depLocation;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Depart Location is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "3", maxLength = "40",
                        message = "Depart Location length must be 6 to 20 chars"
                        )
    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }

    public String getDesLocation() {
        return desLocation;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Destinate Location is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "3", maxLength = "40",
                        message = "Destinate Location length must be 6 to 20 chars"
                        )
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
    
    
    
    
    public String getTourName() {
        return tourName;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Tour Name is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "3", maxLength = "40",
                        message = "Tour Name length must be 3 to 40 chars"
                        )
    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getDescription() {
        return description;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Description is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "3", maxLength = "40",
                        message = "Description length must be 3 to 40 chars"
                        )
    public void setDescription(String description) {
        this.description = description;
    }

    public String getVehicle() {
        return vehicle;
    }

    @RequiredStringValidator(type = ValidatorType.FIELD, message = "Vehicle is required")
    @StringLengthFieldValidator(type = ValidatorType.FIELD,
                        minLength = "3", maxLength = "40",
                        message = "Vehicle length must be 3 to 40 chars"
                        )
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

    public List<TourDTO> getList() {
        return list;
    }

    public void setList(List<TourDTO> list) {
        this.list = list;
    }
    
    
    
    
    
    public InsertTourAction() {
    }
    
    public String execute() throws Exception {
        TourDAO dao = new TourDAO();
        
        TourDTO dto = new TourDTO(tourName, description, vehicle, price, isDelete, numberTicket, depLocation, desLocation, checkInDate, checkOutDate, img);
        if(dao.insertTour(dto))
        {
            list = dao.getList();
            return "success";
        }
        
        return "fail";
    }
}
