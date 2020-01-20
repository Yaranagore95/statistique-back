package yobuma.stat.services;

import yobuma.stat.dto.YobBookproOrderRequestDto;
import yobuma.stat.models.YobBookproOrderRequest;

import java.util.List;

public interface IOrdersRequest {

    YobBookproOrderRequest add(YobBookproOrderRequestDto yobBookproOrderRequestDto);

    List<YobBookproOrderRequest> all();

    YobBookproOrderRequest getOne(int id);

    YobBookproOrderRequest findOne(int createdBy);

    void delete(int id);

    YobBookproOrderRequestDto update(YobBookproOrderRequestDto yobBookproOrderRequestDto);
}
