package service;

import entity.ProductEntity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductEntity> getProductList();

    Optional<ProductEntity> getProductById(int prodId);
    Optional<ProductEntity> getProductByName(String name);

    void createProduct(int article, String prodName, int brendId, int typeId, int categoryId, int collectionId, BigDecimal price, short discount );
    void createProduct(String prodName, int brendId, int typeId, int categoryId, int collectionId, BigDecimal price, short discount );


}
