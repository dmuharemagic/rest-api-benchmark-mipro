package hr.dmuharemagic.quarkus.repository;

import hr.dmuharemagic.quarkus.entity.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ProductRepository {

    /*
     * Quarkus is designed with Substrate VM in mind. For this reason,
     * package-private scope is utilized instead of private.
     */
    @Inject
    EntityManager entityManager;

    public List<Product> getProducts() {
        return this.entityManager.createQuery("FROM Product", Product.class).getResultList();
    }

    public Product getProductByID(long id) {
        return this.entityManager.createQuery("FROM Product WHERE id = :id", Product.class).setParameter("id", id)
                .getSingleResult();
    }

    public void createProduct(Product product) {
        this.entityManager.persist(product);
    }

}
