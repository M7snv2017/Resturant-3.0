"Resturant_3.0.jar"

Created in ‎‎Thursday, ‎May ‎23, ‎2024, ‏‎12:16:13 AM

we have 9 classes:-

A. Casher class
- you can logout by clicking on logout button
- taking the order by clicking on the items
- edit the quantity from below then click enter or click on selected item or click on update
- delete an item by select it then click on delete
- confirm the order by clicking on print then Make order button


B. Chef class
- here you have three buttons: Logout, Order status, Inventory
- log out to go back to login form
- in Order status form you can as a chef change order status 
- in inventory you can show inventory and edit it


C. Inventory class 
- here you can add ,delete, update, search, go back
- if you want to add you have to enter the Ingredient, date, quantity then click on add
- in update you have to select on the item then its data is showing up then you can change it then click on update
- if you want to delete you have to select the item then click on delete
- if you want to search write any thing then it will show up
- if you want to go back click on back button


D. Item class 
- is a class has three attributes and one constractor
- attribute we have are Item(String), Price(int),q(int)
- constructor has tow parameters Item, Price 
- Item attribute is the name of this item
- Price attribute is the price of this item
- q attribute is the quantity of this attribute (i think i didn't use it but i won't delete it because i won't)


E. Logain class 
- we have here three radio buttons and tow textfilds and one button
- radio buttons are to choose login as Cashier , Chef or Manger
- textfilds to write username and password
- last thing is login button to check your username and password



F. Manger class
- here you have three buttons: Logout, Order Report, Inventory
- log out to go back to login form
- in Order Report form you can as a Manger view your report sales 
- in inventory you can show inventory and edit it


G. Order Report
- is a class that shows total sales and with vat and average
- shows the orders in details
- if you want to go back click on back button


H. printPage class
- after clicking on print button in casher class this class is showing up 
- it shows sub total and vat total with vat
- then you can either click on x on above to cancel or click on make order button to confirm the order



I. orderStatus class 
- is a class that shows all detail orders for the chef and he can check them to know that this order is cooked or not 
- if you want to go back click on back button
