package mate.academy.springboot.datajpa.dto;

import lombok.Data;

@Data
public class ProductResponseDto {
    private Long id;
    private String title;
    private String price;
    private Long categoryId;
}