package yobuma.stat.services;

import yobuma.stat.dto.YobBookproOrdersLogDto;
import yobuma.stat.models.YobBookproOrdersLog;

import java.util.List;

public interface IOrdersLog {

    YobBookproOrdersLog add(YobBookproOrdersLog YobBookproOrdersLogDto);

    List<YobBookproOrdersLog> all();

    YobBookproOrdersLog getOne(int id);

    YobBookproOrdersLog findOne(String email);

    void delete(int id);

    YobBookproOrdersLogDto update(YobBookproOrdersLogDto yobBookproOrdersLogDto);
}
