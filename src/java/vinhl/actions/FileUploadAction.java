/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinhl.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.ValidationAware;
import java.io.File;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Luu Thieu Gia
 */
public class FileUploadAction extends ActionSupport implements ModelDriven<FileUploadModel>, ValidationAware{  
    
    public FileUploadAction() {
    }
    
    FileUploadModel model = new FileUploadModel();  

      public String index(){  
           return SUCCESS;  
      }  

      public String performUpload(){  
           try{  
                File f = model.getInputFile();  
                if(f == null){  
                     addFieldError("inputFile", "The input file is required");  
                     return INPUT;  
                }  

                String fileName = model.getInputFileFileName();  
                String contentType = model.getInputFileContentType();  
                FileUtils.copyFile(f, new File(fileName));  
                model.setSuccessMsg("Upload success ! File name: "+ fileName +", File content type: "+contentType+", File size: "+f.length() + " byte(s).");  
                return SUCCESS;  
           }catch(Exception e){  
                return ERROR;  
           }  
      }  

      public FileUploadModel getModel() {  
           return model;  
      }  
    
    public String execute() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
