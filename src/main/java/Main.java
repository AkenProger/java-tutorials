import models.Goods;
import service.GoodService;
import service.impl.GoodServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Goods goods = new Goods(1L,"ONION", "sds","sdc");
        GoodService goodService = new GoodServiceImpl();
        goodService.createOrEdit(goods);
        goodService.showGoodsList();
    }
}
