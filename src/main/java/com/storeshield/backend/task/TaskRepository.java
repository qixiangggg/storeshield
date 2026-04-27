package com.storeshield.backend.task;

import com.storeshield.backend.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserAndIsCompletedFalseOrderByPriority(User user);
}
