package de.thbrandenburg.rt.timetracker.repositories;

import de.thbrandenburg.rt.timetracker.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
