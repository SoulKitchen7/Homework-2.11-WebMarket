package pro.sky.java.course2.webmarket.service;

import java.util.ArrayList;
import java.util.List;

public class BasketServiceImpl implements BasketService{
    private final List<Integer> id = new ArrayList<>();

    @Override
    public List<Integer> addProduct(List<Integer> id) {
        this.id.addAll(id);
        return this.id;
    }

    @Override
    public List<Integer> getProduct() {
        return id;
    }
}
