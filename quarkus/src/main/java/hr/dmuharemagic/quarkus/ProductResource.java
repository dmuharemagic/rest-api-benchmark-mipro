package hr.dmuharemagic.quarkus;

import hr.dmuharemagic.quarkus.entity.Product;
import hr.dmuharemagic.quarkus.repository.ProductRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {

    @Inject
    ProductRepository repository;

    @GET
    @Path("/products")
    public List<Product> getProducts() {
        return this.repository.getProducts();
    }

    @GET
    @Path("/products/{id}")
    public Product getProductByID(@PathParam("id") long id) {
        return this.repository.getProductByID(id);
    }

    @POST
    @Path("/products")
    public void createProduct(Product product) {
        this.repository.createProduct(product);
    }
}