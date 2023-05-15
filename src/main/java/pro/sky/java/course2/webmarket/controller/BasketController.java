package pro.sky.java.course2.webmarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.webmarket.service.BasketService;

import java.util.List;

@RestController
@RequestMapping("/order/")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List <Integer> addProduct(@RequestParam List<Integer> id) {
            return basketService.addProduct(id);
    }

    @GetMapping("/get")
    public List <Integer> getProduct() {

        return basketService.getProduct();
    }
}
