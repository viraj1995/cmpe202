Explanation for the CRC cards:

Customer - It's observer. Represents the customer.
Restaurant - It is also an observer. Represents the restaurant.
Table - Represents the tables in the restaurant. Acts as a subject of the observer pattern.
TableAvailable - Represents that the table's state is: Available.
TableOccupied - Represents that the table's state is: Occupied.

The following design patterns have been used:
	
State pattern : Maintains the state of the tables whether Available or Occupied. The states trigger waitlist management.

Observer pattern : Customer and Restaurant are observers. Customer takes an action upon receiving a notification. On changing state of table from Occupied to Available, next customer is determined by the Restaurant from the waitlist. Restaurant acts whether to assign that table to the Customer or remove the Customer from the waitlist and look for the next, based on the Customer's message - Confirm or Cancel.
	
