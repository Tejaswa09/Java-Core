package com.xworksz.xworkzapp.servlet;


import com.xworksz.xworkzapp.dto.MarkdDto;
import com.xworksz.xworkzapp.service.ResultValidateAndSave;
import com.xworksz.xworkzapp.service.impl.ResultValidateAndSaveimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/examResult")
public class ExamResultSaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String  email=req.getParameter("email");
        String mobileNumber = req.getParameter("mobileNumber");
        int marks = Integer.parseInt(req.getParameter("marks"));

        MarkdDto dto = new MarkdDto();
        dto.setName(name);
        dto.setEmail(email);
        dto.setMobileNumber(mobileNumber);
        dto.setMarks(marks);


        ResultValidateAndSave resultValidateAndSave = new ResultValidateAndSaveimpl();
        PrintWriter output = resp.getWriter();
        if(resultValidateAndSave.validateAndSave(dto)){

        output.write("Thank You "+name+",Your Marks Are stored");
        }else{
            output.write("Marks not saved");
        }
    }
}
