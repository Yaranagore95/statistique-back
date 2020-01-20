package yobuma.stat.services;

import yobuma.stat.models.YobBookproBusstop;

import java.util.List;

public interface IBusstop {

    List<YobBookproBusstop> all();

    YobBookproBusstop getOne(int id);

    void delete(int id);

}
