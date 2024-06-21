package po23s.main;

import po23s.DTO.BookDTO;
import po23s.DTO.VolumeDTO;
import po23s.deserialer.Deserializer;
import po23s.http.ClienteHttp;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;
import po23s.http.TelaPOO;

public class Main {

    public static void main(String[] args) {

        ClienteHttp clienteHttp = new ClienteHttp();
        String jsonString = clienteHttp.buscaDados("https://www.googleapis.com/books/v1/volumes?q=java");
        Deserializer deserializer = new Deserializer();
        VolumeDTO volumeDTO = deserializer.deserialize(jsonString);
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
