import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        Normal Headline of BurgerChamp Restaurant.
        System.out.println("Welcome to the BurgerChamps !!! ");
        System.out.println("Our Burger, Your Way !");

        int totalPrice=0;
        System.out.println("Here is our menu : ");

        String vegBurger="";
        String vegDrink="";
        String vegSize="";
        String vegSideItem="";

        int orderCount = -1;
        boolean keepGoingMenu = true;
        while(keepGoingMenu==true){

            if(orderCount>-1){
                System.out.print("Do you want to add more meals to the order ? (Yes/No) ");
                String moreMeal=scn.nextLine();

                if(moreMeal.toLowerCase().equals("yes")){

                }
                else if (moreMeal.toLowerCase().equals("no")){
                    System.out.println("No more meals are added here is your final bill : ");
                    keepGoingMenu=false;
                    break;
                }
            }
            System.out.println("Select your Meal type : \n" +
                    "1. Quick Meal \n" +
                    "2. Customized Veg Meal \n" +
                    "3. Customized Non Veg Meal");

            System.out.print("Enter your Meal type number or type No to cancel the order : ");
            String mealNum = scn.nextLine();

            if(mealNum.equals("1")){
                boolean keepGoingQuickMeal=true;
                while(keepGoingQuickMeal==true) {
                    System.out.println("We have 2 options in quick meal : \n" +
                            "1. Regular Meal Rs. 240 \n" +
                            "2. Delux Meal Rs. 350 / Delux Meal with extra fillings Rs. 360");

                    System.out.print("Enter your quick meal number or type no to cancel the order : ");
                    String quickMealNum = scn.nextLine();

                    if (quickMealNum.equals("1")) {
                        orderCount++;
                        Meal regmeal = new Meal();
                        Meal regularMealOrder = new Meal("1");
                        System.out.println(regularMealOrder);
                        regmeal.regularMeal();
                        totalPrice += regmeal.cost;

                        System.out.print("Do you want to add more Quick Meals ?(Yes/No)  ");
                        String quickMealDecision = scn.nextLine();

                        if(quickMealDecision.toLowerCase().equals("yes")){
                            continue;
                        }
                        else if(quickMealDecision.toLowerCase().equals("no")){
                            keepGoingQuickMeal=false;
                            break;
                        }
                    } else if (quickMealNum.equals("2")) {
                        System.out.print("Do you want some extra fillings in your delux burger ? (Yes/No) ");
                        String extraFillings = scn.nextLine();
                        Meal delmeal = new Meal();
                        if(extraFillings.toLowerCase().equals("no")){
                            orderCount++;
                            delmeal.DeluxMeal();
                            Meal deluxMealOrder = new Meal("2");
                            System.out.println(deluxMealOrder);
                            totalPrice += delmeal.cost;
                        }
                        else if(extraFillings.toLowerCase().equals("yes")){
                            orderCount++;
                            Meal deluxMealOrder = new Meal("3");
                            System.out.println(deluxMealOrder);
                            delmeal.DeluxMeal("Crunchy Chips");
                            totalPrice+= delmeal.cost;
                        }

                        System.out.print("Do you want to add more Quick Meals ?(Yes/No)  ");
                        String quickMealDecision = scn.nextLine();

                        if(quickMealDecision.toLowerCase().equals("yes")){
                            continue;
                        }
                        else if(quickMealDecision.toLowerCase().equals("no")){
                            keepGoingQuickMeal=false;
                            break;
                        }
                    } else {
                        System.out.println("Oops your order is canceled !");
                        keepGoingMenu = false;
                        break;
                    }
                }
            }
            else if(mealNum.equals("2")){
                boolean keepGoingVegMeal=true;
                while (keepGoingVegMeal==true){
                    VegMeal vegMeal = new VegMeal();
                    if(orderCount>-1){
                        System.out.print("Do you want to add more Veg Meal ? (Yes/No) ");
                        String continueVegMeal = scn.nextLine();
                        if(continueVegMeal.toLowerCase().equals("yes")){

                        }
                        else if(continueVegMeal.toLowerCase().equals("no")){
                            keepGoingVegMeal=false;
                            break;
                        }
                    }
                    else{
                        System.out.println("Create your customized Veg. Meal");
                    }
                    System.out.println("Burger List : \n" +
                            "1. Burger Champ's Special Burger Rs. 270 \n" +
                            "2. Veg Whopper Rs. 170 ");
                    System.out.print("Enter your burger number or Enter (no) to get out of the veg menu : ");
                    String burgerType = scn.nextLine();

                    if(burgerType.equals("1")){
                        orderCount++;
                        vegBurger="Burger Champ's Special Burger";
                        vegMeal.burgerChampsSpecialBurgerVeg(vegBurger);
                        totalPrice+=vegMeal.cost;

                    }
                    else if(burgerType.equals("2")){
                        orderCount++;
                        vegBurger = "Veg Whopper";
                        vegMeal.vegWhopper(vegBurger);
                        totalPrice+=vegMeal.cost;
                    }
                    else if(burgerType.toLowerCase().equals("no")){
                        orderCount++;
                        System.out.println("Veg meal cancelled");
                        vegBurger="";
                        keepGoingVegMeal=false;
                        break;
                    }

                    System.out.println("Drink List : \n" +
                            "1. Protein Shake Rs. 120 \n" +
                            "2. Kit-Kat Shake Rs. 90");
                    System.out.print("Enter your Drink number or Enter (no) to get out of the veg menu : ");
                    String drinkType = scn.nextLine();

                    if(drinkType.equals("1")){
                        orderCount++;
                        vegDrink = "Protein Shake";
                        vegMeal.proteinShake("Protein Shake");
                        totalPrice+=vegMeal.cost;
                    }
                    else if(drinkType.equals("2")){
                        orderCount++;
                        vegDrink = "Kit-Kat Shake";
                        vegMeal.proteinShake("Kit-Kat Shake");
                        totalPrice+=vegMeal.cost;
                    }
                    else if(drinkType.toLowerCase().equals("no")){
                        System.out.println("Drinks cancelled !");
                        vegDrink = "";
                        keepGoingVegMeal=false;
                        break;
                    }

                    System.out.println("Size of drink : ");
                    System.out.print("Pick your size number or Enter (no) to get out of the veg menu \n" +
                            "1. large Rs. 80\n" +
                            "2. medium Rs. 50\n" +
                            "3. small Rs. 20 : ");
                    String sizeType = scn.nextLine();

                    if(sizeType.equals("1")){
                        orderCount++;
                        vegSize = "large";
                        vegMeal.largeSize();
                        totalPrice+=vegMeal.cost;
                    }

                    else if(sizeType.equals("2")){
                        orderCount++;
                        vegSize = "medium";
                        vegMeal.mediumSize();
                        totalPrice+=vegMeal.cost;
                    }

                    else if (sizeType.equals("3")){
                        orderCount++;
                        vegSize = "small";
                        vegMeal.smallSize();
                        totalPrice+=vegMeal.cost;
                    }

                    System.out.println("Side Item List : \n" +
                            "1. French Fries Rs. 45\n" +
                            "2. Cup Cake Rs. 65");
                    System.out.print("Enter your Side Item number or Enter (no) to get out of the veg menu : ");
                    String sideItemType = scn.nextLine();

                    if(sideItemType.equals("1")){
                        orderCount++;
                        vegSideItem="French Fries";
                        vegMeal.frenchFries(vegSideItem);
                        totalPrice+=vegMeal.cost;
                    }

                    else if(sideItemType.equals("2")){
                        orderCount++;
                        vegSideItem = "Cup Cake";
                        vegMeal.cupCake(vegSideItem);
                        totalPrice+=vegMeal.cost;
                    }

                    else if(sideItemType.toLowerCase().equals("no")){
                        keepGoingVegMeal=false;
                        vegSideItem = "";
                        System.out.println("no side meal added");
                    }

                    VegMeal vegMealOrder = new VegMeal(vegBurger, vegDrink, vegSize, vegSideItem);
                    System.out.println(vegMealOrder);
                }
            }
            else if(mealNum.equals("3")){
                System.out.println("F*ck Yo* !");
                System.out.println("It's not good to kill animals just to feed yourself. ");

                System.out.print("Do you want to continue ? (Yes/No) ");
                String nonVegMeal = scn.nextLine();

                if(nonVegMeal.toLowerCase().equals("yes")){
                    continue;
                }
                else if (nonVegMeal.toLowerCase().equals("no")){
                    System.out.println("Your bull shit Non Veg. order is happily cancelled.");
                    keepGoingMenu=false;
                    break;
                }

            }
            else{
                System.out.println("You are out of the Menu !");
                keepGoingMenu=false;
                break;
            }
        }

        System.out.println();
        System.out.print("Total Bill : Rs. "+totalPrice);

    }
}
