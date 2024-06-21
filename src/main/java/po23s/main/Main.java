package po23s.main;

import po23s.DTO.BookDTO;
import po23s.http.ClienteHttp;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ClienteHttp clienteHttp = new ClienteHttp();
        String jsonString = clienteHttp.buscaDados("https://www.googleapis.com/books/v1/volumes?q=java&projection=lite&maxResults=30");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode rootNode = objectMapper.readTree(jsonString);
            JsonNode volumeInfo = rootNode.path("volumeInfo");
            JsonNode saleInfo = rootNode.path("saleInfo");
            JsonNode accessInfo = rootNode.path("accessInfo");

            BookDTO bookInfo = new BookDTO();

            bookInfo.setTitle(volumeInfo.path("title").asText());
            bookInfo.setAuthors(Arrays.stream(objectMapper.convertValue(volumeInfo.path("authors"), String[].class)).collect(Collectors.joining(", ")));
            bookInfo.setPublisher(volumeInfo.path("publisher").asText());
            bookInfo.setPdfAvailability(accessInfo.path("pdf").path("isAvailable").asBoolean());
            bookInfo.setPrice(new BigDecimal(saleInfo.path("listPrice").path("amount").asDouble()));

            System.out.println(bookInfo);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
