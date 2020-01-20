package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproBustrip;

import java.util.List;

@Repository(value="bustripRepository")
public interface YobBookproBustripRepository extends JpaRepository<YobBookproBustrip, Integer> {
    YobBookproBustrip findByCode(String code);

    @Query(value = "SELECT y FROM YobBookproBustrip y WHERE y.yobBookproAgent.id = :id")
    List<YobBookproBustrip> agentLignes(@Param("id") int agentId);

    @Query(value = "SELECT distinct y.route FROM YobBookproBustrip y")
    List<String> distinctRoutes();

    @Query(value = "SELECT distinct y.route FROM YobBookproBustrip y where y.yobBookproAgent.id = :id")
    List<String> distinctRoutesByAgent(@Param("id") int agentId);


    /*@Query("SELECT y FROM YobBookproBustrip y WHERE y.yobBookproBus.id = :id")
    List<YobBookproBustrip> lignesByBus(@Param("id") int bus_id);

    @Query("SELECT y FROM YobBookproBustrip y WHERE y.yobBookproAgent.id = :id")
    List<YobBookproBustrip> lignesByAgent(@Param("id") int agent_id);

    @Query("SELECT distinct y.from FROM YobBookproBustrip y WHERE  y.yobBookproAgent.id = :id")
    List<Integer> ligneByAgentByFrom(@Param("id") int agent_id);

    @Query("SELECT y FROM YobBookproBustrip y WHERE y.from = :id AND y.yobBookproAgent.id=:agent")
    List<YobBookproBustrip> ligneByFrom(@Param("id") int from_id, @Param("agent") int agent_id);

    //@Query("SELECT distinct y.to FROM YobBookproBustrip y WHERE y.from=:id1 and YobBookproBustrip.yobBookproAgent.id =:id2")
    //List<Integer> lignesByTo(@Param("id1") int from_id, @Param("id2") int agent_id);

    @Query("SELECT distinct y.to FROM YobBookproBustrip y WHERE y.yobBookproAgent.id=:agent")
    List<Integer> lignesByTo(@Param("agent") int agent_id);

    @Query("SELECT y FROM YobBookproBustrip y WHERE y.route = :route")
    List<YobBookproBustrip> lignesByRoutes(@Param("route") String route);*/
}
