package com.crud.app.rest.Repository;

import com.crud.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Task, Long> {
}
