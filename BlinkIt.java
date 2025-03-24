class BlinkIt {
    public static double getFoodPrice(String foodName) {
        double price = 0.0;

        if (foodName == "Vegetable Samosa") {
            price = 49.99;
        } 
		else if (foodName == "Chicken Kebab") {
            price = 159.99;
        } 
		else if (foodName == "Paneer Butter Masala") {
            price = 299.99;
        } 
		else if (foodName == "Tandoori Roti") {
            price = 39.99;
        } 
		else if (foodName == "Dal Makhani") {
            price = 249.99;
        } 
		else if (foodName == "Fish Curry") {
            price = 349.99;
        } 
		else if (foodName == "Mutton Biryani") {
            price = 399.99;
        } 
		else if (foodName == "Pav Bhaji") {
            price = 199.99;
        } 
		else if (foodName == "Masala Dosa") {
            price = 149.99;
        } 
		else if (foodName == "Rasam Rice") {
            price = 129.99;
        } 
		else if (foodName == "Chicken 65") {
            price = 219.99;
        } 
		else if (foodName == "Egg Curry") {
            price = 179.99;
        } 
		else if (foodName == "Mysore Pak") {
            price = 99.99;
        } 
		else if (foodName == "Dhokla") {
            price = 119.99;
        } 
		else if (foodName == "Rajma Chawal") {
            price = 229.99;
        } 
		else if (foodName == "Chilli Paneer") {
            price = 259.99;
        } 
		else if (foodName == "Veg Manchurian") {
            price = 189.99;
        } 
		else if (foodName == "Hakka Noodles") {
            price = 209.99;
        } 
		else if (foodName == "Spring Rolls") {
            price = 179.99;
        } 
		else if (foodName == "Gulab Jamun") {
            price = 89.99;
        } 
		else if (foodName == "Rabri") {
            price = 149.99;
        } 
		else if (foodName == "Aloo Paratha") {
            price = 119.99;
        } 
		else if (foodName == "Bhindi Masala") {
            price = 199.99;
        } 
		else if (foodName == "Chole Bhature") {
            price = 239.99;
        } 
		else if (foodName == "Mutton Rogan Josh") {
            price = 419.99;
        } 
		else if (foodName == "Kadai Chicken") {
            price = 349.99;
        } 
		else if (foodName == "Butter Chicken") {
            price = 369.99;
        } 
		else if (foodName == "Gajar Ka Halwa") {
            price = 129.99;
        } 
		else if (foodName == "Baingan Bharta") {
            price = 209.99;
        } 
		else if (foodName == "Palak Paneer") {
            price = 279.99;
        } 
		else if (foodName == "Methi Thepla") {
            price = 149.99;
        } 
		else if (foodName == "Pesarattu") {
            price = 179.99;
        } 
		else if (foodName == "Kesari Bath") {
            price = 99.99;
        } 
		else if (foodName == "Chenna Poda") {
            price = 159.99;
        } 
		else if (foodName == "Mishti Doi") {
            price = 139.99;
        } 
		else if (foodName == "Shahi Tukda") {
            price = 149.99;
        } 
		else if (foodName == "Hyderabadi Haleem") {
            price = 299.99;
        } 
		else if (foodName == "Sarson Ka Saag") {
            price = 189.99;
        } 
		else if (foodName == "Malai Kofta") {
            price = 259.99;
        } 
		else {
            System.out.println(foodName + " is not available on BlinkIt.");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }
	public static double getFoodPrice(String foodName,int quantity) {
        double price =  0.0;

        if (foodName == "Vegetable Samosa") {
            price = quantity * 49.99;
        } 
		else if (foodName == "Chicken Kebab") {
            price = quantity * 159.99;
        } 
		else if (foodName == "Paneer Butter Masala") {
            price = quantity * 299.99;
        } 
		else if (foodName == "Tandoori Roti") {
            price = quantity * 39.99;
        } 
		else if (foodName == "Dal Makhani") {
            price = quantity * 249.99;
        } 
		else if (foodName == "Fish Curry") {
            price = quantity * 349.99;
        } 
		else if (foodName == "Mutton Biryani") {
            price = quantity * 399.99;
        } 
		else if (foodName == "Pav Bhaji") {
            price = quantity * 199.99;
        } 
		else if (foodName == "Masala Dosa") {
            price = quantity * 149.99;
        } 
		else if (foodName == "Rasam Rice") {
            price = quantity * 129.99;
        } 
		else if (foodName == "Chicken 65") {
            price = quantity * 219.99;
        } 
		else if (foodName == "Egg Curry") {
            price = quantity * 179.99;
        } 
		else if (foodName == "Mysore Pak") {
            price = quantity * 99.99;
        } 
		else if (foodName == "Dhokla") {
            price = quantity * 119.99;
        } 
		else if (foodName == "Rajma Chawal") {
            price = quantity * 229.99;
        } 
		else if (foodName == "Chilli Paneer") {
            price = quantity * 259.99;
        } 
		else if (foodName == "Veg Manchurian") {
            price = quantity * 189.99;
        } 
		else if (foodName == "Hakka Noodles") {
            price = quantity * 209.99;
        } 
		else if (foodName == "Spring Rolls") {
            price = quantity * 179.99;
        } 
		else if (foodName == "Gulab Jamun") {
            price = quantity * 89.99;
        } 
		else if (foodName == "Rabri") {
            price = quantity * 149.99;
        } 
		else if (foodName == "Aloo Paratha") {
            price = quantity * 119.99;
        } 
		else if (foodName == "Bhindi Masala") {
            price = quantity * 199.99;
        } 
		else if (foodName == "Chole Bhature") {
            price = quantity * 239.99;
        } 
		else if (foodName == "Mutton Rogan Josh") {
            price = quantity * 419.99;
        } 
		else if (foodName == "Kadai Chicken") {
            price = quantity * 349.99;
        } 
		else if (foodName == "Butter Chicken") {
            price = quantity * 369.99;
        } 
		else if (foodName == "Gajar Ka Halwa") {
            price = quantity * 129.99;
        } 
		else if (foodName == "Baingan Bharta") {
            price = quantity * 209.99;
        } 
		else if (foodName == "Palak Paneer") {
            price = quantity * 279.99;
        } 
		else if (foodName == "Methi Thepla") {
            price = quantity * 149.99;
        } 
		else if (foodName == "Pesarattu") {
            price = quantity * 179.99;
        } 
		else if (foodName == "Kesari Bath") {
            price = quantity * 99.99;
        } 
		else if (foodName == "Chenna Poda") {
            price = quantity * 159.99;
        } 
		else if (foodName == "Mishti Doi") {
            price = quantity * 139.99;
        } 
		else if (foodName == "Shahi Tukda") {
            price = quantity * 149.99;
        } 
		else if (foodName == "Hyderabadi Haleem") {
            price = quantity * 299.99;
        } 
		else if (foodName == "Sarson Ka Saag") {
            price = quantity * 189.99;
        } 
		else if (foodName == "Malai Kofta") {
            price = quantity * 259.99;
        } 
		else {
            System.out.println(foodName + " is not available on BlinkIt.");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }

}
