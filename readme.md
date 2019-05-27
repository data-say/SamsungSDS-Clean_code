# GildedRose Static Import 설정
Windows -> Preferences 메뉴

Java -> Editor -> Content Assist -> Favorites 항목

“New Type…” 버튼 : “ 클릭하여 아래내용 추가


org.hamcrest.CoreMatchers

org.junit.Assert

# GildedRose JUnit 설정
프로젝트 우클릭 - [Properties] - [Java Build Path] - [Libraries] - [Add Library] - [JUnit]

JUnit4 선택

# GildedRose 업무설명

Gilded Rose 는  Allison 이 운영하는 작은 여관입니다.  
이 여관은 유명한 도시의 요지에 자리잡고 있습니다.  
우리는 이 여관에서 finest goods를 사고 팝니다.  
그런데 상품의 판매가능 기간(sell by date)이 다가올수록 상품들의 품질은 지속적으로 떨어집니다.  

현재 시스템은 이렇습니다.  
1. 모든 아이템에는 판매가능기간 (sellIn)이 있습니다. 
판매가능 기간은 아이템을 팔아야 하는 날까지 남아 있는 일 수로 표시합니다.  

2. 모든 아이템에는 품질값(quality)이 있습니다. 품질값은 아이템이 얼마나 가치있는지를 나타냅니다.  

3. 우리 시스템은 매일 자정에 모든 아이템의 값들을 갱신합니다.  

아주 간단하죠? 문제를 재미있게 만들어줄 요소들을 소개하겠습니다.  
1. 판매가능 기간이 지나면, 품질은 두배씩 빨리 떨어집니다.  

2. 아이템의 품질은 음수가 될 수 없습니다.  

3. 아이템의 품질은 50보다 클 수 없습니다.    

4. "Aged Brie"는 시간이 지날수록 품질이 증가합니다.  

5. "Sulfuras"는 전설의 아이템입니다.절대 팔지도 않고 품질이 떨어지지도 않습니다.  

6. "Backstage passes" 는 판매가능기간이 다가올수록 품질이 증가합니다.   
판매가능기간이 10일 이하일 때 품질은 2씩 증가하고, 판매가능기간이 5일 이하일때는 3씩 증가합니다.   
콘서트가 끝나고 판매가능 기간이 지나면 품질은 0이 됩니다.  

Gilded Rose는 마음대로 바꿔도 되고 새로운 클래스를 만들어도 됩니다. 단, 모든것이 올바르게 동작해야 합니다.  
하지만 Item 클래스나 Items 속성을 바꾸지 마세요, Item 클래스는 다른팀에서 개발하고 관리하는 클래스입니
 
