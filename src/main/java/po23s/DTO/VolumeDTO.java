package po23s.DTO;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class VolumeDTO {
    private ArrayList<BookDTO> volume = new ArrayList<>();

    public boolean add(BookDTO bookDTO) {
        return volume.add(bookDTO);
    }
    public void print(){
        for(BookDTO bookDTO : volume){
            System.out.println(bookDTO.toString());
        }
    }
}
