package com.gildedrose;

public class Item {

    public String name; // 상품이름

    public int sellIn; // 판매기한

    public int quality; // 품질

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
