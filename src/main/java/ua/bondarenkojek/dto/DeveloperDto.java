package ua.bondarenkojek.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class DeveloperDto {
    private Long id;
    private String name;
    private int age;
    private double salary;
}
