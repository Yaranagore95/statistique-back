package yobuma.stat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yobuma.stat.models.YobBookproBusSeattemplate;

@Repository(value="seatTemplateRepository")
public interface YobBookproBusSeattemplateRepository extends JpaRepository<YobBookproBusSeattemplate, Integer> {
    YobBookproBusSeattemplate findByTitle(String title);
}
