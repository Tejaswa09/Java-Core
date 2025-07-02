package com.xworksz.xworkzapp.service.impl;

import com.xworksz.xworkzapp.dto.MarkdDto;
import com.xworksz.xworkzapp.repository.MarksRepo;
import com.xworksz.xworkzapp.repository.impl.MarksRepoImpl;
import com.xworksz.xworkzapp.service.ResultValidateAndSave;

public class ResultValidateAndSaveimpl implements ResultValidateAndSave {
    MarksRepo repo;
    public ResultValidateAndSaveimpl(){
    repo= new MarksRepoImpl();
    }
    @Override
    public boolean validateAndSave(MarkdDto dto) {
        boolean isValidatedAndSaved = false;
        if(dto.getName()!=null && !dto.getName().isEmpty() && dto.getEmail()!=null && !dto.getEmail().isEmpty() && dto.getMobileNumber()!= null && !dto.getMobileNumber().isEmpty() && dto.getMarks() > 30){
            isValidatedAndSaved =repo.save(dto);
        }
        return isValidatedAndSaved;
    }
}
