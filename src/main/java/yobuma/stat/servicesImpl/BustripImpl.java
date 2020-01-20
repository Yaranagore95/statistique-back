package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproBustrip;
import yobuma.stat.repositories.YobBookproBustripRepository;
import yobuma.stat.services.IBustrip;
import java.util.List;
import java.util.Optional;

@Service("bustripSrc")
public class BustripImpl implements IBustrip {

    private final YobBookproBustripRepository repository;

    public BustripImpl(YobBookproBustripRepository bustripRepository) {
        this.repository = bustripRepository;
    }

    @Override
    public List<YobBookproBustrip> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproBustrip getOne(int id) {
        Optional<YobBookproBustrip> yobBookproBustrip = repository.findById(id);
        return yobBookproBustrip.orElse(null);
    }

    @Override
    public YobBookproBustrip findOne(String code) {
        return repository.findByCode(code);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<YobBookproBustrip> agentLignes(int agentId) {
        return repository.agentLignes(agentId);
    }
}
