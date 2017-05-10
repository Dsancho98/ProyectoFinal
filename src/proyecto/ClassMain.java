/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.SQLException;

/**
 *
 * @author AlumMati
 */
public class ClassMain {
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws SQLException {
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
    }
}
