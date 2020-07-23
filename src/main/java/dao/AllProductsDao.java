package dao;

import entity.AllProductsEntity;

import java.util.List;

public interface AllProductsDao {

    List<AllProductsEntity> getAllProductsList();

    AllProductsEntity getProductByArticle(int article);

    AllProductsEntity getProductByFullName(String productName);

    List<AllProductsEntity> getListProductsWhereNameLike (String nameLike);

    List<AllProductsEntity> getAllProductsListSortedByName();

    List<AllProductsEntity> getAllProductsListSortedByBrend();

    List<AllProductsEntity> getAllProductsListSortedByType();

    List<AllProductsEntity> getAllProductsListSortedByCategory();

    List<AllProductsEntity> getAllProductsListSortedByPriceFromCheapToExpensive();

    List<AllProductsEntity> getAllProductsListSortedByPriceFromExpensiveToCheap();
}
