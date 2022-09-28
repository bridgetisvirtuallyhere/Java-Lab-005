# Java-Lab-005 - Conditions Game

## Part 1 - Creating the Dice Class
1. Create a class named **Dice** that has 3 private instance variables:
    * HINT: You'll need an import for class **Random**

           private int sideFacingUp;
           private int sides;
           private Random randomGenerator;
      * if (x > 0) {
         System.out.println("x is positive");
      } else if(x == 0) {
        System.out.println("x is 0");
      } else {
          if( x > -10 ) {
             System.out.println("x is negative, but barely");
         }
         System.out.println("x is negative");
      }
2. Create a Dice **constructor** that takes an integer parameter **sides**, assigns it to the instance variable **sides**, and initializes an instance of the **Random** class.
3. Add two methods to the Dice class
    * Method 1 should be named **roll** and should use **randomGenerator** to generate a random number between 1 and **sides**, and assign that number to the instance variable **sideFacingUp**
    * Method 2 should be named **view** and should simply return the value stored in the instance variable **sideFacingUp**

## Part 2 - Creating the Player Class
1. Create a class name **Player** that has 2 private instance variables:

        private String name;
        private int score;
2. Create a Player **constructor** that takes a **String** parameter **name** and assigns the **name** parameter to the instance variable **name**.
3. Add three methods to the Player class
    * Method 1 should be named **getName** and should return the **name** instance variable.
    * Method 2 should be named **getScore** and should return the **score** instance variable.
    * Method 3 should be named **toss** and should roll the die and record its view in the **score** instance variable.

## Part 3 - Playing the Game
1. Create a Game **constructor** that takes a **Player p1** parameter, a **Player p2** parameter, and a **Dice die** parameter, and then assigns the parameters to the **Game** instance variables.
2. Implement 3 methods
    * Method **play** needs to declare a local **Player** variable named **current** that gets assigned **this.p1** and calls methods **takeTurn**, **nextPlayer**, and **takeTurn** again before printing method **announceWinner**
    * Method **nextPlayer** needs to use conditions to check the **current** Player parameter, and switch to the other Player (i.e. Either instance variable **this.p1** or **this.p2**).
    * Method **announceWinner** needs to display each Player's name and score, then using conditions needs to determine which Player's score is highest, and finally return the winning Player's name.
3. Last, Implement the Java **main** method to:
    * Create a Scanner object.
    * Request and store in an int variable the number of sides you **Dice** should have.
    * Create a **new** **Game** object and pass its **constructor** two **new** Player objects, and a **new** Dice object.
    * Finally, use the **Game** object to call the **play** method and play the game.

## Part 4 - Turn in
1. Make sure to create a local **Fall_2022** branch as we've done all semester.
2. Commit and push that branch to your GitHub Account's Fork of Java-Lab-005
3. Create a Pull request back to my Java-Lab-005 Repo.
4. Paste your Pull request URL into Canvas to complete the assignment.