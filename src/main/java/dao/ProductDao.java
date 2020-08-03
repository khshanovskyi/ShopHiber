package dao;

import entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductDao {

    List<ProductEntity> getProductList();

    Optional<ProductEntity> getProductById(int prodId);
    Optional<ProductEntity> getProductByName(String name);

    void createProduct(ProductEntity productEntity);
}
