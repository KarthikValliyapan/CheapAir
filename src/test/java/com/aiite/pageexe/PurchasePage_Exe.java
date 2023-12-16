package com.aiite.pageexe;

public class PurchasePage_Exe extends FlightReviewPage_Exe
	{
		public static void getFirstName()
			{
				sendData(firstName(), "karthik");
			}

		public static void getLastName()
			{
				sendData(lastName(), "Valliyappan");
			}

		public static void selectSuffix()
			{
				selectDataByVisibleText(suffix(), "Sr");
			}

		public static void selectGender()
			{
				selectDataByVisibleText(gender(), "Male");
			}

		public static void selectMonthInDob()
			{
				selectDataByVisibleText(dobMonth(), "September");
			}

		public static void enterDayInDob()
			{
				sendData(dobDay(), "20");
			}

		public static void enterYearInDob()
			{
				sendData(dobYear(), "1988");
			}

		public static void enterCreditCardNumber()
			{
				sendData(creditCardNumber(), "1234567890123456");
			}

		public static void selectExpiryMonth()
			{
				selectDataByVisibleText(expMonth(), "09 - September");
			}

		public static void selectExpiryYear()
			{
				selectDataByVisibleText(expYear(), "2030");
			}

		public static void enterCvv()
			{
				sendData(ccv(), "123");
			}

		public static void enterPaymentName()
			{
				sendData(paymentName(), "Karthik Valliyappan");
			}

		public static void enterPaymentCountry()
			{
				selectDataByVisibleText(paymentCountry(), "India");
			}

		public static void enterPaymentAddress()
			{
				sendData(paymentAddressOne(), "xxxxx");
				sendData(paymentAddressTwo(), "yyyyy");
			}

		public static void enterPaymentCity()
			{
				sendData(paymanetCity(), "Chennai");
			}

		public static void enterPaymentPhone()
			{
				sendData(paymentPhone(), "9080808080");
			}

		public static void enterEmail()
			{
				sendData(email(), "xxx@gmail.com");
			}

		public static void purchase_Button()
			{
				drawBorder(purchaseButton());
			}
	}
