    package _5_WhileLoops.Exersises;

    import java.util.Scanner;

    public class _5_Coins {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double change = Double.parseDouble(scanner.nextLine());

            change = Math.floor(change * 100);
            int coinsCount = 0;

            while (change > 0){
                while (change >= 200){ change -= 200; coinsCount++;
                }while (change >= 100){ change -= 100; coinsCount++;
                }while (change >= 50){ change -= 50; coinsCount++;
                }while (change >= 20){ change -= 20; coinsCount++;
                }while (change >= 10){ change -= 10; coinsCount++;
                }while (change >= 5){ change -= 5; coinsCount++;
                }while (change >= 2) { change -= 2; coinsCount++;
                }while (change >= 1) { change -= 1; coinsCount++;
                }

              }

            System.out.println(coinsCount);

        }
    }