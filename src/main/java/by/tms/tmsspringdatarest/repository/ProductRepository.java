package by.tms.tmsspringdatarest.repository;

import by.tms.tmsspringdatarest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);
}
