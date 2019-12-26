package ru.geekbrains.datamapper;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}
