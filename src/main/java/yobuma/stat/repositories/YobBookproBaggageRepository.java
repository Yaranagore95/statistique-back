package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproBaggage;

@Repository(value="baggageRepository")
public interface YobBookproBaggageRepository extends JpaRepository<YobBookproBaggage, Integer> {

}
