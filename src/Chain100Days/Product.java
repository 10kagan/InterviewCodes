package Chain100Days;

import java.util.Objects;

public class Product {

    private String productId;
    private String name;
    private String category;

    public Product(String productId, String name, String category){
        this.productId = productId;
        this.name = name;
        this.category = category;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return Objects.equals(productId, product.productId) &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(productId, name);
    }

    @Override
    public String toString(){
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

// Implement equals() and hashCode() in a custom object