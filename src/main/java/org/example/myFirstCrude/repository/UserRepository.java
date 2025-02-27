package org.example.myFirstCrude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.myFirstCrude.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
