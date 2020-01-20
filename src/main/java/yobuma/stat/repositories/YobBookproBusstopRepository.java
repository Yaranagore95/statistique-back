package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproBusstop;

@Repository(value = "busstopRepository")
public interface YobBookproBusstopRepository extends JpaRepository<YobBookproBusstop, Integer> {

}
