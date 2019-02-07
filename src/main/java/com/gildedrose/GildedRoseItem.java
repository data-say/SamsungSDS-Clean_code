package com.gildedrose;

public abstract class GildedRoseItem {

	protected Item item;

	public GildedRoseItem(Item item) {
		this.item= item;
	}
	
	abstract public void updateQuality();

	public void updateSellIn(GildedRose gildedRose, Item item) {
		if (item.name.equals(GildedRose.SULFURAS)) {
		} else {
			item.sellIn = item.sellIn - 1;
		}
	}
}