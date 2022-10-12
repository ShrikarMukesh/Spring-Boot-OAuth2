package com.resourceserver;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@Builder
public class BookPriceInfo {
    private Integer bookId;
    private double price;
    private double offer;
}
