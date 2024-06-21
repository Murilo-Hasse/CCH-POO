package po23s.DTO;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.ArrayList;

public class VolumeDTO {
    private ArrayList<BookDTO> volume = new ArrayList<>();

    public boolean add(BookDTO bookDTO) {
        return volume.add(bookDTO);
    }
    public List<String> getVolumeStrings() {
        List<String> bookStrings = new ArrayList<>();
        for (BookDTO bookDTO : volume) {
            bookStrings.add(bookDTO.toString());
        }
        return bookStrings;
    }
}
