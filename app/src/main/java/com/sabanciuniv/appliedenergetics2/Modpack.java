package com.sabanciuniv.appliedenergetics2;

import java.util.List;

public class Modpack {
    private String id;
    private String itemTypeName;
    private List<Item> items;

    public static class Item {
        private String _id;
        private String title;
        private String description;
        private String imageURL;
        private String recipeURL;

        public String getId() {
            return _id;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getImageURL() {
            return imageURL;
        }

        public String getRecipeURL() {
            return recipeURL;
        }
    }

    public String getId() {
        return id;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public List<Item> getItems() {
        return items;
    }
}
