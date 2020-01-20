package yobuma.stat.servicesImpl;

import org.springframework.stereotype.Service;
import yobuma.stat.models.YobBookproAgent;
import yobuma.stat.repositories.YobBookproAgentRepository;
import yobuma.stat.services.IAgent;

import java.util.List;
import java.util.Optional;

@Service("agentSrc")
public class AgentImpl implements IAgent {

    private final YobBookproAgentRepository repository;

    public AgentImpl(YobBookproAgentRepository agentRepository) {
        this.repository = agentRepository;
    }

    @Override
    public List<YobBookproAgent> all() {
        return repository.findAll();
    }

    @Override
    public YobBookproAgent getOne(int id) {
        Optional<YobBookproAgent> yobBookproAgent = repository.findById(id);
        return yobBookproAgent.orElse(null);
    }

    @Override
    public YobBookproAgent findOne(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public YobBookproAgent getByUserId(int userId) {
        return repository.getAgentByUserId(userId);
    }
}
