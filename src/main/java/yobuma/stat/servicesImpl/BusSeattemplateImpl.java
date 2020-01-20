package yobuma.stat.servicesImpl;


import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproBusSeattemplate;
import yobuma.stat.repositories.YobBookproBusSeattemplateRepository;
import yobuma.stat.services.IBusSeattemplate;

import java.util.List;
import java.util.Optional;

@Service("seatSrc")
public class BusSeattemplateImpl implements IBusSeattemplate {

    private final YobBookproBusSeattemplateRepository repository;

    public BusSeattemplateImpl(YobBookproBusSeattemplateRepository seatTemplateRepository) {
        this.repository = seatTemplateRepository;
    }

    @Override
    public List<YobBookproBusSeattemplate> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproBusSeattemplate getOne(int id) {
        Optional<YobBookproBusSeattemplate> yobBookproBusSeattemplate = repository.findById(id);
        return yobBookproBusSeattemplate.orElse(null);
    }

    @Override
    public YobBookproBusSeattemplate findOne(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
