package com.xworkz.polymorphism.ball;

public class BallRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        FootBall football = new FootBall();
        football.type();
        football.material();
        football.size();
        football.weight();
        football.usage();
        System.out.println();

        System.out.println("Parent Details:");
        Ball ball = new Ball();
        ball.type();
        ball.material();
        ball.size();
        ball.weight();
        ball.usage();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Ball footballAsBall = new FootBall();
        footballAsBall.type();
        footballAsBall.material();
        footballAsBall.size();
        footballAsBall.weight();
        footballAsBall.usage();
    }
}
