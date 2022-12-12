package service;

import models.Goods;
import models.MainPage;

import java.util.HashSet;
import java.util.List;

public interface GoodService {

    List<Integer> synchronizer(HashSet<Integer> opencart, HashSet<Integer> stores);
    List<String> filtered(List<String> stringList, String findBy);
    MainPage mainPage();
}
