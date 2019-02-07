package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void Step1_GildedRose_������_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{};
		
		// act
		GildedRose gildedRose= new GildedRose(items);
		
		// assert
		assertNotNull(gildedRose);
	}
	
	@Test
	public void Step2_Normal������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item("Normal Item", 0, 0)};
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals("Normal Item", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}
	
	@Test
	public void Step3_Normal������_�ǸűⰣ0_ǰ��5_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item("Normal Item", 0, 5)};
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals("Normal Item", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(3, items[0].quality);		
	}
	
	@Test
	public void Step4_Sulfuras������_�ǸűⰣ0_ǰ��5_�׽�Ʈ() {
		
	}
	
	// Step5. ��� �����丵
	
	@Test
	public void Step6_AgedBrie������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {
		
	}
	
	@Test
	public void Step7_BackstagePass������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {
		
	}
	
	@Test
	public void Step8_BackstagePass������_�ǸűⰣ0_ǰ��51_�׽�Ʈ() {
		
	}
	
	@Test
	public void Step9_BackstagePass������_�ǸűⰣ15_ǰ��0_�׽�Ʈ() {
		
	}
	
	@Test
	public void Step10_Sulfuras������_�ǸűⰣ1_ǰ��5_�׽�Ʈ() {
		
	}
	
	@Test
	public void Step11_AgedBrie������_�ǸűⰣ0_ǰ��55_�׽�Ʈ() {
		
	}
	
	@Test
	public void Step12_GildedRose_Item_toString_�׽�Ʈ() {
		
	}
}
