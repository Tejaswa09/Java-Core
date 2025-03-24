class OlaFoods {
    public static double getFoodPrice(String foodName) {
        double price =0.0;

        if (foodName=="Schezwan Fried Rice") {
            price = 189.99;
        } 
        else if (foodName=="Paneer Tikka Roll") {
            price = 219.99;
        }
        else if (foodName=="Tandoori Momos") {
            price = 159.99;
        } 
        else if (foodName=="Spaghetti Aglio e Olio") {
            price = 299.99;
        }
        else if (foodName=="Fish Amritsari") {
            price = 349.99;
        }
        else if (foodName=="Mexican Burrito") {
            price = 249.99;
        }
        else if (foodName=="Tandoori Roti") {
            price = 49.99;
        } 
        else if (foodName=="Soya Chaap Masala") {
            price = 199.99;
        } 
        else if (foodName=="Palak Chaat") {
            price = 129.99;
        } 
        else if (foodName=="Rogan Josh") {
            price = 399.99;
        } 
        else if (foodName=="Litti Chokha") {
            price = 169.99;
        } 
        else if (foodName=="Sarson da Saag") {
            price = 229.99;
        } 
        else if (foodName=="Butter Garlic Naan") {
            price = 69.99;
        } 
        else if (foodName=="Paya Soup") {
            price = 259.99;
        } 
        else if (foodName=="Pav Bhaji Dosa") {
            price = 189.99;
        } 
        else if (foodName=="Chole Bhature") {
            price = 179.99;
        } 
        else if (foodName=="Kerala Parotta") {
            price = 89.99;
        } 
        else if (foodName=="Mutton Sukka") {
            price = 379.99;
        } 
        else if (foodName=="Kashmiri Pulao") {
            price = 249.99;
        } 
        else if (foodName=="Coconut Barfi") {
            price = 99.99;
        } 
        else if (foodName=="Jaljeera") {
            price = 79.99;
        } 
        else if (foodName=="Chicken Malai Tikka") {
            price = 319.99;
        } 
        else if (foodName=="Punjabi Kadhi") {
            price = 199.99;
        } 
        else if (foodName=="Bread Pakora") {
            price = 89.99;
        } 
        else if (foodName=="Tamarind Rice") {
            price = 139.99;
        } 
        else if (foodName=="Pineapple Sheera") {
            price = 119.99;
        } 
        else if (foodName=="Veg Kolhapuri") {
            price = 219.99;
        } 
        else if (foodName=="Hariyali Chicken") {
            price = 289.99;
        } 
        else if (foodName=="Baked Rasgulla") {
            price = 139.99;
        } 
        else if (foodName=="Chilli Cheese Toast") {
            price = 129.99;
        } 
        else if (foodName=="Paneer Butter Masala") {
            price = 259.99;
        } 
        else if (foodName=="Chicken Changezi") {
            price = 349.99;
        } 
        else if (foodName=="Chocolate Paan") {
            price = 79.99;
        } 
        else if (foodName=="Dahi Kebab") {
            price = 189.99;
        } 
        else if (foodName=="Tawa Pulao") {
            price = 179.99;
        } 
        else if (foodName=="Gobi 65") {
            price = 159.99;
        } 
        else if (foodName=="Thandai") {
            price = 129.99;
        } 
        else if (foodName=="Pumpkin Halwa") {
            price = 149.99;
        } 
        else {
            System.out.println(foodName + " is not available on OlaFoods");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }
	    public static double getFoodPrice(String foodName, int quantity) {
        double price = 0.0;

        if (foodName=="Schezwan Fried Rice") {
            price = quantity *189.99;
        } 
        else if (foodName=="Paneer Tikka Roll") {
            price = quantity *219.99;
        }
        else if (foodName=="Tandoori Momos") {
            price = quantity *159.99;
        } 
        else if (foodName=="Spaghetti Aglio e Olio") {
            price = quantity *299.99;
        }
        else if (foodName=="Fish Amritsari") {
            price = quantity *349.99;
        }
        else if (foodName=="Mexican Burrito") {
            price = quantity *249.99;
        }
        else if (foodName=="Tandoori Roti") {
            price = quantity *49.99;
        } 
        else if (foodName=="Soya Chaap Masala") {
            price = quantity *199.99;
        } 
        else if (foodName=="Palak Chaat") {
            price = quantity *129.99;
        } 
        else if (foodName=="Rogan Josh") {
            price = quantity *399.99;
        } 
        else if (foodName=="Litti Chokha") {
            price = quantity *169.99;
        } 
        else if (foodName=="Sarson da Saag") {
            price = quantity *229.99;
        } 
        else if (foodName=="Butter Garlic Naan") {
            price = quantity *69.99;
        } 
        else if (foodName=="Paya Soup") {
            price = quantity *259.99;
        } 
        else if (foodName=="Pav Bhaji Dosa") {
            price = quantity *189.99;
        } 
        else if (foodName=="Chole Bhature") {
            price = quantity *179.99;
        } 
        else if (foodName=="Kerala Parotta") {
            price = quantity *89.99;
        } 
        else if (foodName=="Mutton Sukka") {
            price = quantity *379.99;
        } 
        else if (foodName=="Kashmiri Pulao") {
            price = quantity *249.99;
        } 
        else if (foodName=="Coconut Barfi") {
            price = quantity *99.99;
        } 
        else if (foodName=="Jaljeera") {
            price = quantity *79.99;
        } 
        else if (foodName=="Chicken Malai Tikka") {
            price = quantity *319.99;
        } 
        else if (foodName=="Punjabi Kadhi") {
            price = quantity *199.99;
        } 
        else if (foodName=="Bread Pakora") {
            price = quantity *89.99;
        } 
        else if (foodName=="Tamarind Rice") {
            price = quantity *139.99;
        } 
        else if (foodName=="Pineapple Sheera") {
            price = quantity *119.99;
        } 
        else if (foodName=="Veg Kolhapuri") {
            price = quantity *219.99;
        } 
        else if (foodName=="Hariyali Chicken") {
            price = quantity *289.99;
        } 
        else if (foodName=="Baked Rasgulla") {
            price = quantity *139.99;
        } 
        else if (foodName=="Chilli Cheese Toast") {
            price = quantity *129.99;
        } 
        else if (foodName=="Paneer Butter Masala") {
            price = quantity *259.99;
        } 
        else if (foodName=="Chicken Changezi") {
            price = quantity *349.99;
        } 
        else if (foodName=="Chocolate Paan") {
            price = quantity *79.99;
        } 
        else if (foodName=="Dahi Kebab") {
            price = quantity *189.99;
        } 
        else if (foodName=="Tawa Pulao") {
            price = quantity *179.99;
        } 
        else if (foodName=="Gobi 65") {
            price = quantity *159.99;
        } 
        else if (foodName=="Thandai") {
            price = quantity *129.99;
        } 
        else if (foodName=="Pumpkin Halwa") {
            price = quantity *149.99;
        } 
        else {
            System.out.println(foodName + " is not available on OlaFoods");
        }

        System.out.println("The food item is " + foodName + " and the price is " + price);
        return price;
    }
}
