package po23s.DTO;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDTO {
    private String title;
    private String authors;
    private String publisher;

    @JsonProperty("pdfAvailability")
    private boolean pdfAvailability;

    @JsonProperty("price")
    private double price;

    // Getters e Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isPdfAvailability() {
        return pdfAvailability;
    }

    public void setPdfAvailability(boolean pdfAvailability) {
        this.pdfAvailability = pdfAvailability;
    }
    public boolean getAvaliability() {
        return pdfAvailability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pdfAvailability=" + pdfAvailability +
                ", price=" + price +
                '}';
    }
}
