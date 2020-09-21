package testentity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "full_products_info", schema = "shop", catalog = "")
public class FullProductsInfo {
    private int article;
    private String productName;
    private String brend;
    private short brendDiscount;
    private String type;
    private short typeDiscount;
    private String category;
    private short categoryDiscount;
    private String collection;
    private short collectionDiscount;
    private double sizeUk;
    private double sizeEur;
    private int quantity;
    private BigDecimal price;
    private short productDiscount;

    @Basic
    @Column(name = "article")
    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "brend")
    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    @Basic
    @Column(name = "brend_discount")
    public short getBrendDiscount() {
        return brendDiscount;
    }

    public void setBrendDiscount(short brendDiscount) {
        this.brendDiscount = brendDiscount;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "type_discount")
    public short getTypeDiscount() {
        return typeDiscount;
    }

    public void setTypeDiscount(short typeDiscount) {
        this.typeDiscount = typeDiscount;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "category_discount")
    public short getCategoryDiscount() {
        return categoryDiscount;
    }

    public void setCategoryDiscount(short categoryDiscount) {
        this.categoryDiscount = categoryDiscount;
    }

    @Basic
    @Column(name = "collection")
    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    @Basic
    @Column(name = "collection_discount")
    public short getCollectionDiscount() {
        return collectionDiscount;
    }

    public void setCollectionDiscount(short collectionDiscount) {
        this.collectionDiscount = collectionDiscount;
    }

    @Basic
    @Column(name = "size_uk")
    public double getSizeUk() {
        return sizeUk;
    }

    public void setSizeUk(double sizeUk) {
        this.sizeUk = sizeUk;
    }

    @Basic
    @Column(name = "size_eur")
    public double getSizeEur() {
        return sizeEur;
    }

    public void setSizeEur(double sizeEur) {
        this.sizeEur = sizeEur;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "product_discount")
    public short getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(short productDiscount) {
        this.productDiscount = productDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullProductsInfo that = (FullProductsInfo) o;
        return article == that.article &&
                brendDiscount == that.brendDiscount &&
                typeDiscount == that.typeDiscount &&
                categoryDiscount == that.categoryDiscount &&
                collectionDiscount == that.collectionDiscount &&
                Double.compare(that.sizeUk, sizeUk) == 0 &&
                Double.compare(that.sizeEur, sizeEur) == 0 &&
                quantity == that.quantity &&
                productDiscount == that.productDiscount &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(brend, that.brend) &&
                Objects.equals(type, that.type) &&
                Objects.equals(category, that.category) &&
                Objects.equals(collection, that.collection) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(article, productName, brend, brendDiscount, type, typeDiscount, category, categoryDiscount, collection, collectionDiscount, sizeUk, sizeEur, quantity, price, productDiscount);
    }
}
