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
public class ViewCartUserAction {
    
    private int userID;
    private List<BillDTO> listCart;
    private List<BillDTO> listPaidCart;

    public List<BillDTO> getListPaidCart() {
        return listPaidCart;
    }

    public void setListPaidCart(List<BillDTO> listPaidCart) {
        this.listPaidCart = listPaidCart;
    }
    
    
 
    

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<BillDTO> getListCart() {
        return listCart;
    }

    public void setListCart(List<BillDTO> listCart) {
        this.listCart = listCart;
    }
    
    
    public ViewCartUserAction() {
    }
    
    public String execute() throws Exception {
          listCart = null;
          Map session = ActionContext.getContext().getSession();
          int id = (int) session.get("ID");
          this.setUserID(id);
          BillDAO dao = new BillDAO();
          listCart = dao.getBillunPaidByUserID(userID);
          
          listPaidCart = dao.getBillPaidByUserID(userID);
          session.put("CART", listCart);
          
          return "success";
    }
    
}
