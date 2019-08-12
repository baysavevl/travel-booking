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
import vinhl.daos.TourDAO;
import vinhl.dtos.BillDTO;
import vinhl.dtos.TourDTO;

/**
 *
 * @author Luu Thieu Gia
 */
public class PayTourAction {
    private int billID;
    private List<BillDTO> listCart;
    private List<BillDTO> listPaidCart;

    public int getBillID() {
        return billID;
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

    public List<BillDTO> getListPaidCart() {
        return listPaidCart;
    }

    public void setListPaidCart(List<BillDTO> listPaidCart) {
        this.listPaidCart = listPaidCart;
    }
    
    
    
    public PayTourAction() {
    }
    
    public String execute() throws Exception {
        BillDAO dao = new BillDAO();
        
        
        
        listCart = null;
        Map session = ActionContext.getContext().getSession();
        int id = (int) session.get("ID");
        BillDTO dto = dao.getBillByID(billID);
        
        
        int old = dao.getNumberTicketPaidByID(id, dto.getTourID());
        
        
        TourDAO daoT = new TourDAO();
        TourDTO dtoT = daoT.getTourByID(dto.getTourID());
        int left = dtoT.getNumberTicket() - dto.getNumber();
        daoT.updateTicketLeft(dto.getTourID(), left);
        
        if(old == 0)
        {
           dao.updatePaid(billID); 
           
           
        } else
        {
            old += dto.getNumber();
            dto.setNumber(old);
            BillDTO ddto = dao.getBillPaidByID(id, dto.getTourID());
            dao.checkUpdate(ddto.getBillID(), old);
            dao.deleteBillByID(billID);
        }
        
        listCart = dao.getBillunPaidByUserID(id);
        listPaidCart = dao.getBillPaidByUserID(id);
        float total = dao.totalMoneyByID(id);
        session.put("TOTAL", total);
        
        return "success";
    }
    
    
}
