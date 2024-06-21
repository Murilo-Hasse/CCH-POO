package po23s.DTO;

import java.util.List;
import java.util.ArrayList;

public class VolumeDTO {
    public ArrayList<BookDTO> volume = new ArrayList<>();

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
    public List<String> getArrayTitle() {
        List<String> bookStrings = new ArrayList<>();
        for (BookDTO bookDTO : volume) {
            bookStrings.add(bookDTO.getTitle());
        }
        return bookStrings;
    }

    public BookDTO getVolumeByIndex(int index) {
        return volume.get(index);
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
