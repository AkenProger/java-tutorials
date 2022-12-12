package service.impl;

import models.Banner;
import models.Goods;
import models.MainPage;
import service.GoodService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class GoodServiceImpl implements GoodService {
    private final List<Goods> goodsData = new ArrayList<>(List.of(
            new Goods(1L, "Iphone XS", 1000, true),
            new Goods(2L, "Iphone XR", 500, true),
            new Goods(3L, "Iphone 13 PRO", 4000, false),
            new Goods(4L, "Iphone 12 +", 3000, true),
            new Goods(4L, "Iphone 12 +", 3000, false),
            new Goods(4L, "Iphone 12 +", 3000, false)
    ));
    private final List<Banner> banners = new ArrayList<>(List.of(
            new Banner(1L, "Iphone 13", "img"),
            new Banner(2L, "Iphone 13 Pro", "img1"),
            new Banner(3L, "Samsung 13 X", "img3"),
            new Banner(4L, "Jetta New Class", "img4")
    ));

    @Override
    public List<Integer> synchronizer(HashSet<Integer> opencart, HashSet<Integer> stores) {
        if (stores != null & opencart != null) {
            for (Integer integer : stores) {
                if (!opencart.add(integer)) {
                    throw new RuntimeException("Value is duplicated!");
                } else {
                    opencart.add(integer);
                }
            }
        }
        return opencart != null ? new ArrayList<>(opencart) : null;
    }

    @Override
    public List<String> filtered(List<String> stringList, String findBy) {
        return stringList.stream()
                .filter(s -> s.startsWith(findBy))
                .collect(Collectors.toList());
    }

    @Override
    public MainPage mainPage() {
        MainPage mainPage = new MainPage();
        mainPage.setGoodsList(goodsData);

        mainPage.setSaleGoods(goodsData.stream()
                .filter(Goods::isSale)
                .collect(Collectors.toList()));

        mainPage.setBanners(banners);
        return mainPage;
    }


}
