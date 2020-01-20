package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproDest;

@Repository(value = "destRepository")
public interface YobBookproDestRepository extends JpaRepository<YobBookproDest, Integer> {

}
