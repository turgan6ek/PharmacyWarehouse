package kz.iitu.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "requests")
public class Requests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Requests() {

    }
    public Requests(String name, String manufacturer, Long quantity) {
         this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
    }

    private String name;
    private String manufacturer;
    private Long quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
