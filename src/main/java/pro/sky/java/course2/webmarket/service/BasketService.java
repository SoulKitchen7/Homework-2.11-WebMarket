package pro.sky.java.course2.webmarket.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public interface BasketService {
   List<Integer> addProduct(List<Integer> id);

   List<Integer> getProduct();
}
