/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.dummyController;
import view.MainMenu;

/**
 *
 * @author Irvan
 */
public class Main {

    public void main() {
        new dummyController();
        new MainMenu();
    }
    
    public static void main(String[] args) {
        Main run = new Main();
        run.main();
    }
    
}
