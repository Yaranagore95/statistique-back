package yobuma.stat.services;

import yobuma.stat.models.YobBookproDest;

import java.util.List;

public interface IDest {

    List<YobBookproDest> all();

    YobBookproDest getOne(int id);

    void delete(int id);
}
