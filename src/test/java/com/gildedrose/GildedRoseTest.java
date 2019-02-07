package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
	
	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	public static final String NORMAL_ITEM = "Normal Item";
	public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	public static final String AGED_BRIE = "Aged Brie";
	
	@Test
	public void Step1_GildedRose_생성자_테스트() {
		
		// arrange
		Item[] items= new Item[]{};
		
		// act
		GildedRose gildedRose= new GildedRose(items);
		
		// assert
		assertNotNull(gildedRose);
	}
	
	@Test
	public void Step2_Normal아이템_판매기간0_품질0_테스트() {
		
		// arrange
		Item[] items= new Item[]{new Item(NORMAL_ITEM, 0, 0)};
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(NORMAL_ITEM, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}
	
	@Test
	public void Step3_Normal아이템_판매기간0_품질5_테스트() {
		
		// arrange
		Item[] items= new Item[]{new Item(NORMAL_ITEM, 0, 5)};
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(NORMAL_ITEM, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(3, items[0].quality);		
	}
	
	@Test
	public void Step4_Sulfuras아이템_판매기간0_품질5_테스트() {
		
		// arrange
		Item[] items= new Item[]{new Item(SULFURAS, 0, 5)};
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(SULFURAS, items[0].name);
		assertEquals(0, items[0].sellIn);
		assertEquals(5, items[0].quality);		
	}
	
	// Step5. 상수 리팩토링
	
	@Test
	public void Step6_AgedBrie아이템_판매기간0_품질0_테스트() {
		
		// arrange
		Item[] items= new Item[]{new Item(AGED_BRIE, 0, 0)};		
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(AGED_BRIE, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(2, items[0].quality);		
	}
	
	@Test
	public void Step7_BackstagePass아이템_판매기간0_품질0_테스트() {
		
		// arrange
		Item[] items= new Item[]{new Item(BACKSTAGE_PASS, 0, 0)};		
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(BACKSTAGE_PASS, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);		
	}
	
	@Test
	public void Step8_BackstagePass아이템_판매기간0_품질51_테스트() {
		
	}
	
	@Test
	public void Step9_BackstagePass아이템_판매기간15_품질0_테스트() {
		
	}
	
	@Test
	public void Step10_Sulfuras아이템_판매기간1_품질5_테스트() {
		
	}
	
	@Test
	public void Step11_AgedBrie아이템_판매기간0_품질55_테스트() {
		
	}
	
	@Test
	public void Step12_GildedRose_Item_toString_테스트() {
		
	}
}
