package PP_3_1_4.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import PP_3_1_4.model.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
}