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
public class RemoveFromCartAction {
    private int billID;
    private List<BillDTO> listCart;
    private List<BillDTO> listPaidCart;

    public int getBillID() {
        return billID;
    }

    public List<BillDTO> getListPaidCart() {
        return listPaidCart;
    }

    public void setListPaidCart(List<BillDTO> listPaidCart) {
        this.listPaidCart = listPaidCart;
    }

    
    
    public void setBillID(int billID) {
        this.billID = billID;
    }

    public List<BillDTO> getListCart() {
        return listCart;
    }

    public void setListCart(List<BillDTO> listCart) {
        this.listCart = listCart;
    }
    
    
    
    public RemoveFromCartAction() {
    }
    
    public String execute() throws Exception {
        BillDAO dao = new BillDAO();
        dao.deleteBillByID(billID);
        
        listCart = null;
        Map session = ActionContext.getContext().getSession();
        int id = (int) session.get("ID");
        
        //BillDAO dao = new BillDAO();
        listCart = dao.getBillunPaidByUserID(id);
        listPaidCart = dao.getBillPaidByUserID(id);
        
        return "success";
    }
    
}
