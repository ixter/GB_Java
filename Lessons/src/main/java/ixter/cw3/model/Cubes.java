package ixter.cw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cubes {
    private String color;
    private Integer size;
    private String material;

    public int getVolume() {
        return this.size * this.size * this.size;
    }
}