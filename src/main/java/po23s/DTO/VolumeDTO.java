package po23s.DTO;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class VolumeDTO {
    private ArrayList<BookDTO> volume = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();


}
