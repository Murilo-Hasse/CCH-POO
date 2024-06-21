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
public class Main {
    public static void main(String[] args) {

        ClienteHttp clienteHttp = new ClienteHttp();
        String jsonString = clienteHttp.buscaDados("https://www.googleapis.com/books/v1/volumes?q=java");
        Deserializer deserializer = new Deserializer();
        VolumeDTO volumeDTO = deserializer.deserialize(jsonString);
        volumeDTO.print();
    }
}