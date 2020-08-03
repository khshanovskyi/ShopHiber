package service.impl;

import dao.SizeProductDao;
import dao.impl.SizeProductDaoImpl;
import entity.SizeProductQuantityEntity;
import service.SizeProductService;

import java.util.Optional;

public class SizeProductServiceImpl implements SizeProductService {

    private final SizeProductDao sizeProductDao;

    public SizeProductServiceImpl() {
         sizeProductDao = new SizeProductDaoImpl();
    }

    @Override
    public Optional<SizeProductQuantityEntity> getSizeProductQuantityEntity(int prodArticle, int sizeId) {
        return sizeProductDao.getSizeProductQuantityEntity(prodArticle,sizeId);
    }

    @Override
    public void createSizeProductQuantity(int prodArticle, int sizeId) {
        sizeProductDao.createSizeProductQuantity(createSizeProductEntity(prodArticle,sizeId));
    }

    @Override
    public void createSizeProductQuantity(int prodArticle, int sizeId, int quantity) {
        sizeProductDao.createSizeProductQuantity(createSizeProductEntity(prodArticle,sizeId,quantity));
    }

    @Override
    public void subtractQuantityOfSizeProduct(int prodArticle, int sizeId, int quantity) {
        Optional<SizeProductQuantityEntity> sizeProdOpt = sizeProductDao.getSizeProductQuantityEntity(prodArticle,sizeId);
        sizeProdOpt.ifPresent(sizeProductQuantityEntity -> sizeProductDao.createSizeProductQuantity(
                createSizeProductEntity(prodArticle, sizeId, (sizeProductQuantityEntity.getQuantity() + quantity))));

    }

    @Override
    public void addQuantityOfSizeProduct(int prodArticle, int sizeId, int quantity) {
        Optional<SizeProductQuantityEntity> sizeProdOpt = sizeProductDao.getSizeProductQuantityEntity(prodArticle,sizeId);
        if (sizeProdOpt.isPresent()){
            if (sizeProdOpt.get().getQuantity() - quantity >= 0){
                sizeProductDao.createSizeProductQuantity(
                        createSizeProductEntity(prodArticle, sizeId, (sizeProdOpt.get().getQuantity() - quantity)));
            }
        }
    }

    private SizeProductQuantityEntity createSizeProductEntity(int prodArticle, int sizeId){
        return SizeProductQuantityEntity.builder().productId(prodArticle).sizeId(sizeId).build();
    }

    private SizeProductQuantityEntity createSizeProductEntity(int prodArticle, int sizeId, int quantity){
        return SizeProductQuantityEntity.builder().productId(prodArticle).sizeId(sizeId).quantity(quantity).build();
    }
}
