package service;

import entity.SizeProductQuantityEntity;

import java.util.Optional;

public interface SizeProductService {

    Optional<SizeProductQuantityEntity> getSizeProductQuantityEntity(int prodArticle, int sizeId);

    void createSizeProductQuantity(int prodArticle, int sizeId);
    void createSizeProductQuantity(int prodArticle, int sizeId, int quantity);

    void subtractQuantityOfSizeProduct(int prodArticle, int sizeId, int quantity);
    void addQuantityOfSizeProduct(int prodArticle, int sizeId, int quantity);
}
