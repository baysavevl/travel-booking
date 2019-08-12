/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import com.opensymphony.xwork2.ActionContext;
import java.util.Map;
import vinhl.daos.BillDAO;

/**
 *
 * @author Luu Thieu Gia
 */
public class ModifyTourUserAction {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

  
    
    
    
    public ModifyTourUserAction() {
    }
    
    public String execute() throws Exception {
        BillDAO dao = new BillDAO();
        Map session = ActionContext.getContext().getSession();
        int id = (int) session.get("BILLID");
        //BillDTO dto = dao.getBillByID(id);
        if(dao.checkUpdate(id, this.getNumber()))
        {
            return "success";
        }
        return "success";
    }
    
}
