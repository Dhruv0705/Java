// Dhruv Patel
// 9/28/2022
// CAC210 Snake Project #1
// Dr.Wagner 


// Remove package to run program
package BSC.CAC310.SnakeGame;

import bridges.base.NamedColor;
import bridges.base.NamedSymbol;
import bridges.games.NonBlockingGame;

// Used http://bridgesuncc.github.io/doc/java-api/current/html/classbridges_1_1games_1_1_non_blocking_game.html#a4ff32a8ba8aeb3f438751729f7380d16
// To receive data from NonBlockGame Class and documentation throughout program
class Snake extends NonBlockingGame {

  // Game settings
  java.util.Random random = new java.util.Random();
  
  // Set dimensions of the game board
  static int gridColumns = 30;
  static int gridRows = 30;

  // Refresh rate
  final long FRAMERATE = 1000000000 / 15;
  long frameTime;
  long nextFrameTime;

  // Initial snake settings
  int startX = gridColumns / 3;
  int startY = gridRows / 2;
  int startLength = 3;
  
  // Similar to a chessboard, the background will alternate in color
  NamedColor bc1 = NamedColor.forestgreen;	//board color
  NamedColor bc2 = NamedColor.green;		//board color
  
  // Setting up other game colors
  NamedColor sc = NamedColor.silver;		//snake color
  NamedColor hc = NamedColor.white;			//head color
  NamedColor ac = NamedColor.red;			//apple color

  // Create an element to represent the snake's head (call it head) 
  // and tail (call it tail) - is there a class that could help us where 
  // the location of the head and tail could be encapsulated?
  // Node element to represent head and tail
  Block head;
  Block tail;

  // Create an element to represent the apple
  // Node element to represent apple
  Block apple;

  // Keep track of the snake's current and last direction 
  // 
  Direction direction;
  Direction lastDirection;

  // Constructor - set bridges credentials, grid size
  public Snake(int assid, String login, String apiKey, int c, int r) {
    super(assid, login, apiKey, c, r);
  }

  // Handle user input 
  public void handleInput() {

  // Based on which of the 4 arrow keys is pressed
	// move the snake in the requested particular direction
	// Note: if the snake is moving North, it cannot move South
	// meaning that it cannot turn on itself
	  

    // NonBlockingGame Key function for setting the current direction to the enum Direction or its corresponding 
    // Direction if the last direction was not equal to the opposite direction

    // Condition to stop user input for snake to return the same direction of the user input.
    // if input up the snake can not do turn around must turn up,left,right ect. then set to current direction of the user snake movement.
    if (keyUp() && direction != Direction.SOUTH && lastDirection != Direction.SOUTH) {
      direction = Direction.NORTH;
    }
    else if (keyDown() && direction != Direction.NORTH && lastDirection != Direction.NORTH) {
      direction = Direction.SOUTH;
    } 
    else if (keyLeft() && direction != Direction.EAST && lastDirection != Direction.EAST) {
      direction = Direction.WEST;
    }
    else if (keyRight() && direction != Direction.WEST && lastDirection != Direction.WEST) {
      direction = Direction.EAST;
    }
  }

  // Method to update snake position
  public void updatePosition() {

    // Move the snake one position, based on its direction and update
    // the linked list
    
	  Block current = head.next; //assumes you created a Block called head at the top of your class
    int nextX = head.x;
    int nextY = head.y;


    // Loops through the whole snake to move all of the blocks one space
    while (current != null) {
      int tempX = current.x;
      int tempY = current.y;
      current.x = nextX;
      current.y = nextY;
      nextX = tempX;
      nextY = tempY;
      current = current.next;
    }


    // The Snake will switch directions once the snake leaves the board to less then 0 the snake will come back up from the bottom up. 
    // y is getting incremented by -1 each time as the snake moves in which once the snake goes less then 0 will come back up from the bottom. 
    switch (direction) {
			case NORTH:
				head.y--;
				if (head.y < 0)
					head.y = gridRows - 1;
				break;

			case SOUTH:
				head.y++;
				if (head.y == gridRows)
					head.y = 0;
				break;

			case EAST:
				head.x++;
				if (head.x == gridColumns)
					head.x = 0;
				break;

			case WEST:
				head.x--;
				if (head.x < 0)
					head.x = gridColumns - 1;
				break;
		}
  }

  // Method to plant the apple to not plant inside snake
  public void plantApple() {

    // Randomly position the apple, taking care to ensure that it doesn't
    // intersect with the snake position.

  // Sets x and y variable to integer value.
    int x;
    int y;

    // While loop to get random number between 0-29 for x and y for collision based
      while (true) {
        x = Math.abs(random.nextInt() % 29);
        y = Math.abs(random.nextInt() % 29);
      
        // Assumes there is no collisions 
        boolean noCollision = true;

        // While loop if current is not null then x and y is current condiments when current value is now = to current.next
        Block current = head;

        // While current is not null will compare x and y if they are the same then there is a collection
        // Apple can not be planted on the x and y coordinates of the snake nodes. 
        while (current != null) {
          if (current.x == x && current.y == y) {
            noCollision = false;

            // break loop once if statement is not true
            break;
          }
          
          // Move to the next current value 
          current = current.next;
        }

        // If there is no collision there the infinite loop will break
        if (noCollision)
          break;
      }

      // Plants the apple block on the board using the x and y coordinates
      apple.x = x;
      apple.y = y;
  }

  // Method to Check if snake has ate the apple
  public void detectApple() {

  // If apple is found, snake consumes it and update the board and plant
  // a new apple on the board.
	  
  // If the head x and y eats the apple then:
    if (head.x == apple.x &&
        head.y == apple.y) {

        // Creates a new block element to add one node or block once the snake eats the apple. 
        Block newTail = new Block(tail.x, tail.y);
        drawSymbol(apple.x, apple.y, NamedSymbol.none, ac);
        tail.next = newTail;
        tail = newTail;

        // Plants new apple once updated
        plantApple();
        }
  }

  // Check if snake ate itself! Yuk!
  public void detectDeath() {

  // Creates a new 
    Block current = head.next;

    //While current is not null:
      while (current != null) {

        // If head x and y is equal to the current x and y then exit the game (if snake ate itself)
        if (head.x == current.x && head.y == current.y)
          System.exit(0);

        //   
        current = current.next;
      }
  }

  // Method to draw the board, apple, and snake
  public void paint() {

  
    // For loops to create the column and rows grid layout within the board
    for (int i = 0; i < gridColumns; ++i) {
			for (int j = 0; j < gridRows; ++j) {

        // if else statement to set board color to forest green or green if if statement is false.
				if (i % 2 == j % 2)
					setBGColor(i, j, bc1);
				else
					setBGColor(i, j, bc2);
			}
		}

		drawSymbol(apple.x, apple.y, NamedSymbol.apple, ac);

    setBGColor(head.y, head.x, hc);
		Block current = head.next;
		while (current != null) {
			setBGColor(current.x, current.y, sc);
			current = current.next;
		}
  }

  // Method to set up the first state of the game grid
  public void initialize() {

    head = new Block (startX, startY);
    // Create the snake of some number of elements,
    // perform all initializations, then place the apple
	
    for (int i = 0; i < gridColumns; ++i) {
			for (int j = 0; j < gridRows; ++j) {
				if (i % 2 == j % 2)
					setBGColor(i, j, bc1);
				else
					setBGColor(i, j, bc2);
			}
		}

    

	// Set head to a new block passing it the start x/y
  
    head = new Block(startX, startY);
    Block current = head;
	
	  //loops through the snake based on the start length and colors
	  //the board accordingly
	  
	  for (int i = 0; i < startLength; ++i) {
			setBGColor(startX - i, startY, sc);
			if (i > 0) {
				current.next = new Block(startX - i, startY);
				current = current.next;
			}
		}
		tail = current;
	
	  frameTime = System.nanoTime();
	  nextFrameTime = frameTime + FRAMERATE + 10000;
	  direction = Direction.EAST;
	  lastDirection = direction;
	  apple = new Block();
	  
	//
  // Calls plantApple function that prints new apple
    plantApple();
  }

  // Game loop will run many times per second until snake eats itself
  // handle input, check if apple was detected, update position, redraw,
  // detect if snake ate itself
  public void gameLoop() {

	  // Handle the input
	  handleInput();

	  if (System.nanoTime() > nextFrameTime) {
	    frameTime = System.nanoTime();
	    nextFrameTime = frameTime + FRAMERATE;

	    // Set the last direction equal to direction
      lastDirection = direction;

	    // Detect an apple
      detectApple();

	    // Update the position
      updatePosition();

	    // Paint to screen
      paint();

	    // Detect death method
      detectDeath();
	  }
  }

  public static void main(String args[]) {
    Snake game = new Snake(22, "Dhruv", "545128645312", gridColumns, gridRows);
    game.setTitle("Snake");

    game.start();
  }
}

enum Direction {
  NORTH,
  SOUTH,
  EAST,
  WEST
}

// Helper class to hold snake and apple objects; snake grows as it
// Eats and hence a linked list of blocks
class Block {
  public Block next;
  public int x;
  public int y;

  public Block() {
    this(-1, -1, null);
  }

  public Block(int x, int y) {
    this(x, y, null);
  }

  public Block(int x, int y, Block next) {
    this.x = x;
    this.y = y;
    this.next = next;
  }
}