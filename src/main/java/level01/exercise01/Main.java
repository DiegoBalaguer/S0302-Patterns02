package level01.exercise01;

import level01.exercise01.application.ApplicationController;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 07/06/2025
 */

public class Main {

    public static void main(String[] args) {
        ApplicationController.getInstance().run();

        System.out.println("PROCESS FINISHED...");
    }
}