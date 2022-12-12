package models;

import java.util.List;

public class MainPage {
    private List<Goods> goodsList;
    private List<Goods> saleGoods;
    private List<Banner> banners;

    public MainPage(List<Goods> goodsList, List<Goods> saleGoods, List<Banner> banners) {
        this.goodsList = goodsList;
        this.saleGoods = saleGoods;
        this.banners = banners;
    }

    public MainPage() {

    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public List<Goods> getSaleGoods() {
        return saleGoods;
    }

    public void setSaleGoods(List<Goods> saleGoods) {
        this.saleGoods = saleGoods;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }


}
