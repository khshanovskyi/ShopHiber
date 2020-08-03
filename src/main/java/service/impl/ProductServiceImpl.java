package service.impl;

import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import entity.ProductEntity;
import service.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    private final BrendService brendService = new BrendServiceImpl();
    private final TypeService typeService = new TypeServiceImpl();
    private final CategoryService categoryService = new CategoryServiceImpl();
    private final CollectionService collectionService = new CollectionServiceImpl();

    private final ProductDao productDao;

    public ProductServiceImpl() { productDao = new ProductDaoImpl(); }

    @Override
    public List<ProductEntity> getProductList() {
        return productDao.getProductList();
    }

    @Override
    public Optional<ProductEntity> getProductById(int prodId) {
        return productDao.getProductById(prodId);
    }

    @Override
    public Optional<ProductEntity> getProductByName(String name) {
        return productDao.getProductByName(name);
    }

    @Override
    public void createProduct(int article, String prodName, int brendId, int typeId, int categoryId, int collectionId,
                              BigDecimal price, short discount) {
        ProductEntity productEntity = createProductEntity(article,prodName,brendId,typeId,categoryId,collectionId,price,discount);
        productDao.createProduct(productEntity);
    }

    @Override
    public void createProduct(String prodName, int brendId, int typeId, int categoryId, int collectionId,
                              BigDecimal price, short discount) {
        productDao.createProduct(createProductEntity(prodName,brendId,typeId,categoryId,collectionId,price,discount));
    }

    public ProductEntity createProductEntity(int article,String prodName, int brendId, int typeId, int categoryId,
                                              int collectionId, BigDecimal price, short discount){
        return ProductEntity.builder()
                .productName(prodName)
                .article(article)
                .brendEntity(brendService.getBrend(brendId).get())
                .typeEntity(typeService.getType(typeId).get())
                .categoryEntity(categoryService.getCategory(categoryId).get())
                .collectionEntity(collectionService.getCollection(collectionId).get())
                .price(price)
                .discount(discount)
                .build();
    }

    private ProductEntity createProductEntity(String prodName, int brendId, int typeId, int categoryId,
                                              int collectionId, BigDecimal price, short discount){
        return ProductEntity.builder()
                .productName(prodName)
                .brendEntity(brendService.getBrend(brendId).get())
                .typeEntity(typeService.getType(typeId).get())
                .categoryEntity(categoryService.getCategory(categoryId).get())
                .collectionEntity(collectionService.getCollection(collectionId).get())
                .price(price)
                .discount(discount)
                .build();
    }
}
