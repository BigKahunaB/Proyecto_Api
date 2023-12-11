package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String apellido_p;
    private String apellido_m;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_p")
    public String getDescription() {
        return apellido_p;
    }

    public void setDescription(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    @ColumnName("apellido_m")
    public String getPrice() {
        return apellido_m;
    }

    public void setPrice(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    @ColumnName("rfc")
    public String getQuantity() {
        return rfc;
    }

    public void setQuantity(String rfc) {
        this.rfc = rfc;
    }

}