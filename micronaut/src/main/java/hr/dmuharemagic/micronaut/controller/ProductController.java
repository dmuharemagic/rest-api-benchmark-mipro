package hr.dmuharemagic.micronaut.controller;

import hr.dmuharemagic.micronaut.entity.Product;
import hr.dmuharemagic.micronaut.repository.ProductRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.Optional;

@Controller("/api")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @Get("/products")
    public Iterable<Product> getProducts() {
        return repository.findAll();
    }

    @Get("products/{id}")
    public Optional<Product> getProductByID(long id) {
        return repository.findById(id);
    }

    @Post("/products")
    public void createProduct(Product product) {
        repository.save(product);
    }

}
