public class TicTacToe {

    public static void main(String[] args) {
        String[][] map = initField (size: 3);
        boolean isGameActive = true;
        System.out.print("Игра началась! Вперед");

        printMap (map);
        while (isGameActive) {

            playerTurn(map);
            printMap (map);
            if (isWinner(mark "X", map) || isDraaw (map)) {
                isGameActive = false;
                break;
            }

            computerTurn(map);
            if (isWinner(mark "0", map) || isDraaw (map)) {
                isGameActive = false;
                break;
            }

            prinMap(map);

        }
    }

    public static boolean isWinner (String mark, String [][] map) {
        if (
                (map[0][0].equals(mark) && map[0][1].equals(mark) && map[0][2].equals(mark))
                        || (map[0][1].equals(mark) && map[1][1].equals(mark) && map[2][1].equals(mark))
                        || (map[0][2].equals(mark) && map[1][2].equals(mark) && map[2][2].equals(mark))
        ) {
            System.out.println(mark + " победил");
            return true;
        }

        else if (
                map[0][0].equals(mark) && map[0][1].equals(mark) && map[0][2].equals(mark))
                || (map[0][1].equals(mark) && map[1][1].equals(mark) && map[2][1].equals(mark))
                || (map[0][2].equals(mark) && map[1][2].equals(mark) && map[2][2].equals(mark))
        ) {
            System.out.println(mark + " победил");
            return true;
        }

    else if (
                map[0][0].equals(mark) && map[0][1].equals(mark) && map[0][2].equals(mark))
                || (map[0][1].equals(mark) && map[1][1].equals(mark) && map[2][1].equals(mark))
                || (map[0][2].equals(mark) && map[1][2].equals(mark) && map[2][2].equals(mark))
        ) {
            System.out.println(mark + " победил");
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isDraaw(String [][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; i++) {

                if (map [i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Ничья");
        rreturn true;

        public static void computerTurn (String [][] map) {
            System.out.println("Ход компьютера, подождите")

            Random random = new Random ();
            boboolean isActiveTrue = true;

            while (isActiveTrue) {

                int x = random.nextInt(map[0].length);
                int y = random.nextInt(map.length);

                if (map[X][y].equals("*")) {
                    map[X][y] = "0";
                    isActiveTrue = false;
                }
            }
            System.out.println("Компьютер сходил");
        }

        public static void playerTurn(String [][] map) {
            System.out.println("Ваш ход, на какие клетки?");
            Scanner sc = new Scanner(System.in);
            boolean isActiveTrue = true;

            while (isActiveTrue) {

                int x = sc.nextInt();
                int y = sc.nextInt();

                if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                    if (map[x - 1 ][y - 1].equals("*")) {
                        map[x - 1 ][y - 1] = "X";
                        isActiveTrue = false;
                    } else {
                        System.out.println("Вы сходили на занятую ячейку");
                    }
                } else {
                    System.out.println("Вы вышли за пределы поля");
                }
            }

        }

        public static void printlnMap (String [][] map) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[0].length; i++) {
                    System.out.print(map [i][j] + " ");
                }
                System.out.print();
            }
        }

        public static String [][] initField(int size){
            String[][] map = new String[size][size];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[0].length; i++) {
                    map [i][j] = "*";
                }
            }
            return map;
        }
    }