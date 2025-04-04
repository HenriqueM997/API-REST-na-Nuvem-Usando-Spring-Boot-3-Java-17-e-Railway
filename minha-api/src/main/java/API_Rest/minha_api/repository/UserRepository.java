package API_Rest.minha_api.repository;

import API_Rest.minha_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}