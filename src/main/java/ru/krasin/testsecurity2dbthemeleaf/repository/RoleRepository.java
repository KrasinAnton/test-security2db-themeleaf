package ru.krasin.testsecurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.krasin.testsecurity2dbthemeleaf.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
