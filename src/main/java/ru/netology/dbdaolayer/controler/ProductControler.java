package ru.netology.dbdaolayer.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.dbdaolayer.repository.ProductRepository;

import java.sql.SQLException;

@RestController
@RequestMapping("/")
public class ProductControler {

    private final ProductRepository productRepository;

    public ProductControler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/fetch-product")
    public ResponseEntity<?> getProductList(@RequestParam("name") String clientName) throws SQLException {
        return new ResponseEntity<>(productRepository.getProductList(clientName), HttpStatus.OK);
    }
}
