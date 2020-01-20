package yobuma.stat.services;

import yobuma.stat.models.YobBookproAgent;

import java.util.List;

public interface IAgent {

    List<YobBookproAgent> all();

    YobBookproAgent getOne(int id);

    YobBookproAgent getByUserId(int userId);

    YobBookproAgent findOne(String email);

    void delete(int id);
}
