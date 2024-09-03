import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Siparis {
    public OrderedItems prepareChicken() throws IOException {
        OrderedItems order = new OrderedItems();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter the choice of Chicken ");
        System.out.println("============================");
        System.out.println("        1. Boiled Chicken       ");
        System.out.println("        2. Fried Chicken   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");

        int chickenandcolddrinkchoice = Integer.parseInt(br.readLine());
        switch (chickenandcolddrinkchoice) {
            case 1: {
                System.out.println("You ordered Boiled Chicken");
                System.out.println("\n\n");
                System.out.println(" Enter the types of Chicken ");
                System.out.println("------------------------------");
                System.out.println("        1.Mash Chicken        ");
                System.out.println("        2.Onion Chicken        ");
                System.out.println("        3.Exit            ");
                System.out.println("------------------------------");

                int boiledchickenchoice = Integer.parseInt(br.readLine());
                switch (boiledchickenchoice) {
                    case 1: {
                        System.out.println("You ordered Boiled Chicken");
                        System.out.println("Enter the Boiled Chicken size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Mash Chicken ");
                        System.out.println("    2. Medium Mash Chicken ");
                        System.out.println("    3. Big Mash Chicken");
                        System.out.println("------------------------------------");

                        int mashchickensize = Integer.parseInt(br.readLine());
                        switch (mashchickensize) {
                            case 1:
                                order.addItems(new Small_Mash_Chicken());
                                break;
                            case 2:
                                order.addItems(new Medium_Mash_Chicken());
                                break;
                            case 3:
                                order.addItems(new Big_Mash_Chicken());
                                break;
                        }
                    }
                    break;

                    case 2: {
                        System.out.println("You ordered Onion Chicken");
                        System.out.println("Enter the Onion Chicken size");
                        System.out.println("----------------------------------");
                        System.out.println("    1. Small Onion Chicken ");
                        System.out.println("    2. Medium Onion Chicken ");
                        System.out.println("    3. Big Onion Chicken ");
                        System.out.println("----------------------------------");

                        int onionchickensize = Integer.parseInt(br.readLine());
                        switch (onionchickensize) {
                            case 1:
                                order.addItems(new Small_Onion_Chicken());
                                break;
                            case 2:
                                order.addItems(new Medium_Onion_Chicken());
                                break;
                            case 3:
                                order.addItems(new Big_Onion_Chicken());
                                break;
                        }
                    }
                    break;
                }
            }
            break;

            case 2: {
                System.out.println("You ordered Fried Chicken");
                System.out.println("\n\n");
                System.out.println(" Enter the types of Chicken ");
                System.out.println("------------------------------");
                System.out.println("        1.Mash Chicken        ");
                System.out.println("        2.Onion Chicken        ");
                System.out.println("        3.Exit            ");
                System.out.println("------------------------------");

                int friedchickenchoice = Integer.parseInt(br.readLine());
                switch (friedchickenchoice) {
                    case 1: {
                        System.out.println("You ordered Fried Chicken");
                        System.out.println("Enter the Fried Chicken size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Mash Chicken ");
                        System.out.println("    2. Medium Mash Chicken ");
                        System.out.println("    3. Big Mash Chicken");
                        System.out.println("------------------------------------");

                        int mashchickensize = Integer.parseInt(br.readLine());
                        switch (mashchickensize) {
                            case 1:
                                order.addItems(new Small_Mash_Chicken());
                                break;
                            case 2:
                                order.addItems(new Medium_Mash_Chicken());
                                break;
                            case 3:
                                order.addItems(new Big_Mash_Chicken());
                                break;
                        }
                    }
                    break;

                    case 2: {
                        System.out.println("You ordered Onion Chicken");
                        System.out.println("Enter the Onion Chicken size");
                        System.out.println("----------------------------------");
                        System.out.println("    1. Small Onion Chicken ");
                        System.out.println("    2. Medium Onion Chicken ");
                        System.out.println("    3. Big Onion Chicken ");
                        System.out.println("----------------------------------");

                        int onionchickensize = Integer.parseInt(br.readLine());
                        switch (onionchickensize) {
                            case 1:
                                order.addItems(new Small_Onion_Chicken());
                                break;
                            case 2:
                                order.addItems(new Medium_Onion_Chicken());
                                break;
                            case 3:
                                order.addItems(new Big_Onion_Chicken());
                                break;
                        }
                    }
                    break;
                }
            }
            break;

            default:
                break;
        }

        System.out.println(" Enter the choice of ColdDrink ");
        System.out.println("============================");
        System.out.println("        1. Ayran            ");
        System.out.println("        2. Coke             ");
        System.out.println("        3. Exit             ");
        System.out.println("============================");

        int coldDrink = Integer.parseInt(br.readLine());
        switch (coldDrink) {
            case 1: {
                System.out.println("You ordered Ayran ");
                System.out.println("Enter the Ayran Size ");
                System.out.println("------------------------");
                System.out.println("    1. Small Ayran ");
                System.out.println("    2. Medium Ayran ");
                System.out.println("    3. Large Ayran ");
                System.out.println("------------------------");

                int ayranSize = Integer.parseInt(br.readLine());
                switch (ayranSize) {
                    case 1:
                        order.addItems(new Small_Ayran());
                        break;
                    case 2:
                        order.addItems(new Medium_Ayran());
                        break;
                    case 3:
                        order.addItems(new Big_Ayran());
                        break;
                }
            }
            break;

            case 2: {
                System.out.println("You ordered Coke");
                System.out.println("Enter the Coke Size");
                System.out.println("------------------------");
                System.out.println("    1. Small Coke ");
                System.out.println("    2. Medium Coke  ");
                System.out.println("    3. Large Coke  ");
                System.out.println("    4. Extra-Large Coke ");
                System.out.println("------------------------");

                int cokesize = Integer.parseInt(br.readLine());
                switch (cokesize) {
                    case 1:
                        order.addItems(new Small_Coke());
                        break;
                    case 2:
                        order.addItems(new Medium_Coke());
                        break;
                    case 3:
                        order.addItems(new Big_Coke());
                        break;
                }
            }
            break;

            default:
                break;
        }
        return order;
    }

    public void startOrdering() throws IOException {
        boolean exit = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (!exit) {
            OrderedItems order = prepareChicken();
            if (order == null) {
                System.out.println("Invalid choice. Returning to main menu...");
                continue;
            }

            order.showItems();
            System.out.println("Total Cost: " + order.getCost());

            System.out.println("\nDo you want to place another order? (yes/no)");
            String response = br.readLine();
            if (response.equalsIgnoreCase("no")) {
                exit = true;
            }
        }

        System.out.println("Thank you for using the Order System!");
    }
}
