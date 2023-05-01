package com.ToDoListUsers.ToDoListUsers.Repo;

import com.ToDoListUsers.ToDoListUsers.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,String> {
   public Users findByEmail(String email);
}
