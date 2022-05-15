package service;

import models.Goods;

import java.util.List;

public interface GoodService {
    Goods createOrEdit(Goods goods);
    List<Goods> getAllGoods();

    void showGoodsList();
}
