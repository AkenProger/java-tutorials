import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Goods;
import models.MainPage;
import service.GoodService;
import service.impl.GoodServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        GoodService goodService = new GoodServiceImpl();
//        HashSet<Integer> openCart = new HashSet<>();
//        HashSet<Integer> stores = new HashSet<>();
//        openCart.add(22);
//        openCart.add(44);
//        openCart.add(55);
//
//        stores.add(525);
//        stores.add(22);
//        stores.add(44);
//        stores.add(55);
//        try {
//            List<Integer> list = goodService.synchronizer(openCart, stores);
//            for (Integer integer : list) {
//                System.out.println(integer);
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Ended!");
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Kita");
//        stringList.add("Kiasa");
//        stringList.add("Kitaafa");
//        stringList.add("Kitaafa");
//        stringList.add("Adaafa");
//        stringList.add("Baaafa");
//        List<String> list = goodService.filtered(stringList, "Ki");
//        list.forEach(System.out::println);

//        MainPage mainPage = goodService.mainPage();
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//        String jsonData = gson.toJson(mainPage);
//        System.out.println(jsonData);

        GameController gameController = new GameController();
        while (true) {
            gameController.openGame();
            System.out.println("Do you want exit?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (Objects.equals(answer, "yes")) {
                break;
            }
        }
    }
}
