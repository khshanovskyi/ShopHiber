package dao;

import entity.SizeProductQuantityEntity;

import java.util.Optional;

public interface SizeProductDao {

    Optional<SizeProductQuantityEntity> getSizeProductQuantityEntity(int prodArticle, int sizeId);

    void createSizeProductQuantity(SizeProductQuantityEntity sizeProduct);

    void updateSizeProductQuantity(SizeProductQuantityEntity sizeProduct);
}
