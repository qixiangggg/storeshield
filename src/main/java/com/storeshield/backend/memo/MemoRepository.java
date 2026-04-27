package com.storeshield.backend.memo;

import com.storeshield.backend.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findByUser(User user);
}
