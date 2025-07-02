package com.xworksz.xworkzapp.repository.impl;

import com.xworksz.xworkzapp.dto.MarkdDto;
import com.xworksz.xworkzapp.repository.MarksRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MarksRepoImpl implements MarksRepo {
    @Override
    public boolean save(MarkdDto dto) {
        boolean isMarksSaved = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts","root","Tejaswa7899@!#");
            PreparedStatement sqlQuery=conn.prepareStatement("insert into marks(Name,Email,Mobile_Number,Marks) values(?,?,?,?)");
            sqlQuery.setString(1,dto.getName());
            sqlQuery.setString(2,dto.getEmail());
            sqlQuery.setString(3, dto.getMobileNumber());
            sqlQuery.setInt(4,dto.getMarks());

           int nore= sqlQuery.executeUpdate();
            if(nore>0){
                isMarksSaved=true;
            }

        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return isMarksSaved;
    }
}
