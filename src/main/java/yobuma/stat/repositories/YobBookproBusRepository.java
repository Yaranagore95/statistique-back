package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproBus;


@Repository(value = "busRepository")
public interface YobBookproBusRepository extends JpaRepository<YobBookproBus, Integer> {

    YobBookproBus findByCode(String code);

    //@Query("SELECT y FROM YobBookproBus y WHERE y.yobBookproAgent.id = :id")
    // List<YobBookproBus> agentBus(@Param("id") int agent_id);
}
