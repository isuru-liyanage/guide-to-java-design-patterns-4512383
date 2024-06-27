package com.example;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem.StoreItemBuilder("Bread", 200.0)
                .longDescription("A loaf of bread that is perfect for sandwiches")
                .shortDescription("A loaf of bread")
                .packagingType("Plastic")
                .stockAvailable(100)
                .build();

        var item2 = new StoreItem.StoreItemBuilder("Milk", 50.0)
                .longDescription("A carton of milk that is perfect for breakfast")
                .shortDescription("A carton of milk")
                .packagingType("Glass")
                .stockAvailable(50)
                .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);
    }

    private static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }


}
