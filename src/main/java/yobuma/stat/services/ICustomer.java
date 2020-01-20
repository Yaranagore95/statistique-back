package yobuma.stat.services;

import yobuma.stat.models.YobBookproCustomer;

import java.util.List;

public interface ICustomer {


    List<YobBookproCustomer> all();

    YobBookproCustomer getOne(int id);

    YobBookproCustomer findOne(String email);

    YobBookproCustomer findByUser(int userId);

    void delete(int id);

}
