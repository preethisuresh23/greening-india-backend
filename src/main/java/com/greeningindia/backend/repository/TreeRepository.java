package com.greeningindia.backend.repository;

import com.greeningindia.backend.model.Tree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeRepository extends JpaRepository<Tree, Long> {
}
