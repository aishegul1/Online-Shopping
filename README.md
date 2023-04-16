# Online-Shopping

JAVA PRACTICE

  * Step 1: Create "ItemList" and "ItemPrices" list.
  * Step 2: Add 3 more products to the productList you created.
  * Step 3: You selected the product from the "ItemList" and how many you want.
  * Create a customerChoose() that you ask.
  * Step 4 : Show the user the productList
  * Ask for the product code and how many you want
  * Ask if you want to buy another product.
  * if the user does not want to pay the total amount
  * If it coincides with the founding day, "You Have No Debt",
  * show total Amount if it did not coincide with the founding day,
  * If he wants to buy another product, select the product again. *
  * Repeat this process until you want to end the shopping.
  * Step 5 : Each time the customer selects a product, add the price of the product he bought to the "totalPayment".
  * Step 6: Show the total amount to be paid when the shopping is over.

This is a Java program that simulates an online shopping website. It has a main method that initializes two lists; listOfProduct and productprices, which store the product names and their corresponding prices, respectively. It then adds new products and their prices to the lists.

The program prompts the user to enter the product code and the number of items they want to buy using the Scanner class. It then calculates the total cost of the items and adds it to the amountofpayment variable. The user is then asked if they want to continue shopping or proceed to payment.

The program has three helper methods:

showListOfProducts() - This method displays the list of products and their prices.
continueOrNo() - This method prompts the user to continue shopping or proceed to payment.
pay() - This method displays a welcome message if it is the establishment day of the online shopping website or displays a thank you message and the total amount due if the user decides to proceed to payment.
The program also has a slowPrint() method that prints out text character by character, with a delay specified in milliseconds, to simulate the effect of a typewriter.
