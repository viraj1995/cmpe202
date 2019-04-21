

###Strategy Design Pattern:

The original code that I used implemented Strategy pattern for calculating the income based on different types of taxes.
The classes implement calculateTax method of the TaxStrategy interface and calculates
the income.


###Lambda Implementation:

Using lambda function, I changed the strategy pattern's behavior by writing it in a single context class. This eliminates the
 need to create three different strategy classes for calculating different taxes.

###Comparison:

Lambda function treats a function as a method argument and also does not belong to any class and hence reduces the number of classes and makes the code much more manageable.