package yobuma.stat.services;

import yobuma.stat.models.YobBookproBusSeattemplate;

import java.util.List;

public interface IBusSeattemplate {


    List<YobBookproBusSeattemplate> all();

    YobBookproBusSeattemplate getOne(int id);

    YobBookproBusSeattemplate findOne(String title);

    void delete(int id);

}
