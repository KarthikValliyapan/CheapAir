package com.aiite.pageexe;

import org.openqa.selenium.By;

public class Sample extends HomePage_Exe
	{
		public static void main(String[] args) throws InterruptedException
			{
				launchBrowser();
				launch_url();
				String b = driver.findElement(By.xpath("//input[@id = 'tripTypeTR']")).getAttribute("checked");
				System.out.println(b);
				driver.close();
				
//				enter_FromLocation();
//				enter_ToLocation();
//				select_DepartDate();
//				select_ReturnDate();
//				clickTravellers();
//				select_SeatingClass();
//				click_Search();
//
//				Thread.sleep(2000);
//				Set<String> set = driver.getWindowHandles();
//				System.out.println("size: " + set.size());
//				for (String data : set)
//					{
//						driver.switchTo().window(data);
//					}
//				Thread.sleep(2000);
//				closePopUp();
//				boolean b = validate_changeSearchIcon();
//				Assert.assertTrue(b);
//				Thread.sleep(2000);
//
//				List<WebElement> priceList = driver
//						.findElements(By.xpath("//span[@class='sc-kmtlux gEcEWQ']//span[contains(text(), '$')]"));
//				System.out.println(priceList.size());
//
//				WebElement cheapestElement = null;
//				int lowestPrice = Integer.MAX_VALUE;
//
//				for (WebElement data : priceList)
//					{
//						String priceText = data.getText().replaceAll("[^\\d]", ""); // Remove non-numeric characters
//						int price = Integer.parseInt(priceText); // Convert the cleaned string to an integer
//
//						if (price < lowestPrice)
//							{
//								lowestPrice = price; // Update lowest price
//								cheapestElement = data; // Update WebElement corresponding to the lowest price
//							}
//					}
//				System.out.println(lowestPrice);
//				cheapestElement.click();
//				cheapestElement.click();
			}
	}
