package dao.view;

import entity.ProductEntity;
import entity.view.FullProductsInfoView;

import java.util.List;
import java.util.Optional;

public interface FullProductsInfoViewDao {

    List<FullProductsInfoView> getFullProductsViewList();

    List<FullProductsInfoView> getFullProductViewInfoByProductName(String productName);

    List<FullProductsInfoView> getFullProductViewInfoByProductArticle(int productArticle);

    List<FullProductsInfoView> getFullProductViewInfoWhereNameLike(String productName);

    Optional<ProductEntity> getProductByNameAndSizeUk(String productName, double sizeUk);

    Optional<ProductEntity> getProductByNameAndSizeEur(String productName, double sizeEur);

    Optional<ProductEntity> getProductByArticleAndSizeEur(int article, double sizeEur);

    Optional<ProductEntity> getProductByArticleAndSizeUk(int article, double sizeUk);
}
