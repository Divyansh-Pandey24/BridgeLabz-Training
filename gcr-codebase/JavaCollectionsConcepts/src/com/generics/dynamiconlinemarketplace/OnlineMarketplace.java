package com.generics.dynamiconlinemarketplace;

public class OnlineMarketplace {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 25000, new GadgetCategory());

        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("---- Product Catalog ----");
        catalog.displayProducts();
    }
}
