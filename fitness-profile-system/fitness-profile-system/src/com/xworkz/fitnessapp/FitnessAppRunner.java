package com.xworkz.fitnessapp;

import com.xworkz.fitnessapp.constants.FitnessGoal;
import com.xworkz.fitnessapp.dto.FitnessUserProfileDto;
import com.xworkz.fitnessapp.generate.FitnessApp;

public class FitnessAppRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        FitnessUserProfileDto dto = new FitnessUserProfileDto();
        dto.setUserName("Rahul Sharma");
        dto.setEmail("rahul.fitness@gmail.com");
        dto.setAge(28);
        dto.setWeight(72.5);
        dto.setHeight(5.9);
        dto.setGoal(FitnessGoal.MUSCLE_GAIN);
        dto.setPreferredWorkoutTime("Morning");

        System.out.println(dto);
        FitnessApp app = new FitnessApp();
        app.registerUser(dto);
//        app.geDetails();

        FitnessUserProfileDto dto1 = new FitnessUserProfileDto();
        dto1.setUserName("Rahul Sharma");
        dto1.setEmail("rahul.fitness@gmail.com");
        dto1.setAge(28);
        dto1.setWeight(72.5);
        dto1.setHeight(5.9);
        dto1.setGoal(FitnessGoal.MUSCLE_GAIN);
        dto1.setPreferredWorkoutTime("Morning");

        System.out.println(dto.equals(dto1));
    }
}
