package po23s.deserialer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import po23s.DTO.BookDTO;
import po23s.DTO.VolumeDTO;

import java.util.Arrays;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Deserializer {

    public VolumeDTO deserialize(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        VolumeDTO volumes = new VolumeDTO();
        try {
            JsonNode rootNode = objectMapper.readValue(jsonString, JsonNode.class);
            JsonNode itemsNode = rootNode.path("items");

            if (itemsNode.isArray()) {
                for (JsonNode itemNode : itemsNode) {
                    JsonNode volumeInfo = itemNode.path("volumeInfo");
                    JsonNode saleInfo = itemNode.path("saleInfo");
                    JsonNode accessInfo = itemNode.path("accessInfo");

                    BookDTO bookInfo = new BookDTO();

                    bookInfo.setTitle(volumeInfo.path("title").asText());
                    bookInfo.setsubTitle(volumeInfo.path("subtitle").asText());
                    if (volumeInfo.has("authors")) {
                        String[] authorsArray = objectMapper.convertValue(volumeInfo.path("authors"), String[].class);
                        bookInfo.setAuthors(Arrays.stream(authorsArray).collect(Collectors.joining(", ")));
                    } else {
                        bookInfo.setAuthors("Desconhecidos");
                    }

                    bookInfo.setPublisher(volumeInfo.path("publisher").asText());

                    if (accessInfo.has("pdf")) {
                        bookInfo.setPdfAvailability(accessInfo.path("pdf").path("isAvailable").asBoolean());
                    } else {
                        bookInfo.setPdfAvailability(false); // Define false se não houver informações de PDF
                    }

                    // Verificação do campo "listPrice"
                    if (saleInfo.has("listPrice")) {
                        bookInfo.setPrice((saleInfo.path("listPrice").path("amount").asDouble()));
                    } else {
                        bookInfo.setPrice(0.0); // Define zero se não houver informações de preço
                    }
                    volumes.add(bookInfo);
                }
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return volumes;
    }
}
