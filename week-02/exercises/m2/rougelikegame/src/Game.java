import java.util.Random;
import java.util.Scanner;

public class Game {

    //constants
    private final static int WIDTH = 10;
    private final static String WALL_CHARACTER = "#";
    private final static String EMPTY_CHARACTER = " ";
    private String[][] gameboard;

    private final Scanner console = new Scanner(System.in);
    private Hero hero;
    private boolean isOver;
    private Treasure treasure;
    private int numTreasure = 2;
    private int hasTreasure = 0;

    public Game() {
    }


    public void run() {
        setUp();
        while (!isOver) {
            printWorld();;
            move();
        }
    }

    private void setUp() {
   /*     gameboard = new String[WIDTH][WIDTH];
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == 0 || j == 0 || i == (WIDTH - 1) || j == (WIDTH - 1)) {
                    gameboard[i][j] = WALL_CHARACTER;
                } else {
                    gameboard[i][j] = EMPTY_CHARACTER;
                }
            }

    */
            System.out.print("What is the name of your hero?: ");
            String name = console.nextLine();
            System.out.print("What would you like your symbol to be?: ");
            char symbol = console.nextLine().trim().charAt(0);

            Random rand = new Random();
            int x = rand.nextInt(WIDTH);
            int y = rand.nextInt(WIDTH);

            hero = new Hero(name, symbol, x, y);

            int t = rand.nextInt(WIDTH);
            int g = rand.nextInt(WIDTH);
            treasure = new Treasure('$',t,g);

            treasure= new Treasure('*', x, g);

        }


    private void printWorld () {
            //top wall border
            System.out.println(WALL_CHARACTER.repeat(WIDTH + 2));

            for (int row = 0; row < WIDTH; row++) {
                //left wall border
                System.out.print(WALL_CHARACTER);
                for (int col = 0; col < WIDTH; col++) {
                    if (row == hero.getY() && col == hero.getX()) {
                        System.out.print(hero.getSymbol());
                    } if (row == treasure.getG() && col == treasure.getT()) {
                        System.out.print(treasure.getSymbol());
                    }if (row == hero.getX() && col == treasure.getG()) {
                        System.out.println(treasure.getSymbol());

                    }
                    else {
                        System.out.print(EMPTY_CHARACTER);
                    }
                }

                //right wall border
                System.out.println(WALL_CHARACTER);
            }

            //bottom wall border
            System.out.println(WALL_CHARACTER.repeat(WIDTH + 2));
        }

        private void move () {
            System.out.print(hero.getName() + ", move [WASD]: ");
            String move = console.nextLine().trim().toUpperCase();

            if (move.length() != 1) {
                return;
            }

            switch (move.charAt(0)) {
                case 'W':
                    if (hero.getY() - 1 >= 0) {
                        hero.moveUp();
                    }
                    break;
                case 'A':
                    if (hero.getX() - 1 >= 0) {
                        hero.moveLeft();
                    }
                    break;
                case 'S':
                    if (hero.getY() + 1 < WIDTH) {
                        hero.moveDown();
                    }
                    break;
                case 'D':
                    if (hero.getX() + 1 < WIDTH) {
                        hero.moveRight();
                    }
                    break;
                case 'X':
                    isOver = true;
                    break;
            }
        }

    }
