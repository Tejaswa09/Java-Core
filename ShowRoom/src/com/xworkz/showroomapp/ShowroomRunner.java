package com.xworkz.showroomapp;

import com.xworkz.showroomapp.Manager.Manager;
import com.xworkz.showroomapp.showroom.Showroom;
import com.xworkz.showroomapp.staff.Staff;

public class ShowroomRunner {
    public static void main(String[] args) {
        Showroom showroom=new Showroom();
        showroom. showroomId=1;
        showroom.showroomName="Nexa";


        Manager manager1=new Manager();
        manager1.managerId=1;
        manager1.managerName="Tejaswa";


        String [] staffNamesList1={"Rakshita","Manoj","Ankith"};
        String[] staffNamesList2={"Jeevitha","Ramesh"};
        Staff [] staffs=new Staff[2];

        Staff staff1=new Staff();
        staff1.staffId=1;
        staff1.staffNames=staffNamesList1;
        staffs[0]=staff1;

        Staff staff2=new Staff();
        staff2.staffId=2;
        staff2.staffNames=staffNamesList2;
        staffs[1]=staff2;

        manager1.staffs=staffs;
        showroom.manager=manager1;
        showroom.fetchDetails();






    }
}
