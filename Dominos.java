class Dominos {
    public static double getFoodPrice(String foodName) {
        double price = 0.0;

        if (foodName.equals("Margherita Pizza")) {
            price = 299.99;
        } else if (foodName.equals("Veg Extravaganza")) {
            price = 499.99;
        } else if (foodName.equals("Farmhouse Pizza")) {
            price = 459.99;
        } else if (foodName.equals("Cheese Burst Pizza")) {
            price = 519.50;
        } else if (foodName.equals("Garlic Bread")) {
            price = 149.99;
        } else if (foodName.equals("Stuffed Garlic Bread")) {
            price = 199.99;
        } else if (foodName.equals("Taco Mexicana")) {
            price = 169.99;
        } else if (foodName.equals("Veg Supreme Burger")) {
            price = 229.50;
        } else if (foodName.equals("Classic Hand Tossed Pizza")) {
            price = 399.00;
        } else if (foodName.equals("Chicken Dominator Pizza")) {
            price = 599.99;
        } else if (foodName.equals("Paneer Makhani Pizza")) {
            price = 479.99;
        } else if (foodName.equals("Peppy Paneer Pizza")) {
            price = 449.50;
        } else if (foodName.equals("Spiced Chicken Wings")) {
            price = 329.00;
        } else if (foodName.equals("Peri Peri Chicken Pizza")) {
            price = 579.99;
        } else if (foodName.equals("Chicken Keema Paratha")) {
            price = 259.99;
        } else if (foodName.equals("Chicken Sausage Pizza")) {
            price = 519.50;
        } else if (foodName.equals("Pepperoni Pizza")) {
            price = 619.99;
        } else if (foodName.equals("Tandoori Paneer Pizza")) {
            price = 489.00;
        } else if (foodName.equals("Veggie Paradise Pizza")) {
            price = 429.99;
        } else if (foodName.equals("BBQ Chicken Pizza")) {
            price = 559.99;
        } else if (foodName.equals("Chicken Zinger Burger")) {
            price = 289.50;
        } else if (foodName.equals("Choco Lava Cake")) {
            price = 119.99;
        } else if (foodName.equals("Choco Brownie")) {
            price = 149.99;
        } else if (foodName.equals("Tandoori Chicken Wings")) {
            price = 349.99;
        } else if (foodName.equals("Chicken Tikka Sandwich")) {
            price = 219.99;
        } else if (foodName.equals("Veggie Wrap")) {
            price = 159.50;
        } else if (foodName.equals("Cheese Garlic Sticks")) {
            price = 179.99;
        } else if (foodName.equals("Pasta Italiano")) {
            price = 249.99;
        } else if (foodName.equals("Mexican Green Wave Pizza")) {
            price = 489.99;
        } else if (foodName.equals("Veg Manchurian Pizza")) {
            price = 419.99;
        } else if (foodName.equals("BBQ Sausage Pizza")) {
            price = 579.99;
        } else if (foodName.equals("Double Cheese Margherita")) {
            price = 369.99;
        } else if (foodName.equals("Chicken Seekh Kebab")) {
            price = 259.99;
        } else if (foodName.equals("Mushroom Delight Pizza")) {
            price = 399.50;
        } else if (foodName.equals("Paneer Roll")) {
            price = 209.99;
        } else if (foodName.equals("Spicy Chicken Burger")) {
            price = 279.99;
        } else if (foodName.equals("Butter Chicken Pizza")) {
            price = 549.99;
        } else if (foodName.equals("Tandoori Chicken Roll")) {
            price = 289.99;
        } else {
            System.out.println(foodName + " is not available on Dominos");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }
	public static double getFoodPrice(String foodName,int quantity) {
        double price = 0.0;

        if (foodName.equals("Margherita Pizza")) {
            price = quantity *299.99;
        } else if (foodName.equals("Veg Extravaganza")) {
            price = quantity *499.99;
        } else if (foodName.equals("Farmhouse Pizza")) {
            price = quantity *459.99;
        } else if (foodName.equals("Cheese Burst Pizza")) {
            price = quantity *519.50;
        } else if (foodName.equals("Garlic Bread")) {
            price = quantity *149.99;
        } else if (foodName.equals("Stuffed Garlic Bread")) {
            price = quantity *199.99;
        } else if (foodName.equals("Taco Mexicana")) {
            price = quantity *169.99;
        } else if (foodName.equals("Veg Supreme Burger")) {
            price = quantity *229.50;
        } else if (foodName.equals("Classic Hand Tossed Pizza")) {
            price = quantity *399.00;
        } else if (foodName.equals("Chicken Dominator Pizza")) {
            price = quantity *599.99;
        } else if (foodName.equals("Paneer Makhani Pizza")) {
            price = quantity *479.99;
        } else if (foodName.equals("Peppy Paneer Pizza")) {
            price = quantity *449.50;
        } else if (foodName.equals("Spiced Chicken Wings")) {
            price = quantity *329.00;
        } else if (foodName.equals("Peri Peri Chicken Pizza")) {
            price = quantity *579.99;
        } else if (foodName.equals("Chicken Keema Paratha")) {
            price = quantity *259.99;
        } else if (foodName.equals("Chicken Sausage Pizza")) {
            price = quantity *519.50;
        } else if (foodName.equals("Pepperoni Pizza")) {
            price = quantity *619.99;
        } else if (foodName.equals("Tandoori Paneer Pizza")) {
            price = quantity *489.00;
        } else if (foodName.equals("Veggie Paradise Pizza")) {
            price = quantity *429.99;
        } else if (foodName.equals("BBQ Chicken Pizza")) {
            price = quantity *559.99;
        } else if (foodName.equals("Chicken Zinger Burger")) {
            price = quantity *289.50;
        } else if (foodName.equals("Choco Lava Cake")) {
            price = quantity *119.99;
        } else if (foodName.equals("Choco Brownie")) {
            price = quantity *149.99;
        } else if (foodName.equals("Tandoori Chicken Wings")) {
            price = quantity *349.99;
        } else if (foodName.equals("Chicken Tikka Sandwich")) {
            price = quantity *219.99;
        } else if (foodName.equals("Veggie Wrap")) {
            price = quantity *159.50;
        } else if (foodName.equals("Cheese Garlic Sticks")) {
            price = quantity *179.99;
        } else if (foodName.equals("Pasta Italiano")) {
            price = quantity *249.99;
        } else if (foodName.equals("Mexican Green Wave Pizza")) {
            price = quantity *489.99;
        } else if (foodName.equals("Veg Manchurian Pizza")) {
            price = quantity *419.99;
        } else if (foodName.equals("BBQ Sausage Pizza")) {
            price = quantity *579.99;
        } else if (foodName.equals("Double Cheese Margherita")) {
            price = quantity *369.99;
        } else if (foodName.equals("Chicken Seekh Kebab")) {
            price = quantity *259.99;
        } else if (foodName.equals("Mushroom Delight Pizza")) {
            price = quantity *399.50;
        } else if (foodName.equals("Paneer Roll")) {
            price = quantity *209.99;
        } else if (foodName.equals("Spicy Chicken Burger")) {
            price = quantity *279.99;
        } else if (foodName.equals("Butter Chicken Pizza")) {
            price = quantity *549.99;
        } else if (foodName.equals("Tandoori Chicken Roll")) {
            price = quantity *289.99;
        } else {
            System.out.println(foodName + " is not available on Dominos");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }
}
