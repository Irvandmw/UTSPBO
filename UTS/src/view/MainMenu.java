/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import main.Main;
import controller.*;

/**
 *
 * @author Irvan
 */
public class MainMenu {
    public MainMenu() {
        showUserData();
    }
    
    private void showUserData(){
        boolean status = false;
            while (status == false){
                String pilihan = JOptionPane.showInputDialog(null, 
                        "1.Show User Post\n"
                        + "2.Show Post\n"
                        + "3.Change Post State\n"
                        + "4.Show User Best Post\n");
                switch (pilihan){
                    case "1" :
                        showUserPost show = new showUserPost();
                        JOptionPane.showMessageDialog(null, show.showUserPost(dummyController.userPosts));
                        break; 
                        
//                    case "2" :
//                        showPost show = new showPost();
//                        ID = JOptionPane.showInputDialog(null, "Masukkan ID : ", JOptionPane.QUESTION_MESSAGE);
//                        JOptionPane.showMessageDialog(null, controller.showPost(ID, kodeMk, Main.listUser));
//                        break;
//                        
//                    case "3" :
//                        kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ", JOptionPane.QUESTION_MESSAGE);
//                        JOptionPane.showMessageDialog(null, control.printRataNilai(kodeMk, Main.listUser));
//                        break;
//                    
//                    case "4" :
//                        kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ", JOptionPane.QUESTION_MESSAGE);
//                        JOptionPane.showMessageDialog(null, control.printMahasiswaTidakLulus(kodeMk, Main.listUser));
//                        break;
//                        
//                    default:
//                        JOptionPane.showMessageDialog(null, "Input Error","", JOptionPane.ERROR_MESSAGE);
                        
                }
            
        }
    }
}
