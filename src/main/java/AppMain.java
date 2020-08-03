import dao.BrendDao;
import dao.impl.BrendDaoImpl;
import dao.view.FullProductsInfoViewDao;
import dao.view.impl.FullProductsInfoViewDaoImpl;
import entity.*;
import entity.view.FullProductsInfoView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.*;
import service.impl.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class AppMain {
    private static final Logger logger = LogManager.getLogger();



    public static void main(String[] args) {

        System.out.println("WORK WITH FullProductsInfoViewDao");
        FullProductsInfoViewDao productsInfoViewDao = new FullProductsInfoViewDaoImpl();
        List<FullProductsInfoView> fullProductsInfoViews = productsInfoViewDao.getFullProductsViewList();
//        if (!fullProductsInfoViews.isEmpty()){
//            for (FullProductsInfoView infoView: fullProductsInfoViews) {
//                System.out.println(infoView.toString());
//            }
//        }else{
//            System.out.println("Full Info Products List is empty");
//        }
//        fullProductsInfoViews = productsInfoViewDao.getFullProductViewInfoWhereNameLike("Adidas");
//        if (!fullProductsInfoViews.isEmpty()){
//            for (FullProductsInfoView infoView: fullProductsInfoViews) {
//                System.out.println(infoView.toString());
//            }
//        }else{
//            System.out.println("Full Info Products List is empty");
//        }


        System.out.println("-------------------");
        System.out.println("WORK WITH BREND");
//        BrendService brendService = new BrendServiceImpl();
//        brendService.getBrend(2).ifPresent(brendEntity -> System.out.println(brendEntity.getName()));
//        brendService.getBrend("Nike").ifPresent(brendEntity -> System.out.println(brendEntity.getId()));
//        System.out.println("/////////////////");
//        brendService.createBrend("Alexander McQueen", (short) 2);
//        brendService.createBrend("Test");
//        brendService.updateBrend(5,(short)15);
//        brendService.updateBrend(10,"Lacoste",(short)10);
//        brendService.getBrend("Alexander McQueen").ifPresent(brendEntity -> System.out.println(brendEntity.getId() + " "
//                + brendEntity.getDiscount()));
//        BrendEntity brendEntity = brendService.getBrend("Alexander McQueen").get();
//        brendService.deleteBrend(brendEntity);
//        BrendEntity brendEntity1 = brendService.getBrend("Test").get();
//        brendService.deleteBrend(brendEntity1.getId());
//        brendService.getBrend("Alexander McQueen").ifPresent(brendEntity2 -> System.out.println("Have"));
//        brendService.getBrend("Test").ifPresent(brendEntity2 -> System.out.println("Have"));
//        List<BrendEntity> brendEntities = brendService.getBrendWhereNameLike("D");
//        for (BrendEntity brendEntity: brendEntities
//             ) {
//            System.out.println(brendEntity.getName());
//        }

        System.out.println("-------------------");
        System.out.println("WORK WITH CATEGORY");
//        CategoryService categoryService = new CategoryServiceImpl();
//        List<CategoryEntity> categoryEntities = categoryService.getCategoriesList();
//        for (CategoryEntity category: categoryEntities) {
//            System.out.println(category.getId() + " " + category.getName());
//        }
//        categoryService.createCategory("men's watches");
//        System.out.println(categoryService.getCategory("men's watches").get());
//        categoryService.createCategory("women's watches",(short)3);
//        System.out.println(categoryService.getCategory("women's watches").get());
//        categoryService.createCategory("test");
//        System.out.println(categoryService.getCategory("test").get());
//        categoryService.deleteCategory(categoryService.getCategory("test").get());
//        Optional<CategoryEntity> categoryEntity = categoryService.getCategory("women's watches");
//        categoryEntity.ifPresent(categoryEntity1 -> categoryService.updateCategory(categoryEntity1.getId(), (short)0));
//        categoryEntity = categoryService.getCategory("women's watches");
//        categoryEntity.ifPresent(categoryEntity1 -> System.out.println(categoryEntity1.getDiscount()));

        System.out.println("-------------------");
        System.out.println("WORK WITH COLLECTION");
//        CollectionService collectionService = new CollectionServiceImpl();
//        List<CollectionEntity> collectionEntities = collectionService.getCollectionWhereNameLike("Spring");
//        for (CollectionEntity collectionEntity : collectionEntities){
//            System.out.println(collectionEntity.getId() + " " + collectionEntity.getName());
//        }
//        collectionService.createCollection("test");
//        collectionService.updateCollection(collectionService.getCollection("test").get().getId(),"updated_test",(short)40);
//        collectionService.deleteCollection(collectionService.getCollection("updated_test").get().getId());
//        System.out.println("finish");

        System.out.println("-------------------");
        System.out.println("WORK WITH TYPE");
//        TypeService typeService = new TypeServiceImpl();
//        List<TypeEntity> typeEntities = typeService.getTypesList();
//        for (TypeEntity typeEntity: typeEntities) {
//            System.out.println(typeEntity.getId() + " " + typeEntity.getName());
//        }
//        typeService.createType("test");
//        Optional<TypeEntity> type = typeService.getType("test");
//        type.ifPresent(typeEntity -> System.out.println(typeEntity.getId() + " " + typeEntity.getName() + " " + typeEntity.getDiscount()));
//        typeService.updateType(type.get().getId(),"updated_test",(short) 50);
//        type = typeService.getType("updated_test");
//        type.ifPresent(typeEntity -> System.out.println(typeEntity.getId() + " " + typeEntity.getName() + " " + typeEntity.getDiscount()));
//        typeService.deleteType(type.get().getId());

        System.out.println("-------------------");
        System.out.println("WORK WITH PRODUCT");
//
//        ProductService productService = new ProductServiceImpl();
//         productService.createProduct("Reebok forrunner",9,4,2,7,new BigDecimal("49.99"), (short) 0);
//
//        List<ProductEntity> productEntities = productService.getProductList();
//        productEntities.forEach(productEntity1 -> System.out.println(productEntity1.getProductName()));
//        System.out.println("-------------------");
//        System.out.println("WORK WITH SIZE_PRODUCT");
//        Optional<ProductEntity> productEntity = productService.getProductByName("Reebok forrunner");
//        SizeProductService sizeProductService = new SizeProductServiceImpl();
//        if (productEntity.isPresent()){
//            if (productEntity.get().getTypeEntity().getId() >=1 && productEntity.get().getTypeEntity().getId() <= 24){
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),1);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),2);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),3);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),5);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),6);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),7);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),8);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),9);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),10);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),11);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),12,5);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),13,9);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),14);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),15);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),16,14);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),17);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),18);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),19);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),20,17);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),21);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),22);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),23);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),24);
//            }else{
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),101,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),102,50);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),103,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),104,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),105,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),106,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),107,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),108,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),109,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),110,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),111,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),112,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),113,4);
//                sizeProductService.createSizeProductQuantity(productEntity.get().getArticle(),114,4);
//            }
//
//        }
//
//        fullProductsInfoViews = productsInfoViewDao.getFullProductsViewList();
//        fullProductsInfoViews.forEach(fullProductsInfoView -> System.out.println(fullProductsInfoView.toString()));

    }


}
