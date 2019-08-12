/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;
import vinhl.daos.BillDAO;
import vinhl.dtos.BillDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class ViewCartUserAdminAction {
    private int userID;
    
    private List<BillDTO> listPaidCart;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<BillDTO> getListPaidCart() {
        return listPaidCart;
    }

    public void setListPaidCart(List<BillDTO> listPaidCart) {
        this.listPaidCart = listPaidCart;
    }
    
    
    
    
    public ViewCartUserAdminAction() {
    }
    
    public String execute() throws Exception {
        
          
          BillDAO dao = new BillDAO();
        
          
          listPaidCart = dao.getBillPaidByUserID(this.getUserID());
          
          
          return "success";
    }
    
}
