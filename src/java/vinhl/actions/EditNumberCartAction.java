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
public class EditNumberCartAction {
    
   private int billID;
   private BillDTO bill;

    public BillDTO getBill() {
        return bill;
    }

    public void setBill(BillDTO bill) {
        this.bill = bill;
    }
   
   

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

  
    
    public EditNumberCartAction() {
    }
    
    public String execute() throws Exception {
        
        BillDAO dao = new BillDAO();
        
        
        bill = dao.getBillByID(billID);
        Map session = ActionContext.getContext().getSession();
        session.put("BILLID", billID);
        return "success";
    }
    
}
