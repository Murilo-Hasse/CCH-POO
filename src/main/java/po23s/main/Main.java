package po23s.main;

import po23s.DTO.VolumeDTO;
import po23s.deserialer.Deserializer;
import po23s.http.ClienteHttp;
import po23s.http.TelaPOO;

public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPOO dialog = new TelaPOO(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
}