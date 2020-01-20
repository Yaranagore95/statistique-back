package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproDest;
import yobuma.stat.repositories.YobBookproDestRepository;
import yobuma.stat.services.IDest;

import java.util.List;
import java.util.Optional;

@Service("destSrc")
public class DestImpl implements IDest {

    private final YobBookproDestRepository repository;

    public DestImpl(YobBookproDestRepository destRepository) {
        this.repository = destRepository;
    }

    @Override
    public List<YobBookproDest> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproDest getOne(int id) {
        Optional<YobBookproDest> yobBookproDest = repository.findById(id);
        return yobBookproDest.orElse(null);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
