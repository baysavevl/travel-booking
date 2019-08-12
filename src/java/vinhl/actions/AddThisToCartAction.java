/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import vinhl.daos.BillDAO;

import vinhl.dtos.BillDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class AddThisToCartAction {

    private int tourID;
    private int number;

    private int userID, isPaid;
    private float price, total;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
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

    public AddThisToCartAction() {
    }

    public String execute() throws Exception {
        BillDAO dao = new BillDAO();

        Map session = ActionContext.getContext().getSession();
        int id = (int) session.get("ID");
        this.setUserID(id);
        int old = dao.getNumberTicketByID(userID, tourID);
        
        
        String name = dao.getTourNameByID(tourID);
        if (old == 0) {
            
            this.setTotal(this.getNumber() * this.getPrice());
            BillDTO dto = new BillDTO(userID, tourID, number, 0, price, total, name);
            if (dao.insertBill(dto)) {
                return "success";
            }
        } else {
            this.setNumber(old + this.getNumber());
            this.setTotal(old * this.getPrice());
            BillDTO dto = new BillDTO(userID, tourID, number, 0, price, total, name);
            
            if (dao.updateBill(dto)) {
                return "success";
            }
        }

        return "fail";
    }

}
