/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import visuals.Login;
import visuals.LayoutAdmin;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Alam!!!");
        Login login = new Login();
        LayoutAdmin layoutAdmin = new LayoutAdmin();
        login.setVisible(true);
//        layoutAdmin.setVisible(true);
    }
    
}
