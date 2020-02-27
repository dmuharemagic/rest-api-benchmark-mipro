package hr.dmuharemagic.micronaut.repository;

import hr.dmuharemagic.micronaut.entity.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
