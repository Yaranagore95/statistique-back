package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproAgent;

import java.util.List;

@Repository(value="agentRepository")
public interface YobBookproAgentRepository extends JpaRepository<YobBookproAgent, Integer> {

    @Query("SELECT y FROM YobBookproAgent y WHERE y.email = :email")
    YobBookproAgent findByEmail(@Param("email") String email);

    @Query("SELECT y FROM YobBookproAgent y group by y.company")
    List<YobBookproAgent> distinctCompany();

    @Query("SELECT y FROM YobBookproAgent y WHERE y.user = :id")
    YobBookproAgent getAgentByUserId(@Param("id") int userId);
}
