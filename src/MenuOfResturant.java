import java.util.Scanner;

    public class  MenuOfResturant {

        public static final String[] OptionsFoods = {"Desserts","Beverages"};


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your last name: ");
            String lastname = scanner.nextLine();

            System.out.println("Select the type of food you want:");
            for (int i = 0; i < OptionsFoods.length; i++) {
                System.out.println((i + 1) + ". " + OptionsFoods[i]);
            }

            int optionFood;
            while (true) {
                System.out.print("Enter the number of the desired option (1-" + OptionsFoods.length + "): ");
                try {
                    optionFood = Integer.parseInt(scanner.nextLine());
                    if (optionFood >= 1 && optionFood <= OptionsFoods.length) {
                        break;
                    } else {
                        System.out.println("Invalid option. Please choose a number between 1 and " + OptionsFoods.length + ".");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid entry. Please enter a number.");
                }
            }

            String selectedFood = OptionsFoods[optionFood - 1];

            System.out.println("\nRegistered information");
            System.out.println("Name: " + name);
            System.out.println("Last Name: " + lastname);
            System.out.println("Selected Food: " + selectedFood);

            System.out.println("\nEnter the product you want to order (coffee, tea, juice, cappuccino, donut, pudding):");
            String product = scanner.nextLine().toLowerCase();

            double price = getPriceProduct(product);
            if (price < 0) {
                System.out.println("Sorry, the entered product is not available.");
                scanner.close();
                return;
            }

            System.out.println("The cost of your order of " + product + " is: $" + price);

            System.out.println("Is there anything else you would like to request (yes/no)?");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("yes")) {
                System.out.println("Enter the following product you wish to order (coffee, tea, juice, cappuccino, donut, pudding):");
                String product2 = scanner.nextLine().toLowerCase();

                double price2 = getPriceProduct(product2);
                if (price2 < 0) {
                    System.out.println("Sorry, the entered product is not available.");
                } else {
                    System.out.println("The of your product of " + product2 + " is: $" + price2);
                }
            }

            scanner.close();
        }

        public static double getPriceProduct(String product) {
            double price = 0;
            switch (product) {
                case "coffee":
                    price = 2.5;
                    break;
                case "tea":
                    price = 2.0;
                    break;
                case "juice":
                    price = 3.0;
                    break;
                case "cappuccino":
                    price = 3.5;
                    break;
                case "donut":
                    price = 1.5;
                    break;
                case "pudding":
                    price = 1.6;
                    break;
                default:
                    return 0;
            }
            return price;
        }
    }

