package level03.exercise01;

import level03.exercise01.application.ApplicationController;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 08/06/2025
 */

public class Main {

    public static void main(String[] args) {

        ApplicationController applicationController = new ApplicationController();

        applicationController.run();

        System.out.println("PROCESS FINISHED...");
    }
}