package hr.dmuharemagic.spring.controller;

import hr.dmuharemagic.spring.ProductNotFoundException;
import hr.dmuharemagic.spring.entity.Product;
import hr.dmuharemagic.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProductByID(@PathVariable(value = "id") long productID) {
        return repository.findById(productID).orElseThrow(() -> new ProductNotFoundException("ID", productID));
    }

    @PostMapping("/products")
    public Product createProduct(@Valid @RequestBody Product product) {
        return repository.save(product);
    }

}
