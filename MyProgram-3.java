/*
import java.util.concurrent.TimeUnit;

public class MyProgram
{
    public static void main(String[] args)
    {
        //initialize board
        System.out.println("WELCOME TO CONWAY'S GAME OF LIFE");
        System.out.println("================================");
        System.out.println("");

        int r = 10;
        int c = 10;
        
        int[][] board = 
        { 
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
       //convert board to stars and dots
        
        System.out.println("Starter Iteration");

        for(int row = 0; row < r; row++)
        {
            for(int col = 0; col < c; col++)
            {
                if(board[row][col] == 0)
                {
                    System.out.print(".");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        while (true)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            int[][] placeTaker = new int[10][10];
            //traverse thru array
            for(int q = 1; q < 9; q++)
            {
                for(int w = 1; w < 9; w++)
                {
                    //check who's alive
                    int alivePoints = 0;
                    for(int e = -1; e <= 1; e++)
                    {
                        for(int o = -1; o <1; o++)
                        {
                            alivePoints += board[q + e][w + o];
                        }
                    }
                    alivePoints -= board[q][w];
                    //lonely death
                    if((board[q][w] == 1) && (alivePoints < 2))
                    {
                        placeTaker[q][w] = 0;
                    }
                    else if((board[q][w] == 1) && (alivePoints > 3))
                    {
                        placeTaker[q][w] = 0;
                    }
                    else if((board[q][w] == 0) && (alivePoints == 3))
                    {
                        placeTaker[q][w] = 1;
                    }
                    
                }
            }
            System.out.println("Next Iteration");
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    if (placeTaker[i][j] == 0)
                    {
                        System.out.print(".");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for(int i = 0 ; i < 10 ; i++)
            {
                for(int j = 0 ; j < 10 ; j++)
                {
                    board[i][j] = placeTaker[i][j];
                }
            }            
        }
    }
}
*/


import java.util.concurrent.TimeUnit;
public class MyProgram
{
    public static void main(String[] args)
    {
        int grid[][] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        while(true)
        {
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            for (int i = 0; i < 27; i++)
            {
                System.out.println();
            }
            nextGeneration(grid);
            printBoard(grid);
        }
    }
    
    public static void printBoard(int[][] grid)
    {
        for (int x = 0; x < grid.length; x++)
        {
            for (int y = 0; y < grid[x].length; y++)
            {
                System.out.print(grid[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    public static void nextGeneration(int[][] grid)
    {
        int[][] otherGrid = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        
        // The reason we have this otherGrid var is because we need to keep a copy of the current generation and the next generation.
        for (int x = 0; x < grid.length; x++)
        {
            for (int y = 0; y < grid[x].length; y++)
            {
                if (cellDies(grid, x, y))
                {
                    otherGrid[x][y] = 0;
                }
                else
                {
                    otherGrid[x][y] = 1;
                }
            }
        }
        // initialize grid to equal otherGrid.
        for (int x = 0; x < grid.length; x++)
        {
            for (int y = 0; y < grid[x].length; y++)
            {
                grid[x][y] = otherGrid[x][y];    
            }
        }    
        
    }
    
    
    // function is going to return true if the cell dies. If return is false this means the cell will be alive.
    public static boolean cellDies(int[][] grid, int x, int y)
    {
        // REQUIRMENTS
        int count = surroundingCount(grid, x, y);
        
        // 1. Any live cell with 0 or 1 live neighbors becomes dead, because of underpopulation
        if (grid[x][y] == 1 && count <= 1)
        {
            return true;
        }
        
        // 2. Any LIVE cell with 2 or 3 live neighbors stays alive, because its neighborhood is just right
        else if (grid[x][y] == 1 && count == 2 || count == 3 )
        {
            return false;
        }
        
        // 4. Any dead cell with exactly 3 live neighbors becomes alive, by reproduction
        else if (grid[x][y] == 0 && count == 3)
        {
            return false;
        }
        
        // Overpopulation.
        else
        {
            return true;
        }
        
    }
    // what you have to check
    //          ***     x++ y++; x-- y--; x++ y--; x-- y++; x++; x--; y++; y--; 8 spaces to check, so this is right.
    //          ***
    //          ***
    public static int surroundingCount(int[][] grid, int x, int y)
    {
        // just a bunch of if statements to check surroundings 
        int counter = 0;
        int xLength = grid.length;
        
        // I think to make the alive cells cross over at the edge all we need is else if statements 3 for the 4 big ones 1 else if statement for the 4 small ones.
        // 1 right down 1
        if (x + 1 < xLength && y + 1 < grid[x + 1].length)
        {
            if (grid[x + 1][y + 1] == 1) 
            {
                counter++; 
            }
        }
        // So if x + 1 < xLength that means that x has room to go right, but y does not so it means we are at the bottom of the graph. so this if is going to be for Y.
        else if (x + 1 < xLength)
        {
            if (grid[x + 1][0] == 1) 
            {
                counter++; 
            }
        }
        else if (y + 1 < 10)
        {
            if (grid[0][y + 1] == 1) 
            {
                counter++; 
            }
        }
        else if (x + 1 >= xLength && y + 1 >= 10)
        {
            if (grid[0][0] == 1) 
            {
                counter++;
            }
        }
        // these else if statements are somewhat counter intuitive if you get confused just think about it for a sec, youll remember how it works.
        // 1 up 1 left
        if (x - 1 >= 0 && y - 1 >= 0)
        {
            if (grid[x - 1][y - 1] == 1) 
            {
                counter++;
            }
        }
        else if (x - 1 >= 0)
        {
            if (grid[x - 1][9] == 1) 
            {
                counter++; 
            }
        }
        else if (y - 1 >= 0)
        {
            if (grid[9][y- 1] == 1) 
            {
                counter++; 
            }
        }
        else if (x - 1 < 0 && y - 1 < 0)
        {
            if (grid[9][9] == 1)
            {
                counter++;
            }
        } 
        // 1 up 1 right
        if (x + 1 < xLength && y - 1 >= 0)
        {
            if (grid[x + 1][y - 1] == 1) 
            {
                counter++;
            }
        }
        else if (x + 1 < xLength)
        {
            if (grid[x + 1][9] == 1) 
            {
                counter++; 
            }
        }
        else if (y - 1 >= 0)
        {
            if (grid[0][y - 1] == 1) 
            {
                counter++; 
            }
        }
        else if (x + 1 >= xLength && y - 1 < 0)
        {
            if (grid[0][9] == 1)
            {
                counter++;
            }    
        }
        // 1left down 1
        if (x - 1 >= 0 && y + 1 < grid[x - 1].length)
        {
            if (grid[x - 1][y + 1] == 1) 
            {
                counter++; 
            }
        }
        else if (x - 1 >= 0)
        {
            if (grid[x - 1][0] == 1) 
            {
                counter++; 
            }
        }
        else if (x - 1 < 0 && y + 1 >= grid[9].length)
        {
            if (grid[9][0] == 1)
            {
                counter++;
            }    
        } 
        else if (y + 1 < grid[9].length)
        {
            if (grid[9][y + 1] == 1) 
            {
                counter++; 
            }
        }
        
        
        // 1 right
        if (x + 1 < xLength)
        {
            if (grid[x + 1][y]     == 1) 
            {
                counter++; 
            } 
        }
        else
        {
            if (grid[0][y]        == 1) 
            {
                counter++; 
            } 
        }
        
        // 1 left
        if (x - 1 >= 0)
        {
            if (grid[x - 1][y]     == 1) 
            {
                counter++; 
            }
        }
        else
        {
            if (grid[9][y]     == 1) 
            {
                counter++; 
            }
        }
        
        if (y + 1 < grid[x].length)
        {
            if (grid[x][y + 1]     == 1) 
            {
                counter++; 
            }
        }
        else
        {
            if (grid[x][0]     == 1) 
            {
                counter++; 
            }
        }
            
        if (y - 1 >= 0)
        {
            if (grid[x][y - 1]     == 1) 
            {
                counter++; 
            }  
        }
        else
        {
            if (grid[x][9]     == 1) 
            {
                counter++; 
            } 
        }
        return counter;
    }
    
}