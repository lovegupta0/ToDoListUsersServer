package com.ToDoListUsers.ToDoListUsers.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {
    @Id
    private String email;
    private String fname;
    private String lname;
    private  String password;
}
