package com.khatri.delightfulrecipes.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.khatri.delightfulrecipes.R;

public class DB_Recipe extends SQLiteOpenHelper {
    final static String DB_NAME = "db_recipe";

    public DB_Recipe(Context context) {
        super(context, DB_NAME, null, 3);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS recipe(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        String sql1 = "CREATE TABLE IF NOT EXISTS nonjainstarters(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        String sql2 = "CREATE TABLE IF NOT EXISTS nonvegstarters(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        String sql3 = "CREATE TABLE IF NOT EXISTS vegmain(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        String sql4 = "CREATE TABLE IF NOT EXISTS nonvegmain(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        String sql5 = "CREATE TABLE IF NOT EXISTS rice(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        String sql6 = "CREATE TABLE IF NOT EXISTS dessert(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        String sql7 = "CREATE TABLE IF NOT EXISTS occasion(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        String sql8 = "CREATE TABLE IF NOT EXISTS salad(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, ingredient TEXT, method TEXT, img BLOB)";
        db.execSQL(sql);
        db.execSQL(sql1);
        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql4);
        db.execSQL(sql5);
        db.execSQL(sql6);
        db.execSQL(sql7);
        db.execSQL(sql8);

        ContentValues values = new ContentValues();
        values.put("_id", "1");
        values.put("name", "Jain Pav Bhaji");
        values.put("ingredient", "( Makes Approx. 1 1/2 Cups )\n" +
                "35 to 40 whole dry kashmiri red chillies , deseeded and soaked in 1/3 cup warm water.\n" +
                "\n" +
                "For The Bhaji\n" +
                "1 tbsp oil\n" +
                "2 tbsp butter\n" +
                "1 tbsp cumin seeds (jeera)\n" +
                "1/2 cup chopped capsicum\n" +
                "2 cups finely chopped tomatoes\n" +
                "2 tsp chilli powder\n" +
                "1 1/2 tbsp pav bhaji masala , refer handy tip\n" +
                "salt to taste\n" +
                "3/4 cup boiled cauliflower florets\n" +
                "1/3 cup hara vatana (dried green peas) , soaked , boiled and mashed\n" +
                "3/4 cup boiled green peas\n" +
                "2 tbsp finely chopped coriander (dhania)\n" +
                "\n" +
                "For The Pav\n" +
                "8 laddi ladi pav\n" +
                "8 tsp butter for cooking\n" +
                "1 tsp pav bhaji masala\n" +
                "\n" +
                "For The Garnish\n" +
                "1 tbsp chopped coriander (dhania)");
        values.put("method","For the bhaji\n" +
                "Heat the oil and butter on a large tava (griddle) or in a kadhai and add the cumin seeds.\n" +
                "When the seeds crackle, add 2 tbsp of red chilli paste and sauté on a medium flame for a few seconds.\n" +
                "Add the capsicum and sauté on a medium flame for a minute.\n" +
                "Add the tomatoes, chilli powder, pav bhaji masala, salt and ½ cup of water, mix well and cook on a medium flame for 5 to 7 minutes or till the oil separates, while mashing continuously with a potato masher.\n" +
                "Add the cauliflower, mashed hara vatana, green peas, coriander and 1/3 cup of water, mash well using a potato masher and cook on a medium flame for 5 to 7 minutes, while stirring continuously.\n" +
                "\n" +
                "For the pav\n" +
                "Slit 2 pavs vertically and keep aside.\n" +
                "Heat a large tava, add 2 tsp of butter and ¼ tsp of pav bhaji masala, mix well and slit open the pavs and place on it.\n" +
                "Cook on a medium flame till they turn light brown and crisp on both the sides. (add more butter if required).\n" +
                "\n" +
                "How to serve\n" +
                "Place ¼th of the bhaji, 2 pavs, a few tomato slices, a lemon wedge and a papad on a plate.\n" +
                "Top the bhaji with 1 tsp of butter and serve immediately garnished with coriander.\n" +
                "Repeat with the remaining ingredients to make 3 more plates.\n" +
                "\n" +
                "Handy tip :\n" +
                "Pav bhaji masala is a spice blend, which is readily available under different brand names at most grocery stores.\n");
        values.put("img", R.drawable.jpavbhaji);
        db.insert("recipe", "_id", values);

        values.put("_id", "2");
        values.put("name", "Aam ke Pakode");
        values.put("ingredient",
                "1 1/2 cups riped alphonso mango cubes\n" +
                "oil for deep-frying\n" +
                "\n" +
                "To Be Mixed Into A Thick Batter (using Approx. 3/4 Cup Of Water)\n" +
                "3/4 cup besan (bengal gram flour)\n" +
                "1/4 cup rice flour (chawal ka atta)\n" +
                "1/4 tsp carom seeds (ajwain)\n" +
                "1/2 tsp chilli powder\n" +
                "1/4 tsp turmeric powder (haldi)\n" +
                "2 pinches asafoetida (hing)\n" +
                "salt to taste");
        values.put("method","For the bhaji\n" +
                "Heat the oil in a deep non-stick pan, dip the mango cubes individually into the batter and deep-fry till they turn golden brown and crisp from all the sides. Drain on an absorbent paper.\n" +
                "\n" +
                "Serve immediately.");
        values.put("img", R.drawable.aam);
        db.insert("recipe", "_id", values);

        values.put("_id", "3");
        values.put("name", "Asparagus Rolls");
        values.put("ingredient",
                "10 fresh bread slices\n" +
                        "1/2 tsp mustard (rai / sarson) powder\n" +
                        "2 green chillies, chopped (optional)\n" +
                        "10 asparagus pieces (from can)\n" +
                        "1/3 cup butter (approx.)\n" +
                        "little salt");
        values.put("method","Remove the crust from the slices of bread.\n" +
                "Mix the mustard powder in 1 teaspoon of water. Add this to the butter and mix well.\n" +
                "Roll the bread slices a little. Apply the above butter over the slices.\n" +
                "Sprinkle very little salt and a few green chillies over each slice.\n" +
                "Put a piece of asparagus at the end of each slice. Roll up each slice and tie the rolls with thread.\n" +
                "Put all the rolls in a box and chill in the freezer compartment of a refrigerator for 1 hour.\n" +
                "Remove thread and cut into pieces.\n" +
                "Serve cold.");
        values.put("img", R.drawable.rolls);
        db.insert("recipe", "_id", values);

        values.put("_id", "4");
        values.put("name", "Baked Chaklis");
        values.put("ingredient",
                "1 cup rice flour (chawal ka atta)\n" +
                        "1/2 cup low-fat curds (dahi)\n" +
                        "2 tsp sesame seeds (til)\n" +
                        "1 tsp chilli powder\n" +
                        "a pinch of asafoetida (hing) , optional\n" +
                        "salt to taste\n" +
                        "1 tsp oil");
        values.put("method","Combine all the ingredients in a bowl, mix well and knead into a semi-soft dough using enough water.\n" +
                "\n" +
                "Put the mixture into a chakli press and press out round swirls of the dough onto a greased baking tray, working closely from the centre to the outside to the swirls (approximately 50 mm. (2\") diameter). You will get about 30 chaklis.\n" +
                "\n" +
                "Bake these chaklis in a pre-heated oven at 180°c (360°f) for 30 to 35 minutes, turning all the chaklis once after 15 to 20 minutes.\n" +
                "\n" +
                "Cool and store in an air-tight container.\n" +
                "\n" +
                "\n" +
                "Handy tip :\n" +
                "Adding 1 tbsp of oil instead of 1 tsp in this recipe reduces the cooking to 25 minutes and also makes the chakli a little softer.");
        values.put("img", R.drawable.chaklis);
        db.insert("recipe", "_id", values);

        values.put("_id", "5");
        values.put("name", "Baked Tortilla Chips");
        values.put("ingredient",
                "1 cup maize flour (makai ka atta)\n" +
                        "1/2 cup whole wheat flour (gehun ka atta)\n" +
                        "1/4 tsp chilli powder\n" +
                        "1/2 tsp carom seeds (ajwain)\n" +
                        "1 tsp oil\n" +
                        "salt to taste\n" +
                        "plain flour (maida) for dusting");
        values.put("method","Combine all the ingredients in a bowl and knead into a soft dough using hot water.\n" +
                "Divide the dough into 6 equal portions.\n" +
                "Roll out each portion between two sheets of plastic into a thin circle of 175 mm. (7\") diameter. Dust the tortillas generously with flour to make the rolling easier.\n" +
                "Lightly cook the tortillas on a non-stick pan.\n" +
                "Cut each tortilla into 6 triangular pieces.\n" +
                "Place the tortilla pieces in a single layer on a non-stick baking tray.\n" +
                "Bake at 190°c (380°f) for 7 to 8 minutes or until the tortilla chips are crisp and lightly browned.\n" +
                "Cool and store in an air-tight container.");
        values.put("img", R.drawable.chips);
        db.insert("recipe", "_id", values);

        values.put("_id", "1");
        values.put("name", "Aloo kurkure");
        values.put("ingredient",
                "1 cup boiled , peeled and mashed potatoes\n" +
                        "1/2 cup chopped mint leaves (phudina)\n" +
                        "1/2 tbsp finely chopped green chillies\n" +
                        "1/2 tsp roasted cumin seeds (jeera) powder\n" +
                        "1/2 tsp lemon juice\n" +
                        "salt to taste\n" +
                        "1/3 cup plain flour (maida)\n" +
                        "1/3 cup beaten rice (poha) , coarsely ground\n" +
                        "oil for deep-frying\n" +
                        "\n" +
                        "For Serving\n" +
                        "sweet and sour sauce");
        values.put("method","Combine the potatoes, mint leaves, green chillies, cumin seeds powder, lemon juice and salt in a bowl and mix well.\n" +
                "\n" +
                "Divide the mixture into 6 equal portions and shape them into round balls. Keep aside.\n" +
                "\n" +
                "Combine the plain flour with a little water to make a thick and smooth paste and keep aside.\n" +
                "\n" +
                "Dip each potato ball in the flour paste and then roll in powdered rice flakes till they are evenly coated from all the sides.\n" +
                "\n" +
                "Heat the oil in a kadhai and deep-fry the potato balls a few at a time till they are golden brown in colour from all sides. Drain on absorbent paper.\n" +
                "\n" +
                "Serve hot with sweet and sour sauce.");
        values.put("img", R.drawable.alookurkure);
        db.insert("nonjainstarters", "_id", values);

        values.put("_id", "2");
        values.put("name", "Aloo Cheese");
        values.put("ingredient",
                "3 cups boiled , peeled and mashed potatoes\n" +
                        "salt to taste\n" +
                        "1/2 tsp freshly ground black pepper (kalimirch)\n" +
                        "1/2 cup plain flour (maida)\n" +
                        "bread crumbs for rolling\n" +
                        "oil for deep-frying\n" +
                        "\n" +
                        "To Be Mixed Into A Cheesy Stuffing\n" +
                        "1/2 cup grated mozzarella cheese\n" +
                        "1/2 cup grated processed cheese\n" +
                        "2 tbsp chilli-garlic sauce\n" +
                        "\n" +
                        "For Serving\n" +
                        "chilli-garlic sauce");
        values.put("method","Combine the potatoes, salt and pepper powder in a deep bowl and mix well.\n" +
                "Divide the potato mixture into 12 equal portions and keep aside.\n" +
                "Combine the plain flour along with approx. ¾ cup water in a deep bowl and mix well using a whisk till no lumps remain. Keep aside.\n" +
                "Divide the cheese stuffing into 12 equal portions and keep aside.\n" +
                "Take a portion of the potato mixture and flatten it on your palm into a 50 mm. (2”) diameter circle using your fingers.\n" +
                "Place a portion of the cheese stuffing in the centre and bring all the sides together and shape into a cylindrical roll.\n" +
                "Dip the croquette in the plain flour-water mixture and roll it in the bread crumbs till it is evenly coated from all the sides.\n" +
                "Repeat step 5 to 7 to make 11 more croquettes.\n" +
                "Heat the oil in a deep non-stick pan and deep-fry, a few croquettes at a time on a medium flame, till they are golden brown in colour from all sides. Drain on an absorbent paper.\n" +
                "Serve immediately with chilli-garlic sauce.");
        values.put("img", R.drawable.aloocheese);
        db.insert("nonjainstarters", "_id", values);

        values.put("_id", "3");
        values.put("name", "Aloo & Shakarkhand chaat");
        values.put("ingredient",
                "2 cups boiled and peeled potato cubes\n" +
                        "2 cups boiled and peeled sweet potato (shakarkand) cubes\n" +
                        "4 tbsp oil\n" +
                        "6 tbsp khajur imli ki chutney\n" +
                        "4 tbsp green chutney\n" +
                        "1 cup whisked curds (dahi)\n" +
                        "\n" +
                        "For Sprinkling\n" +
                        "black salt\n" +
                        "roasted cumin seeds (jeera) powder\n" +
                        "chilli powder\n" +
                        "salt to taste\n" +
                        "\n" +
                        "For The Garnish\n" +
                        "1 tbsp finely chopped coriander (dhania)");
        values.put("method","Heat the oil in a broad not-stick pan, add the potatoes and sweet potatoes and cook on a medium flame for 3 to 4 minute or till they turn golden brown in colour, while stirring occasionally.\n" +
                "\n" +
                "Remove from the flame and divide into 4 equal portions.\n" +
                "Place a portion of the prepared mixture in a serving plate and top with 1½ tbsp of khajur imli ki chutney, 1 tbsp green chutney and ¼ cup of curds evenly over it.\n" +
                "\n" +
                "Sprinkle a little black salt, cumin seeds powder, chilli powder and salt evenly over it.\n" +
                "\n" +
                "Repeat steps 3 and 4 to make 3 more plates.\n" +
                "Serve immediately garnished with coriander.\n" +
                "\n" +
                "Handy tip:\n" +
                "While boiling potatoes and sweet potatoes, make sure boil them in salted water.");
        values.put("img", R.drawable.aloochaat);
        db.insert("nonjainstarters", "_id", values);

        values.put("_id", "4");
        values.put("name", "Aachari Paneer Tikka");
        values.put("ingredient",
                "For The Achaari Marinade\n" +
                        "1 tbsp green chilli pickle\n" +
                        "1/2 cup hung curds (chakka dahi)\n" +
                        "1 tsp chopped garlic (lehsun)\n" +
                        "1 tsp fennel seeds (saunf)\n" +
                        "1/2 tsp mustard seeds ( rai / sarson)\n" +
                        "1/4 tsp fenugreek (methi) seeds\n" +
                        "1/4 tsp nigella seeds (kalonji)\n" +
                        "1 tsp cumin seeds (jeera)\n" +
                        "1/4 tsp turmeric powder (haldi)\n" +
                        "1 tbsp mustard (rai / sarson) oil\n" +
                        "salt to taste\n" +
                        "\n" +
                        "Other Ingredients\n" +
                        "1 1/2 cups paneer (cottage cheese) cubes\n" +
                        "oil for greasing and cooking\n" +
                        "\n" +
                        "For Serving\n" +
                        "dahiwali mint leaves (phudina) chutney");
        values.put("method","For the achaari marinade\n" +
                "Combine all the ingredients, except the curds in a mixer and blend to a coarse mixture.\n" +
                "Transfer the mixture into a deep bowl, add the curds and mix well.\n" +
                "\n" +
                "How to proceed\n" +
                "Add the paneer to the prepared achaari marinade, mix gently and keep aside to marinate for 20 minutes.\n" +
                "Arrange the marinated paneer cubes equally on satay sticks and keep aside.\n" +
                "Heat a non-stick tava (griddle), grease it with little oil, place a few satays on it and cook on a medium flame, using a little oil, till they turn golden brown in colour from all the sides.\n" +
                "Repeat step 3 to cook more satays.\n" +
                "Serve immediately with dahiwali phudina chutney.");
        values.put("img", R.drawable.achaari);
        db.insert("nonjainstarters", "_id", values);
        values.put("_id", "5");
        values.put("name", "American chop suey\n");
        values.put("ingredient",
                "For The Crispy Noodles\n" +
                        "4 cups parboiled hakka noodles\n" +
                        "oil for deep-frying\n" +
                        "\n" +
                        "For The Chopsuey Topping\n" +
                        "1/2 cup sliced onions\n" +
                        "1/2 cup capsicum strips\n" +
                        "1/2 cup carrot juliennes\n" +
                        "1/2 cup shredded cabbage\n" +
                        "1/2 cup boiled noodles\n" +
                        "1 1/2 tbsp cornflour\n" +
                        "2 tbsp oil\n" +
                        "1 cup tomato ketchup\n" +
                        "2 tsp chilli sauce\n" +
                        "2 tbsp vinegar\n" +
                        "1 tbsp sugar\n" +
                        "salt to taste");
        values.put("method","For the crispy noodles\n" +
                "1. Heat the oil in a deep non-stick kadhai, add 2 cups of hakka noodles and spread it evenly to form a layer and deep-fry till it turns crispy and golden brown in colour from both the sides. Drain on an absorbent paper.\n" +
                "2. Repeat step 1 to deep-fry the remaining noodles. Keep aside.\n" +
                "\n" +
                "For the chopsuey topping\n" +
                "Combine the cornflour with 1½ cups of water in a deep bowl, mix well and keep aside.\n" +
                "Heat the oil in a deep non-stick pan, add the onions and sauté on a medium flame for 1 minute.\n" +
                "Add the capsicum, carrot and cabbage and sauté on a medium flame for 2 to 3 minutes.\n" +
                "Add the boiled hakka noodles and sauté on a medium flame for 1 minute.\n" +
                "Add the tomato ketchup and chilli sauce, mix well and cook on a medium flame for 1 minute, while stirring occasionally.\n" +
                "Add the cornflour-water mixture, vinegar, sugar and salt, mix well and cook on a medium flame for 3 to 4 minutes or till the sauce thickens, while stirring occasionally.\n" +
                "Divide it into 2 equal portions and keep aside.\n" +
                "\n" +
                "How to proceed\n" +
                "Just before serving, place one portion of the crispy noodles on a serving dish and top it with one portion of the chopsuey evenly over it.\n" +
                "Repeat step 1 to make 1 more plate.\n" +
                "Serve immediately.");
        values.put("img", R.drawable.americanchop);
        db.insert("nonjainstarters", "_id", values);

        values.put("_id", "1");
        values.put("name", "Chicken Lollipop");
        values.put("ingredient",
                "Chicken Lollypops (Wings deskinned) - 500 gms.\n" +
                        " \n" +
                        "For Marination\n" +
                        "cornflour - 2 tblsp. \n" +
                        "soya sauce - 2 tblsp. \n" +
                        "vinegar - 1 tsp \n" +
                        "Red chilli paste - 1 tsp. \n" +
                        "Ginger paste - 2 tsp. \n" +
                        "Garlic paste - 1 tsp. \n" +
                        "Ajinomoto - ¼ tsp. \n" +
                        "salt - to taste\n" +
                        " \n" +
                        "For Batter \n" +
                        "Maida - 6 tblsp. \n" +
                        "Cornflour - 6 tblsp. \n" +
                        "Coriander - 1 tblsp. \n" +
                        "Garlic - 1 tblsp.\n" +
                        "Ginger -  1 tblsp. \n" +
                        "Vinegar - 1 tblsp. \n" +
                        "Red chilli paste - 1 tblsp. \n" +
                        "Egg - 1\n" +
                        "Ajinomoto - 1/8 tsp. \n" +
                        "Orange red color - 1/8 tsp. \n" +
                        "Celery - 1 tsp. \n" +
                        "salt - to taste\n" +
                        "water - as required\n");
        values.put("method","1. First, dry out the chicken pieces on a muslin cloth to remove out excess water. 2. Marinate the chicken with all the ingredients under 'for marination' for atleast 2 hours.\n" +
                "3. Mix all the ingredients under \"for batter\" with enough water to make a thick batter.\n" +
                "4. Dip the lollypops in batter and deep fry.\n" +
                "5. Serve as a starter with Schezuan sauce.\n" +
                " \n" +
                "Tip\n" +
                "    Keep the lollypops inverted in the frying pan to get a rounded shape.");
        values.put("img", R.drawable.chickenlollipop);
        db.insert("nonvegstarters", "_id", values);

        values.put("_id", "2");
        values.put("name", "Nutty Chicken");
        values.put("ingredient",
                "Boneless Chicken - 1 lb\n" +
                        "Oil - 2 tbsp\n" +
                        "Eggs - 2\n" +
                        "Salt - to taste\n" +
                        "Nuts - 1/2 Cup ( crushed/ground) almond, cashew nut, walnut etc..\n" +
                        "\n" +
                        "For Marination\n" +
                        "Turmeric Powder - 1 tsp\n" +
                        "Ginger-Garlic Paste - 2 tsp\n" +
                        "Lemon Juice - 2 tsp\n" +
                        "Garam Masala Powder / Chicken masala - 1/4 tsp\n" +
                        "Oil - 2 tbsp\n" +
                        "Chilly Powder - 2 tsp\n" +
                        "Salt - to taste");
        values.put("method","Wash the chicken and cut into a thin layer 1 inch thick.\n" +
                "Combine the chicken with marinade ingredients to coat all the sides and keep it in fridge for at least 1 hour. Even overnight marination will be good.\n" +
                "Beat the eggs with a pinch of salt.\n" +
                "Roll the chicken in the egg mixture and coat it with the nuts. Any nuts like almond, cashew nut, walnut etc can be used.\n" +
                "Fry the chicken in oil or bake it. For baking, preheat the oven to 300 degrees Fahrenheit and bake the chicken pieces for approximately 20-25 minutes.\n" +
                "Garnish with parsley and lemon slices.\n" +
                "Serving Suggestion\n" +
                "Serve the warm nutty chicken as an entree along with some french fries and steamed vegetables as sides and orange juice");
        values.put("img", R.drawable.nuttychicken);
        db.insert("nonvegstarters", "_id", values);

        values.put("_id", "3");
        values.put("name", "Chicken Rollup");
        values.put("ingredient",
                "Chicken/ Turkey breast - 1\n" +
                        "Spinach - 1/2 cup\n" +
                        "Green chillie - 1\n" +
                        "Chilly powder - 1/2 tsp\n" +
                        "Coriander powder - 1/2 tsp\n" +
                        "Cumin powder - 1/4 tsp\n" +
                        "Garam masala - a pinch\n" +
                        "Turmeric powder - a pinch\n" +
                        "Ginger garlic paste - 1 tsp\n" +
                        "Cumin powder - 1/4 tsp\n" +
                        "Salt - to taste\n" +
                        "Lemon juice - 2tsp\n" +
                        "Yogurt - 2 tbsp");
        values.put("method","Wash the chicken/turkey breast and slice it into thin layers about 1 inch thick.\n" +
                "Mix all the spices (garam masala, chilly powder, ginger garlic paste, coriander powder, cumin powder, turmeric powder and salt) with yogurt and add the lemon juice to it.\n" +
                "Apply the marinade on the chicken/turkey layers and let it rest in the refrigerator for at least half and hour. Overnight marination would be excellent.\n" +
                "While the chicken/turkey rests, heat some oil in a pan. Temper some cumin seeds.\n" +
                "Add the green chillies and spinach with little salt. Let it cook for few minutes until the spinach wilts.Switch off and let it cool.\n" +
                "Once it is cool enough, grind it into a coarse paste.\n" +
                "Spread this spinach chutney on the chicken/turkey layers. \n" +
                "\n" +
                "Roll the chicken/turkey as shown in the picture. Use toothpicks to hold the chicken in place. \n" +
                "\n" +
                "Fry the rolls in oil or bake it in an oven preheated to 300 degrees for 20 minutes or until done.\n" +
                "Remove the toothpicks and serve. Few drops of lemon juice can be added at the end.\n" +
                "Serving Suggestion\n" +
                "Serve the warm chicken roll ups with some ketchup or hot sauce.");
        values.put("img", R.drawable.chickenrollup);
        db.insert("nonvegstarters", "_id", values);

        values.put("_id", "4");
        values.put("name", "Chicken Sukha");
        values.put("ingredient",
                "Chicken - 1 lb (1/2 kg)\n" +
                        "Onion - 1/2 ( diced in medium sized pieces)\n" +
                        "Red Chilly powder - 1 tsp\n" +
                        "Black Pepper powder - 1 tsp\n" +
                        "Coriander/dhania powder - 2 tsp\n" +
                        "Turmeric powder - ¼ tsp\n" +
                        "Garam masala powder -¼ tsp\n" +
                        "Yogurt(curd) -2 tsp\n" +
                        "Ginger garlic paste -1 tsp\n" +
                        "Salt - to taste\n" +
                        "Oil - 2 tsp\n" +
                        "Coriander leaves - (for garnishing)");
        values.put("method","1. Wash and cut chicken in small pieces.\n" +
                "2. Take a bowl mix chilly powder, pepper powder, coriander powder, turmeric powder, salt, garam masala, ginger garlic paste, yogurt and form a paste. Add the chicken pieces to this and rub at the masala on the chicken. Let this marinate for at least an hour in the refrigerator.\n" +
                "3. Now heat oil in a kadai and saute the chicken. Cover and cook it for 7 minutes or until it is thoroughly cooked.\n" +
                "4.Open the lid and fry on medium high flame for about 6 minutes or until all the water evaporates.\n" +
                "5. Add onions and fry for 2 more minutes.\n" +
                "6. Garnish with coriander leaves, split chillies and lemon or tomato slices .\n" +
                "\n" +
                "Tips\n" +
                "- This can be served with biriyani, curd rice, chapatti.\n" +
                "- The juice of one lemon can be poured on top to enhance flavour. ");
        values.put("img", R.drawable.chickenshuka);
        db.insert("nonvegstarters", "_id", values);
        values.put("_id", "5");
        values.put("name", "Kerala Roast Chicken");
        values.put("ingredient",
                "Whole Chicken - 1/2 kg (or 1 lb cut into 15-20 pieces with bones in)\n" +
                        "Oil (about 200 ml) - for deep frying\n" +
                        "For Spice Mix\n" +
                        "Ginger Garlic Paste - 1 tbsp\n" +
                        "Red Chili Powder - 2 tsp\n" +
                        "Paprika (or Kashmiri chili powder) - 1 tbsp (This is optional but gives a nice color without increasing the spice)\n" +
                        "Pepper Powder - 1 tsp\n" +
                        "Turmeric Powder - 1/4 tsp\n" +
                        "Fennel Powder - 1 tsp (or use Garam Masala)\n" +
                        "Lemon Juice - 1 tbsp\n" +
                        "Rice flour (or Corn flour) - 1 tbsp\n" +
                        "Salt - as needed\n" +
                        "Curry Leaves - 2-3 springs (keep the leaves whole or tear it with hands)");
        values.put("method","Cut the chicken into medium sized pieces and wash it nicely. Traditionally this is made with bone in chicken pieces. You can however make it with boneless chicken too. \n" +
                "\n" +
                "Mix the chicken with all the ingredients in the spice mix - red chili powder, kashmiri chili powder, pepper powder, fennel powder, turmeric powder and salt. You can also mix all the spices in a separate bowl  and then rub it onto the chicken pieces. I haven't added Kashmiri chili powder or paprika here. \n" +
                " \n" +
                "Finally mix in the rice flour, lemon juice and fresh curry leaves. Let this rest and marinate for at least half an hour. Overnight marination will be good. \n" +
                "\n" +
                "When you are ready to fry, heat oil in a kadai on high heat. Once the oil is hot enough, you are ready to fry. You can feel the oil has become hot if you place your palm at a safe distance over the kadai. It should not get smoking hot because then the chicken pieces will not get cooked.  \n" +
                "\n" +
                "Reduce the flame to medium and gently add a few pieces (6-8 depending on the size of the pan) of the marinated chicken in the hot oil.  \n" +
                "\n" +
                "Fry for about 6-8 minutes till all the sides are uniformly golden brown. Deep fry the chicken pieces in batches until it is completely cooked. \n" +
                "\n" +
                "Remove the pieces from the hot oil using a slotted spoon and drain the excess oil in paper towel. The curry leaves will get fried along with the chicken pieces which adds a nice flavor as well as gives a pretty presentation. Sometimes I like to fry some extra curry leaves and garnish using that. In my house, everyone enjoy the crispy fried curry leaves as much as the crispy chicken pieces. \n" +
                "\n" +
                "Variation\n" +
                "As I mentioned before, these days people prefer shallow frying rather than deep frying. For this, take a wide frying pan and add few tbsp (3-4) of oil. Arrange the chicken pieces in a single row so that each piece touches the bottom of the pan. Fry for about 10 minutes till one side is browned. Carefully flip the pieces using a spatula and fry for another 5-7 minutes. Serve it.\n" +
                "\n" +
                "Serving Chicken Fry\n" +
                "Serve this crispy Kerala chicken roast with biryani, pulao, ghee rice, fried rice, any variety rice or white rice and some curry.\n" +
                "It can also be served as an appetizer.");
        values.put("img", R.drawable.chickenroast);
        db.insert("nonvegstarters", "_id", values);

        values.put("_id", "1");
        values.put("name", "Achari Paneer");
        values.put("ingredient",
                "1 cup paneer (cottagte cheese) cubes\n" +
                        "1 tsp fennel seeds (saunf)\n" +
                        "1/4 tsp mustard seeds ( rai / sarson)\n" +
                        "5 to 6 fenugreek (methi) seeds\n" +
                        "1 tsp nigella seeds (kalonji)\n" +
                        "1/2 tsp cumin seeds (jeera)\n" +
                        "1/2 tsp asafoetida (hing)\n" +
                        "1/2 cup thinly sliced onions\n" +
                        "1/2 tsp turmeric powder (haldi)\n" +
                        "1/2 tsp chilli powder\n" +
                        "1/2 tsp black salt (sanchal)\n" +
                        "3/4 cup fresh curds (dahi)\n" +
                        "1 tsp plain flour (maida)\n" +
                        "3 tbsp chopped coriander (dhania)\n" +
                        "1 tbsp oil\n" +
                        "salt to taste");
        values.put("method","Mix the fennel seeds, mustard seeds, fenugreek seeds, nigella seeds, cumin seeds and asafoetida in a small bowl.\n" +
                "Heat the oil and add the seed mixture.\n" +
                "When they crackle, add the onion and saute till it turns translucent.\n" +
                "Add the paneer, turmeric, chilli powder, black salt and stir for some time.\n" +
                "Add the curds, sprinkle the plain flour and mix well.\n" +
                "Add the coriander and salt and bring to a boil.\n" +
                "Serve hot with rice or rotis.\n" +
                "\n" +
                "Handy tip:\n" +
                "If it is sour, add 1 tsp of milk and serve.");
        values.put("img", R.drawable.aacharipaneer);
        db.insert("vegmain", "_id", values);

        values.put("_id", "2");
        values.put("name", "5 Treasure Vegetables");
        values.put("ingredient",
                "1 cup par boiled and diagonally cut baby corn\n" +
                        "1/2 cup par boiled mushroom slices\n" +
                        "1 cup par boiled broccoli florets\n" +
                        "1/2 cup par boiled asparagus cut into 1\" sticks\n" +
                        "1 cup bean sprouts\n" +
                        "3 tbsp oil\n" +
                        "1 tbsp finely chopped garlic (lehsun)\n" +
                        "2 tsp finely chopped ginger (adrak)\n" +
                        "2 tsp finely chopped green chillies\n" +
                        "1/2 cup finely chopped onions\n" +
                        "salt to taste\n" +
                        "\n" +
                        "To Be Mixed Into A Sauce\n" +
                        "1 tsp soy sauce\n" +
                        "2 tsp cornflour\n" +
                        "1/2 cup water\n" +
                        "4 tsp hoisin sauce\n" +
                        "1/2 tsp sugar");
        values.put("method","Heat the oil in a wok or kadhai, add the garlic, ginger and green chillies and sauté for a few seconds.\n" +
                "Add the onions and sauté on a high flame for 1 to 2 minutes.\n" +
                "Add the baby corn, mushrooms, broccoli, asparagus and bean sprouts, mix well and cook on a high flame for 2 to 3 minutes, while stirring occasionally.\n" +
                "Add the prepared sauce and salt, mix well and cook on a medium flame for 2 minute, while stirring occasionally.\n" +
                "Serve immediately.");
        values.put("img", R.drawable.fivetreasure);
        db.insert("vegmain", "_id", values);

        values.put("_id", "3");
        values.put("name", "8 Treasure Vegetables");
        values.put("ingredient",
                "1/2 cup snow peas , cut into 2 vertically\n" +
                        "1/2 cup baby corn , cut into 2 vertically\n" +
                        "1/4 cup dried shitake mushrooms , soaked\n" +
                        "1/4 cup fresh mushrooms (khumbh) , chopped\n" +
                        "1/2 cup carrot juliennes\n" +
                        "1/2 cup broccoli florets\n" +
                        "1/2 cup asparagus , cut into 50 mm. (2 \") pieces\n" +
                        "1/2 cup bean sprouts\n" +
                        "1/4 cup chopped onions\n" +
                        "1 1/2 tsp finely chopped garlic (lehsun)\n" +
                        "1 1/2 tsp oil\n" +
                        "salt to taste\n" +
                        "\n" +
                        "To Be Mixed Into A Sauce\n" +
                        "1/2 tsp soy sauce\n" +
                        "1/2 tsp sesame (til) oil\n" +
                        "1/4 cup water\n" +
                        "1 1/2 tsp cornflour\n" +
                        "1 tsp hoisin sauce");
        values.put("method","Parboil the snow peas, baby corn, fresh mushrooms, carrots, broccoli and asparagus till they are tender.\n" +
                "Drain and immerse them in cold water to refresh them. Drain again and keep aside.\n" +
                "Heat the oil in another pan and add the onions and garlic and sauté for 1 to 2 minutes.\n" +
                "Add the soaked black mushrooms, bean sprouts and sauté for another minute.\n" +
                "Add the parboiled vegetables and salt and stir fry over a high flame for a few minutes.\n" +
                "Add the sauce mixture and bring to a boil, stirring continuously.\n" +
                "Serve immediately.\n" +
                "Tips\n" +
                "To use dried black mushrooms (shitake), you have to soak them in water for at least half an hour.\n" +
                "When soaked well, the mushrooms become soft. Discard the stalks and use the mushrooms as required.\n" +
                "They are available at few grocery stores and vegetables vendors.\n");
        values.put("img", R.drawable.eighttreasure);
        db.insert("vegmain", "_id", values);

        values.put("_id", "4");
        values.put("name", "Achaari Dahi Bhindi");
        values.put("ingredient",
                "4 cups sliced ladies finger (bhindi)\n" +
                        "5 tbsp oil\n" +
                        "2 tsp fennel seeds (saunf)\n" +
                        "1 tsp mustard seeds ( rai / sarson)\n" +
                        "1/2 tsp nigella seeds (kalonji)\n" +
                        "1/4 tsp fenugreek (methi) seeds\n" +
                        "1/4 tsp asafoetida (hing)\n" +
                        "2 tsp finely chopped ginger (adrak)\n" +
                        "3/4 cup chopped tomatoes\n" +
                        "salt to taste\n" +
                        "\n" +
                        "To Be Mixed Into A Curd Mixture\n" +
                        "1/2 cup whisked curds (dahi)\n" +
                        "1 tsp chilli powder\n" +
                        "1/4 tsp turmeric powder (haldi)\n" +
                        "2 tsp coriander-cumin seeds (dhania-jeera) powder\n" +
                        "salt to taste\n" +
                        "\n" +
                        "For Serving\n" +
                        "roti\n" +
                        "paratha");
        values.put("method","Heat 4 tbsp of oil in a broad non-stick pan, add the ladies finger and cook on a medium flame for 5 to 6 minutes, while tossing occasionally. Remove in a deep bowl and keep aside.\n" +
                "\n" +
                "Heat the remaining 1 tbsp of oil in the same broad non-stick pan, add the fennel seeds, mustard seeds, nigella seeds, fenugreek seeds and asafoetida and sauté on a medium flame for a few seconds.\n" +
                "\n" +
                "Add the ginger and sauté on a medium flame for 30 more seconds.\n" +
                "\n" +
                "Add the tomatoes, mix well and cook on a medium flame for 2 to 3 minutes, while stirring occasionally.\n" +
                "\n" +
                "Lower the flame, add the curds mixture, mix well and cook on a medium flame for 1 minute, while stirring continuously.\n" +
                "\n" +
                "Add the shallow-fried ladies finger and salt, mix well and cook on a medium flame for 1 to 2 minutes, while stirring occasionally.\n" +
                "\n" +
                "Serve hot.");
        values.put("img", R.drawable.aacharidahi);
        db.insert("vegmain", "_id", values);

        values.put("_id", "5");
        values.put("name", "Achaari Baingani");
        values.put("ingredient",
                "To Be Mixed Into A Marinade\n" +
                        "1 tbsp ginger-garlic (adrak-lehsun) paste\n" +
                        "1 tsp chilli powder\n" +
                        "1/2 tsp turmeric powder (haldi)\n" +
                        "salt to taste\n" +
                        "1 tsp oil\n" +
                        "\n" +
                        "Other Ingredients\n" +
                        "2 cups brinjals (baingan / eggplant) , cut into 1\" cubes\n" +
                        "oil for deep frying\n" +
                        "1 tsp fennel seeds (saunf)\n" +
                        "1 tsp mustard seeds ( rai / sarson)\n" +
                        "1 tsp fenugreek (methi) seeds\n" +
                        "1 tsp nigella seeds (kalonji)\n" +
                        "1/2 tsp cumin seeds (jeera)\n" +
                        "1/2 tsp asafoetida (hing)\n" +
                        "2 tbsp oil\n" +
                        "1/2 cup sliced onions\n" +
                        "1 tsp ginger-garlic (adrak-lehsun) paste\n" +
                        "1 tsp chopped green chillies\n" +
                        "1/2 tsp turmeric powder (haldi)\n" +
                        "1/2 tsp chilli powder\n" +
                        "1/2 tsp punjabi garam masala\n" +
                        "1/2 tsp dried mango powder (amchur)\n" +
                        "salt to taste\n" +
                        "3/4 cup whisked curds (dahi)\n" +
                        "1/2 cup fresh cream\n" +
                        "\n" +
                        "For The Garnish\n" +
                        "2 tbsp finely chopped coriander (dhania)");
        values.put("method","Combine the brinjals with the prepared marinade in a deep bowl and toss gently. Keep aside for 5 minutes.\n" +
                "Heat the oil in a kadhai and deep-fry the marinade brinjals in it till they are golden brown in colour from all the sides.\n" +
                "Drain on an absorbent paper and keep aside.\n" +
                "Combine the fennel seeds, mustard seeds, fenugreek seeds, onion seeds, cumin seeds and asafoetida in a small bowl and keep aside.\n" +
                "Heat the oil in a deep pan and add the above mixture.\n" +
                "When the seeds crackle, add the onions, ginger-garlic paste and green chillies and sauté on a medium flame for 2 minutes.\n" +
                "Add the turmeric powder, chilli powder, punjabi garam masala, dry mango powder and salt and sauté on a medium flame for 2 minutes.\n" +
                "Add the curds, fried brinjals and fresh cream, mix gently and cook on a slow flame for 2 to 3 minutes, while stirring continuously.\n" +
                "Serve hot garnished with coriander.\n");
        values.put("img", R.drawable.aacharibaingan);
        db.insert("vegmain", "_id", values);

        values.put("_id", "1");
        values.put("name", "Chicken Curry");
        values.put("ingredient",
                "Ingredients for Marinade\n" +
                        "1 chicken, skin removed and cut up into 8-10 pieces\n" +
                        "1/2 cup plain yoghurt\n" +
                        "1 tbsp tomato paste/puree\n" +
                        "1 tsp garlic paste\n" +
                        "1 tsp ginger paste\n" +
                        "1 tsp salt\n" +
                        "1 tsp red chilli powder (optional for some heat)\n" +
                        "1/2 tsp cumin powder\n" +
                        "1/2 tsp coriander powder\n" +
                        "1/4 tsp turmeric powder\n" +
                        "Other Ingredients\n" +
                        "1/4 cup egetable oil\n" +
                        "1 tsp cumin seeds\n" +
                        "1 cinnamon stick\n" +
                        "1 cardamom\n" +
                        "2 cloves\n" +
                        "4 whole black pepper\n" +
                        "1 tsp fresh fenugreek leaves/methi (optional)\n" +
                        "4 medium onions, finely chopped or grated\n" +
                        "4 medium tomatoes, grated\n" +
                        "3 medium potatoes, peeled and cut into chunks\n" +
                        "1 heaped tbsp tomato paste/puree\n" +
                        "1/2 tsp ginger paste\n" +
                        "1/2 tsp garlic paste\n" +
                        "1-2 green chillies, chopped\n" +
                        "1 tsp cumin powder\n" +
                        "1 tsp coriander powder\n" +
                        "1/2 tsp turmeric powder\n" +
                        "1 tsp garam masala\n" +
                        "salt, to taste\n" +
                        "fresh coriander, for garnishing");
        values.put("method","Combine the marinade ingredients together in a bowl, then add the chicken and mix well. Cover and refrigerate for at least 2 hours, preferably overnight. Make sure to remove the chicken from the fridge at least half an hour before you begin to cook so that it comes to room temperature.\n" +
                "Heat the oil in a pan, add the cumin seeds, cinnamon stick, cardamom, cloves and whole black pepper. Allow them to splutter, then add the fenugreek leaves if you are using them. Next add the onions and fry until a deep golden. Then add the chopped chilli, ginger and garlic pastes. Stir them in until fragrant. Add in the tomato paste, cumin powder, coriander powder and turmeric powder, stir them in for a couple of minutes. Then add the grated tomatoes and cook them down until they dry up slightly. Now add in the chicken pieces and the marinade. Stir over high heat for about 3-4 minutes. Then add 2 cups of water, turn the heat down and cover the pan. Let the curry simmer gently for about 20 minutes, giving it an occasional stir.\n" +
                "In the meantime, put the potato chunks in another pan and cover with water. Add a sprinkle of salt and a pinch of turmeric. The turmeric helps to give the potato chunks a slight yellow tinge. Bring to the boil and simmer gently for about 5-8 minutes or until tender. You can check by piercing a potato chunk with the tip of a knife, it should go in easily. Drain and set aside. \n" +
                "Once the chicken is cooked and tender, add in the boiled potato chunks and stir them in. Simmer together for another 5 minutes to infuse all the flavours into the potatoes. At this point you can either thin out the gravy by adding a bit more water, or simmer for a little longer over low heat until it thickens to your preference. Adjust salt and then sprinkle in the garam masala and chopped coriander. Turn off the heat and leave the pan covered for at least 5-10 minutes before serving.\n" +
                "This dish goes beautifully with rice, naans, chapatis, parathas or even bread.\n" +
                "Enjoy! :)\n");
        values.put("img", R.drawable.chickencurry);
        db.insert("nonvegmain", "_id", values);

        values.put("_id", "2");
        values.put("name", "Chicken Koroga");
        values.put("ingredient",
                "1 chicken, cut up into 8-10 pieces\n" +
                        "(preferably without skin)\n" +
                        "1/4 cup oil\n" +
                        "2 tbsp butter\n" +
                        "2 onions, chopped\n" +
                        "2 cups chopped tomatoes\n" +
                        "1/2 tbsp garlic paste\n" +
                        "1/2 tbsp ginger paste\n" +
                        "2 green chillies, chopped\n" +
                        "1 tsp spice of your choice\n" +
                        "(cumin or coriander or curry powder)\n" +
                        "salt, as needed\n" +
                        "500g potatoes, peeled and cubed\n" +
                        "water, as needed\n" +
                        "some chopped fresh coriander for garnishing");
        values.put("method","Heat the oil and butter, then add the onions and fry until golden brown. Next add the ginger and garlic. Stir them in until fragrant. Next add the chopped tomatoes and green chillies and cook on low heat, stirring regularly until the mixture is thick and mushy.\n" +
                "Next add the chicken pieces and sprinkle on whichever powdered spice (cumin, coriander or curry powder) you like and some salt. Stir everything together on high heat until the chicken turns white and its' surface gets sealed. Add a cup of water, turn the heat down, cover the pan and allow the chicken to simmer very gently for 30 minutes. You can occasionally uncover and give everything a stir.\n" +
                "Then add the cubes of potatoes and some water as needed. Stir and cover again, maintain the heat on low.  Allow the potatoes to cook until completely tender. Taste and adjust for salt, then turn off the heat and sprinkle some chopped coriander. Serve with accompaniments of your choice.\n" +
                "Enjoy!");
        values.put("img", R.drawable.chickenkoroga);
        db.insert("nonvegmain", "_id", values);

        values.put("_id", "3");
        values.put("name", "Balti Chicken");
        values.put("ingredient",
                "Ingredients for Chicken Marinade\n" +
                        "500 gm boneless chicken breast, cut into chunks\n" +
                        "2 tbsp yoghurt\n" +
                        "1/2 tsp salt\n" +
                        "1/2 tsp  black pepper\n" +
                        "1/2 tsp ginger paste\n" +
                        "1/2 tsp garlic paste\n" +
                        "1 tsp paprika powder\n" +
                        "Ingredients\n" +
                        "4 tbsp oil\n" +
                        "2 medium onions, finely chopped\n" +
                        "1 green capsicum, cut into chunks\n" +
                        "1 red capsicum, cut into chunks\n" +
                        "1 tsp ginger paste\n" +
                        "1 tsp garlic paste\n" +
                        "2 green chillies, chopped\n" +
                        "1 cinnamon stick\n" +
                        "1 bay leaf\n" +
                        "1/2 tsp cumin seeds\n" +
                        "1 tsp cumin powder\n" +
                        "1 tsp coriander powder\n" +
                        "1/2 tsp turmeric powder\n" +
                        "1/2 tsp red chilli powder\n" +
                        "1 tsp garam masala\n" +
                        "2 medium tomatoes, grated (skin discarded)\n" +
                        "1-2 tbsp tomato sauce (ketchup)\n" +
                        "1/4 cup yoghurt\n" +
                        "1/4 cup coconut milk (or fresh cream)\n" +
                        "1 tbsp tomato paste/puree \n" +
                        "juice of half a lime\n" +
                        "salt to taste\n" +
                        "chopped fresh coriander");
        values.put("method","First, marinate the chicken cubes in the Chicken Marinade ingredients for at least 2 hours or up to overnight. Make sure to remove the chicken from the fridge at least half an hour before cooking to ensure it comes to room temperature.\n" +
                "In a small bowl, whisk together the yoghurt and grated tomatoes with a fork. Set aside.\n" +
                "Heat 1 tbsp of oil in a pan and add half the chicken cubes. Fry over high heat for about 2 minutes per side or until brown (do not overcrowd the pan and do not stir the chicken around too much). Remove onto a plate, then repeat with the second batch of chicken. At this point we are not fully cooking the chicken, just getting a nice brown coating to seal in the juices. Keep the chicken covered.\n" +
                "In the same pan, add another small drizzle of oil if needed, then add the capsicum chunks. On high heat, cook them for a couple of minutes to get a slight char on them. Again, we are not looking to cook them through until they are soft, just to build up flavour. Take them out onto a plate. Set aside.\n" +
                "Now add the remaining oil in the same pan and heat it up. Add the cumin seeds, bay leaf and cinnamon stick. Then add the chopped onions and fry until golden brown. Follow with the ginger and garlic pastes, cook them for a few seconds and add the tomato paste/puree, chopped green chillies and the powdered spices EXCEPT the garam masala. Cook for a couple of minutes on low heat. Then add the yoghurt and grated tomatoes mixture. Cook this until the mixture is thick, season with some salt.\n" +
                "Once the oil begins to get released from the sides, add in the half-cooked chicken plus any juices that have come out of the chicken. Stir well until they are coated with the tomatoe mixture, then add the ketchup (it helps cut down any acidity from the fresh tomatoes) and about half a cup of water or a bit more if you want some extra sauce. Cover and simmer on very low heat for 10 minutes. Uncover and stir in the capsicum. Next add the coconut milk and mix it in. Simmer again for another 5 minutes on low heat giving a gentle stir every now and then. Taste and adjust the salt and spice if needed. If you want the capsicum chunks softer, just simmer it a bit longer on very low heat until they are done to your liking.\n" +
                "Finally, sprinkle the garam masala and squeeze in the lime juice. Mix and turn off the heat. Garnish with fresh coriander and serve with buttered naan and simple boiled rice.\n" +
                "Enjoy!");
        values.put("img", R.drawable.baltichicken);
        db.insert("nonvegmain", "_id", values);

        values.put("_id", "4");
        values.put("name", "Red Chicken Qorma");
        values.put("ingredient",
                "Ingredients for Chicken Marinade\n" +
                        "1 chicken, skinless, cut up into 8-10 pieces (1-1.5 kg)\n" +
                        "2 tbsp thick yoghurt\n" +
                        "1 tsp salt\n" +
                        "1 tsp ginger paste\n" +
                        "1 tsp garlic paste\n" +
                        "1/4 tsp turmeric powder\n" +
                        "pinch of saffron or orange food colouring\n" +
                        "Whole spices\n" +
                        "1 bay leaf\n" +
                        "1/2 tsp cumin seeds\n" +
                        "5 whole black pepper\n" +
                        "2 green cardamom\n" +
                        "2 cloves\n" +
                        "1 cinnamon stick\n" +
                        "Other Ingredients\n" +
                        "3 medium onions, finely sliced\n" +
                        "1/2 cup oil\n" +
                        "1/2 tbsp ginger paste\n" +
                        "1/2 tbsp garlic paste\n" +
                        "1/2 cup thick yoghurt\n" +
                        "1 tbsp tomato paste/puree (optional)\n" +
                        "1/4 tsp turmeric powder\n" +
                        "1 tsp cumin powder\n" +
                        "1 tsp coriander powder\n" +
                        "1 tsp red chilli powder\n" +
                        "1 chilli, chopped finely\n" +
                        "pinch of nutmeg powder\n" +
                        "1/2 tsp garam masala\n" +
                        "10 almonds, peeled and crushed with some water to a paste\n" +
                        "pinch of orange colour (optional)\n" +
                        "some drops of kewra essence (optional)\n" +
                        "chopped fresh coriander for garnishing");
        values.put("method","HERE is the White Chicken Qorma recipe.\n" +
                "Heat the oil in a pan and fry the sliced onions until golden. Remove about three quarters of the fried onions, drain and crush them then set aside leaving the rest of the fried onions in the pan. Add all the whole spices in the pan, then add the marinated chicken, chopped chilli, ginger and garlic pastes. Fry on high heat for a few minutes to seal the chicken. At this point add the turmeric powder, cumin powder, coriander powder, chilli powder and nutmeg powder.\n" +
                "In the meantime, take a bowl and add the yoghurt, crushed fried onions, tomato paste/puree and a pinch of orange food colouring. Mix well with a fork. I add the tomato paste because it gives a good texture to the gravy and adds to the vivid colour, but this entirely optional, you can leave it out.\n" +
                "Once the chicken begins to take colour, turn the heat down to medium and add this yoghurt mixture into the pan. Cook while stirring regularly until some oil begins to get released from the sides and the yoghurt mixture is incorporated. then add about half a cup of water plus the almond paste, mix well and then cover the pan and turn the heat down to low. Allow the chicken to simmer gently for about 10-15 minutes giving an occasional stir until cooked through. For a thinner gravy, add some warm water.\n" +
                "Finally sprinkle the garam masala and add the kewra essence if you are using it. Sprinkle the chopped coriander and serve your delicious curry with rice and chapatis/parathas or naans.\n" +
                "Enjoy! :)");
        values.put("img", R.drawable.chickenqorma);
        db.insert("nonvegmain", "_id", values);

        values.put("_id", "5");
        values.put("name", "Achari Chicken");
        values.put("ingredient",
                        "Ingredients for Chicken Marinade\n" +
                        "500gm boneless chicken breast, cut into cubes\n" +
                        "(this recipe can also be made using one whole skinless chicken (cut into 10 pieces) in place of the boneless chunks)\n" +
                        "1/4 tsp salt\n" +
                        "1/4 tsp ginger paste\n" +
                        "1/4 tsp garlic paste\n" +
                        "1/4 tsp turmeric powder\n" +
                        "1/2 tsp chilli powder\n" +
                        "1 tsp pickle oil/achaar oil (if you have a jar of mango pickle at home, otherwise use regular oil)\n" +
                        "Other Ingredients\n" +
                        "2 onions, chopped\n" +
                        "4 tbsp oil\n" +
                        "1 tbsp tomato paste/puree\n" +
                        "4 fresh tomatoes, chopped or grated\n" +
                        "1 tsp freshly grated ginger\n" +
                        "1/2 tsp garlic paste\n" +
                        "2 tbsp fresh yoghurt\n" +
                        "1 tsp salt (or to taste)\n" +
                        "1/2 tsp red chilli powder\n" +
                        "1/4 tsp turmeric powder\n" +
                        "2-3 green chillies, slit\n" +
                        "1/2 tsp mustard seeds\n" +
                        "1 tsp whole cumin seeds\n" +
                        "1 tsp coriander seeds\n" +
                        "1/2 tsp fennel seeds\n" +
                        "1/2 tsp split fenugreek seeds\n" +
                        "10 curry leaves/limro, chopped\n" +
                        "juice of 1/2 a lemon/lime\n" +
                        "1 heaped tbsp pickle/achaar (if you have a jar of mango pickle at home, otherwise omit)");
        values.put("method","Marinate the chicken cubes in the chicken marinade ingredients for at least 30 minutes or up to overnight. \n" +
                "Mix the cumin, coriander, fennel and split fenugreek seeds, roast them in a dry pan for a minute or two until they are aromatic, then crush them to a rough powder.\n" +
                "Drizzle some of the oil in a pan, when hot fry the chicken pieces in batches over high heat just to seal the chicken and keep it moist. Do not be tempted to over crowd the pan as that will drop the temperature of the oil and the chicken will release a lot of moisture. Keep the heat high and stir fry the chicken in two batches for about 3 minutes per batch, then remove the cubes into a bowl, cover and set aside. Bear in mind that the chicken will be cooked further in the gravy.\n" +
                "In the same pan, add the rest of the oil then add the mustard seeds. When they begin to splutter, add the chopped limro/curry leaves followed by the chopped onions. Fry on medium heat until the onions are golden. Then add the ginger and garlic pastes. Stir them in for a few seconds, then add the tomatoes and tomato paste, crushed roasted spices, salt and red chilli powder. Cook until the tomatoes are thick and oil begins to get released from the sides. Then whip the yoghurt and add it in, give it a mix to combine. \n" +
                "Add the chicken pieces and the slit green chillies, give them a stir then cover and turn down the heat. Simmer for about 15 minutes on low heat or until the chicken pieces are tender and cooked. Squeeze in the lemon juice and add in the tablespoon of achaar (if you have it). This will enhance the flavour of the chicken even further but you can leave it out if you do not have pickle. Stir and taste, adjust seasoning if needed. Turn off the heat and allow the dish to sit for about 15 minutes before serving to ensure all the flavours are infused into the chicken. Serve with rice or parathas/chapatis.\n" +
                "Enjoy! :)");
        values.put("img", R.drawable.acharichicken);
        db.insert("nonvegmain", "_id", values);

        values.put("_id", "1");
        values.put("name", "Egg Biryani");
        values.put("ingredient",
                "For Rice\n" +
                        "Basmati Rice - 3 cups (1 cup = 235 ml) (little more than half a kg of rice)\n" +
                        "Saffron - a pinch (soaked in 2 tbsp of milk)\n" +
                        "Whole Garam Masala - (2\" cinnamon stick, 4 cloves, 3 cardamom, 1 Bay Leaf, 1 star anise, 1 bay leaf)\n" +
                        "Shahi Jeera - 1 tsp (or use Fennel seeds)\n" +
                        "Oil - 1 tbsp\n" +
                        "Salt - as needed\n" +
                        "Water - about 12 cups (1 cup = 235 ml)\n" +
                        "Mint Leaves - handful \n" +
                        "Ghee - 1 tbsp\n" +
                        "Fried Onion (Birista) - 1/4 cup\n" +
                        "For Cooking Eggs\n" +
                        "Eggs - 4 (for making  Hard Boiled eggs)\n" +
                        "Eggs - 5 (for making scrambled eggs)\n" +
                        "Oil - 2 tbsp\n" +
                        "Salt - as needed\n" +
                        "Pepper powder - as needed\n" +
                        "Corn flour - 1 tbsp\n" +
                        "Garam Masala / Biryani Masala - 1 tsp\n" +
                        "For Masala\n" +
                        "Onion - 2 medium (chopped)\n" +
                        "Tomatoes - 2 (chopped)\n" +
                        "Ginger garlic Paste - 1 tbsp\n" +
                        "Cilantro (Coriander Leaves) - handful (finely chopped)\n" +
                        "Mint Leaves - handful (chopped)\n" +
                        "Green Chilies -  5 (chopped/slit)\n" +
                        "Yogurt (curd) - 4-5 tbsp\n" +
                        "Lemon Juice - 2 tbsp\n" +
                        "Ghee - 2 tbsp\n" +
                        "Oil - 2 tbsp\n" +
                        "Biryani Masala - 1.5 tbsp (You can also substitute with 1 tsp chili powder, 1 tsp coriander powder, 1/2 tsp cumin powder, 1 tsp garam masala and 1/4 tsp turmeric powder)\n" +
                        "Salt - as needed\n" +
                        "Preparation Steps\n" +
                        "For Preparing Eggs\n" +
                        "Hard boil 4 eggs, peel it and cut it into half lengthwise.\n" +
                        "Sprinkle a pinch of biryani masala, little salt and little corn flour (or rice flour) on the eggs and rub to coat it. Shallow fry it in a pan and keep it aside.\n" +
                        "In the same pan, scramble the remaining 5 eggs with little salt and black pepper powder and keep aside.\n" +
                        "For Cooking Rice\n" +
                        "Wash and soak the rice for about half an hour while you prepare the eggs.\n" +
                        "Take a large pot filled with plenty of water (about 12 cups) and keep it on medium heat. Once it boils, add 1 tbsp oil, shahi jeera, whole garam masala and required salt. \n" +
                        "Drain the soaked rice and add it to the boiling water. You can add a pinch of turmeric powder too if you want a bright yellow color. Cook for 5 minutes till the rice is partially cooked.\n" +
                        "When the rice is 3/4 th cooked (i.e. it has a bite to it) , drain the water and spread it on a tray to cool.\n" +
                        "For Making Masala (Spicy Gravy)\n" +
                        "Heat ghee and oil in a pan and add the onions and green chilies. Sauté till the onions turns brown.\n" +
                        "Add the ginger garlic paste and fry for a minute. Add the chopped mint leaves and cilantro (coriander leaves).\n" +
                        "Add the tomatoes and cook till it gets mashed up.\n" +
                        "Add the yogurt (curd), biryani masala and salt. Cook this till you get a nice masala and the oil separates from the masala.\n" +
                        "Add lemon juice to the masala just before switching off.");
        values.put("method","Dum Method\n" +
                "Preheat the oven to 350 degree C (180 degree F) if you plan to make dum in the oven (baking method).\n" +
                "The dum process can be done in a conventional oven or stove top. Take an aluminium tray which you can discard after one use or a roasting pan if you want to bake in the oven. If you want to do the layering in stove top, take a heavy bottomed vessel.\n" +
                "Grease the bottom of the vessel/tray with some ghee or oil.\n" +
                "Spread half of the cooked rice at the bottom. This will be the first layer. \n" +
                "\n" +
                "Pour the egg masala over the rice as the 2nd layer. \n" +
                "\n" +
                "Spread the scrambled eggs as the third layer over the masala. \n" +
                "\n" +
                "Next layer the remaining rice. Since I did not have a big pot, I had to cook the rice in 2 batches. I added turmeric powder when cooking one batch of rice and the other one I cooked plain. That's the reason the first layer has white rice and this layer has yellow rice. The final biryani will be very colorful and attractive. \n" +
                "\n" +
                "Drizzle the saffron flavored milk and 1 tbsp ghee over this. Sprinkle some fried onions, finely chopped cilantro, 1 tsp of garam masala and mint leaves on top.\n" +
                "Arrange the hard boiled eggs on the top. \n" +
                "\n" +
                "Cover with an aluminium foil and seal all sides so that the steam wont be able to escape.\n" +
                "Leave it in a 350 degree oven for half an hour. By this time the aroma of the biryani will fill the house. (If you are doing the dum on stove top, reduce the flame to the lowest setting and cook for about 20 minutes.) \n" +
                "Gently fluff up and mix the rice before serving. This way the masala and scrambled egg will be evenly distributed in the rice. \n" +
                "\n" +
                "Pressure cooker (One Pot) Method\n" +
                "If you plan to make the biryani without the dum process, you can do it in a heavy bottomed pan or in a pressure cooker. In this case, make the hard boiled eggs and scrambled eggs as above. Heat oil in the pressure cooker and make the masala as described above. Now add the exact measure of water (4.5 cups) for 3 cups of basmati rice (1:1.5 ratio) and bring to a boil. Add the soaked and drained rice to this and cook for 15 minutes on low flame. Switch off and let the pressure go down. Fluff up the rice and gently mix in the scrambled eggs, hard boiled eggs, fried onions and some more fresh mint leaves. Keep it covered for another 10 minutes for the flavors to mix in before serving.\n" +
                "Serving suggestion\n" +
                "Serve this egg biryani with some simple raita or any non-veg side-dish. It also goes well with the traditional ennai kathrikai served with biryanis.\n" +
                "This tastes delicious with some pickle and potato chips too.\n" +
                "Tips\n" +
                "You can use the same recipe to make Fish Biryani and Shrimp Biryani.");
        values.put("img", R.drawable.eggbiryani);
        db.insert("rice", "_id", values);

        values.put("_id", "2");
        values.put("name", "Chana Biryani");
        values.put("ingredient",
                "Basmati Rice - 1 cup \n" +
                        "Chickpeas (White or Black or Green) - 1/2 cup\n" +
                        "Onion - 1 \n" +
                        "Green Chillies - 2 \n" +
                        "Ginger - 1\" piece \n" +
                        "Garlic cloves - 5\n" +
                        "Tomatoes - 2 (crushed) \n" +
                        "Oil and/or ghee - 2 tbsp\n" +
                        "Whole garam masala - 1\" piece cinnamon, 2 cloves, 1 bay leaf, 1 tsp of fennel seeds) \n" +
                        "Biryani Masala (home made or any brand) - 1 tblsp (If you do not have biryani masala, add 1/4 tsp of turmeric Powder, 1 tsp red chilly powder and 1 tsp Garam masala powder)\n" +
                        "Mint leaves (Pudhina) - 1/2 cup \n" +
                        "Coriander leaves (Cilantro) - 1/2 cup (chopped)\n" +
                        "Lemon Juice - 1-2 tsp (add as needed) \n" +
                        "Salt - as needed");
        values.put("method","Wash and soak the chickpeas overnight or for at least 6 hours. You can skip the above steps by using canned chickpeas.\n" +
                "Wash and soak the basmati rice. Let the rice keep soaking while you get the other things done. \n" +
                "Coarsely grind the following ingredients in a blender or mixie - onion, green chillies, ginger, garlic, mint leaves and whole garam masala.\n" +
                "Heat the ghee in a pressure cooker. Add the above ground paste. Saute for 5 minutes. \n" +
                "Add the biryani masala and fry for a minute.\n" +
                "Next add the tomatoes and cook till the masala comes together. \n" +
                "Add 1 3/4 cups of water and bring it to a boil. To make the biryani more rich, add 3/4 cup of coconut milk and 1 cup of water instead of full water.\n" +
                "Add the soaked chickpeas, salt as needed, lemon juice and cilantro. Finally, drain the soaking rice and add to the boiling water. \n" +
                "Close the cooker, put the pressure and reduce the flame. Cook on low heat for 15 minutes and switch off. \n" +
                "Once the pressure is released, fluff the rice with a fork. Chana Biryani is ready to serve. Serve with any raita or gravies like ennai kathirikai, paneer butter masala, soya fry, egg kurma etc.\n" +
                "Serving Suggestion\n" +
                "Serve with any raita or gravies like ennai kathirikai, paneer butter masala, soya fry, egg kurma etc.");
        values.put("img", R.drawable.chanabiryani);
        db.insert("rice", "_id", values);

        values.put("_id", "3");
        values.put("name", "Malabar Prawn Biryani ");
        values.put("ingredient",
                "For Marinating\n" +
                        "Prawns (or Shrimp) – ½ kg\n" +
                        "Red Chili Powder – 1 tsp\n" +
                        "Garam Masala – ¼ tsp\n" +
                        "Turmeric Powder – ¼ tsp\n" +
                        "Lemon Juice – 1 tsp\n" +
                        "Ginger garlic paste – 1 tsp\n" +
                        "Salt – 1 tsp\n" +
                        "For Cooking Rice\n" +
                        "Basmati Rice – 2 cups\n" +
                        "Cardamom – 3\n" +
                        "Cinnamon – 2” piece\n" +
                        "Bay Leaf – 2\n" +
                        "Cloves – 5\n" +
                        "Oil – 1 tbsp\n" +
                        "Salt-totaste\n" +
                        "Fennel seeds (or cumin seeds) – 1 tsp\n" +
                        "For Masala\n" +
                        "Oil – 3-4 tbsp\n" +
                        "Ghee – 2 tbsp\n" +
                        "Onion – 2(about 1 cup sliced)\n" +
                        "Ginger Garlic Paste – 2 tbsp\n" +
                        "Tomato – 2(about 1 cup chopped)\n" +
                        "Green Chilies – 4 (finely chopped)\n" +
                        "Mint Leaves – 1/4 cup\n" +
                        "Coriander Leaves – 1/4 cup\n" +
                        "Curd – ¼ cup\n" +
                        "Lemon Juice – 1 tsp\n" +
                        "Garam Masala (or Biryani Masala)– 1 tsp\n" +
                        "Red Chili Powder – ½ tsp\n" +
                        "Black Pepper Powder – ¼ tsp\n" +
                        "Turmeric Powder – ¼ tsp\n" +
                        "For Layering\n" +
                        "Cashews – 2-3 tbsp\n" +
                        "Raisins – 2-3 tbsp\n" +
                        "Mint Leaves – ¼ cup\n" +
                        "Coriander Leaves – ¼ cup\n" +
                        "Onion – 2(about 1.5 cups sliced) \n" +
                        "Milk – 3 tbsp\n" +
                        "Saffron – few strands\n" +
                        "Garam Masala – ¼ tsp\n" +
                        "Ghee – 2 tbsp\n" +
                        "Oil – 2-3 tbsp");
        values.put("method","Marinate the prawns with salt, red chili powder, ginger garlic paste, garam masala and lemon juice for about 10 minutes. Wash and soak the rice for about 30 minutes. I usually soak the rice and get the other things done. Similarly, soak the saffron strands in some warm milk.\n" +
                "Heat a big heavy bottomed pot or a pressure cooker in which you plan to make the biryani. Add 2 tbsp of oil; first fry the cashews and raisins until golden brown. Remove  them using a slotted spoon and keep it aside.\n" +
                "In the same oil, add the marinated shrimp (prawns) and fry for about 5 minutes. Remove it and keep it aside.\n" +
                "Add another 2 tbsp. of oil and add the sliced onions. Add little salt and cook it for 30 minutes on medium flame till it gets browned. Remove the fried onions and keep it aside. We need it later for layering. You can fry the onions in a separate pan if you want to save time.\n" +
                "After removing the onions, add little ghee to the same pan. Add the ginger garlic paste and fry for a minute.\n" +
                " Add chopped tomatoes and green chilies.  Also add the chopped mint and coriander leaves. Saute till it gets mushed up.\n" +
                " Add the dry spices – red chili powder, garam masala, turmeric powder and black pepper powder. Add the curd and lemon juice. Also, add 1/3rd of the fried onions. Mix everything together and cook for 2-3 minutes till you get a nice gravy.\n" +
                "At this stage, mix in the fried prawns with this.\n" +
                "Simultaneously in another big pot, bring plenty of water to boil. Add the oil, cinnamon, cardamom, cloves, bay leaf, fennel seeds and some salt. Add the soaked rice. Cook until the rice is 3/4th cooked i.e. it should have a bite to it. Drain the rice and keep it ready for layering.\n" +
                "In the pot with the masala gravy and the prawns, spread the masala evenly around the pan. Add the cooked rice as the second layer. You can add all the rice in a single batch if you are making a small quantity. For large quantities, 2-3 layers of the masala and rice can be made.\n" +
                "After you add the rice layer, add finely chopped mint leaves, coriander leaves, fried onions, roasted cashews and raisins as the third layer. Add the saffron soaked milk on top of the rice. Also sprinkle some garam masala and add the ghee on top.\n" +
                "Cover with a tight fitting lid and leave it on the lowest heat setting for about 20 minutes.\n" +
                "Open the lid, fluff up the rice gently without breaking it. Enjoy.");
        values.put("img", R.drawable.prawnbiryani);
        db.insert("rice", "_id", values);

        values.put("_id", "4");
        values.put("name", "Chicken Biryani");
        values.put("ingredient",
                "Basmati rice - 3 cups \n" +
                        "Chicken- 1 lb (1/2 kg) (cut into small pieces)\n" +
                        "Onion -1 large/2 small ( cut lengthwise) \n" +
                        "Tomato - 2 ( finely chopped or crushed)\n" +
                        "Ginger garlic paste -1 tsp \n" +
                        "Coriander leaves - ¼ cup (finely chopped)\n" +
                        "Mint leaves - ¼ cup (finely chopped) \n" +
                        "Green chillies - 5 no's (finely chopped)\n" +
                        "Oil -3 tbsp \n" +
                        "Ghee - 3 tbsp\n" +
                        "Yoghurt -1/4 cup \n" +
                        "Water Coconut milk mixture - 4.5 cups ( 1 cup coconut milk diluted with remaining water)\n" +
                        "Salt - to taste \n" +
                        "Chilly powder - 2 tsp ( or as needed)\n" +
                        "Fennel Powder - 2 tbsp \n" +
                        "Turmeric powder - ¼ tsp\n" +
                        "Ingredients-2 ( For Marination)\n" +
                        "Salt - ¼ tsp\n" +
                        "Lemon juice /Yoghurt - 2 tblsp \n" +
                        "Turmeric powder - ¼ tsp\n" +
                        "Coriander powder - 1 tsp \n" +
                        "Cumin Powder - 1 tsp\n" +
                        "Garam Masala - 1 tsp \n" +
                        "Pepper powder - ½ tsp\n" +
                        "Chilly Powder - 1 tsp \n" +
                        "Ginger garlic paste -1 tsp\n" +
                        "Garam Masala\n" +
                        "Bay leaf - 2\n" +
                        "Cinnamon - 4 \n" +
                        "Star Anise - 2\n" +
                        "Cloves -5 \n" +
                        "Cardamom -3 ");
        values.put("method","Wash and cut chicken into small pieces. Marinate using all ingredients from list-2 and let it rest in the refrigerator for at least half an hour. \n" +
                "Rinse the rice, soak it for at least 15 minutes, drain all water from it and keep aside. \n" +
                "Optionally, toast the rice with some ghee till a nice aroma comes. This will make the biryani even more flavorful and prevent the rice from sticking to each other. You can omit this step if you don't have time.\n" +
                "Method\n" +
                "In a heavy deep vessel/ pressure cooker heat oil and ghee together. Once it gets heated up, add the whole garam masala. You can grind the garam masala and add it if you do not like whole masala coming in your mouth. \n" +
                "Slowly add onions along with chopped green chillies. \n" +
                "When onions turn slightly brown and crispy add ginger garlic paste, chopped coriander and mint leaves. \n" +
                "Next add tomatoes and sauté for a while till the oil separates. \n" +
                "Now add marinated chicken along with turmeric powder, chilly powder, fennel powder, yoghurt and salt. Sauté everything for 5-10 minutes until it thickens to a gravy consistency. \n" +
                "NOTE: If you are making biryani with mutton or pork, you have to cook it completely before adding the rice.\n" +
                "After this step, you can proceed in any of the following ways :-\n" +
                "Using a pressure cooker\n" +
                "Add the coconut milk and water mixture to the gravy and bring it to a boil. Add the soaked rice, check for salt and bring it to a boil again. \n" +
                "Cover the pressure cooker and put the whistle, reduce the flame to the simmer and let it cook for 20-30 minutes. (You may not get any whistle as the flame is very low. Just switch off after 20-30 minutes and the biryani will be done. If you increase the flame, there are chances that the bottom might get burned.)  \n" +
                "Using a rice cooker\n" +
                "Add the gravy and soaked rice to the rice cooker along with water and coconut milk mixture and mix well. \n" +
                "Check for salt and cook them in a rice cooker.  \n" +
                "Using a heavy bottomed pan\n" +
                "Add the coconut milk and water mixture to the gravy and bring it to a boil. Add the soaked rice, check for salt and bring it to a boil again. \n" +
                "Cover the pan with a tight lid to prevent the steam from escaping. Reduce the flame to the lowest possible setting and leave it for half an hour. (You can use a aluminium foil to cover the top of the pan and then put the lid if the lid is not very tight. That way no steam will escape.) \n" +
                "Cooking in convectional oven\n" +
                "Add the gravy and soaked rice to a oven safe dish along with water and coconut milk mixture and mix well. \n" +
                "Check for salt, cover the dish with an aluminium foil to prevent the steam from escaping and cook it for 45 minutes in a 350 degree oven. \n" +
                "Cooking in Microwave Oven \n" +
                "Add the gravy and soaked rice to a microwave safe dish/ micro cooker along with water and coconut milk mixture and mix well. \n" +
                "Check for salt, cover the dish and cook it on micro power high for 20 minutes. \n" +
                "Finally whatever method you use, the outcome is a flavourful, mouth watering biryani. Garnish with coriander leaves, toasted cashew nuts and raisins.\n" +
                "Serving Suggestions\n" +
                "Biryani is usually accompanied by a cool raita. \n" +
                "Other sidedishes for biryani include hard boiled eggs, chicken fry, kaadai fry, ennai kathrikai, chicken curry, chicken 65, achari murg, mint chutney etc.");
        values.put("img", R.drawable.chickenbiryani);
        db.insert("rice", "_id", values);

        values.put("_id", "5");
        values.put("name", "Mushroom Soya Biryani");
        values.put("ingredient",
                "Mushroom - 1 lb /1/2 kg ( cut into small pieces) \n" +
                        "Soya Chunks - 1 cup\n" +
                        "Basmati rice - 2 cups\n" +
                        "Onion -1 large ( cut lengthwise)\n" +
                        "Tomato - 2 ( finely chopped or crushed)\n" +
                        "Ginger garlic paste - 2  tsp\n" +
                        "Corrainder leaves - ¼ cup (finely chopped)\n" +
                        "Mint leaves - ¼ cup (finely chopped)\n" +
                        "Green chillies - 3 nos (finely chopped)\n" +
                        "Oil - 3 tblsp\n" +
                        "Ghee - 3 tblsp\n" +
                        "Coconut milk -½ cup\n" +
                        "Water -3 cups\n" +
                        "Yogurt - 2 tblsp\n" +
                        "Salt - to taste\n" +
                        "Chilly powder - 2 tsp\n" +
                        "Coriander- Cumin powder - 2 tsp\n" +
                        "Fennel Powder - ½ tsp\n" +
                        "Turmeric powder - ¼ tsp\n" +
                        "Whole Garam Masala - (Bay leaf - 1, Cinnamon - 2, Cloves - 5, Cardamon - 3)");
        values.put("method","Wash and cut chicken into small pieces. Marinate using all ingredients from list-2 and let it rest in the refrigerator for at least half an hour. \n" +
                "Rinse the rice, soak it for at least 15 minutes, drain all water from it and keep aside. \n" +
                "Optionally, toast the rice with some ghee till a nice aroma comes. This will make the biryani even more flavorful and prevent the rice from sticking to each other. You can omit this step if you don't have time.\n" +
                "Method\n" +
                "Clean the mushroom with a wet kitchen towel to remove the dirt. Do not wash with water. \n" +
                "Cut it lengthwise to retain the mushroom shape.\n" +
                "Soak 2 cups of Basmati rice and the soya chunks seperately.\n" +
                "In a heavy deep vessel heat oil and ghee together and fry the whole garam masala (bay leaf, cinnamon, cloves, cardomon).\n" +
                "Add onions and saute till golden brown. Slowly add chopped green chilly, chopped corrainder and mint leaves while suateing the onions.\n" +
                "When onions turn slightly brown and crispy add ginger garlic paste and tomatoes and sauté till it becomes a paste.\n" +
                "Now add mushroom slices. Squeeze the water from the soya chunks and add it.\n" +
                "Add the turmeric powder, chilly powder, corriander-cumin powder, fennel powder, yogurt,  coconut milk and salt. Saute everything until it thickens to a gravy consistency.\n" +
                "Drain all water from the rice and put it in a rice cooker. Add the gravy to the rice along with water and mix well. Check for salt and switch on the rice cooker.\n" +
                "After the biryani is done, gently fluff it up with a fork and garnish with corriander leaves. Serve hot with raita and some sidedish.\n" +
                "Variations\n" +
                "You can use one of the ingredients and make mushroom biryani or soya biryani alone.\n" +
                "Serving Suggestion\n" +
                "Enjoy the Mushroom and Soya Biryani with raitha as side. You can also have cauliflower fry or chicken fry as side");
        values.put("img", R.drawable.mushroom);
        db.insert("rice", "_id", values);

        values.put("_id", "1");
        values.put("name", "Quick Cherry Crisp");
        values.put("ingredient",
                "1/3-1/2 cup sugar\n" +
                        "1 tablespoon cornstarch\n" +
                        "4 cups frozen unsweetened pitted tart red cherries\n" +
                        "1 cup crumbled shortbread cookies\n" +
                        "2 tablespoons butter or margarine, melted\n" +
                        "1/4 cup chopped pecans or almonds, toasted \n" +
                        "Ice cream (optional)");
        values.put("method","In a small bowl, combine sugar and cornstarch. In a large saucepan, sprinkle cornstarch mixture over cherries; stir to combine. Cook and stir over medium heat about 10 minutes or until thickened and bubbly. Cook and stir for 2 minutes more. \n" +
                "Meanwhile, in a medium bowl, thoroughly combine crumbled cookies, butter, and nuts \n" +
                "Divide cherry mixture among four dessert dishes. Sprinkle cookie mixture over cherry mixture. If desired, serve with ice cream.");
        values.put("img", R.drawable.cherry);
        db.insert("dessert", "_id", values);

        values.put("_id", "2");
        values.put("name", "Butterscotch-Pretzel Bars");
        values.put("ingredient",
                "Nonstick cooking spray\n" +
                        "1 1/2 cups powdered sugar\n" +
                        "1 cup creamy peanut butter\n" +
                        "6 tablespoons butter, melted\n" +
                        "2 cups crushed pretzels (about 6-1/2 ounces)\n" +
                        "1 11 - ounce package (about 2 cups) butterscotch-flavored pieces\n" +
                        "1/4 cup whipping cream\n" +
                        "1/2 cup coarsely crushed pretzels\n" +
                        "1/2 cup chopped peanutsNonstick cooking spray\n" +
                        "1 1/2 cups powdered sugar\n" +
                        "1 cup creamy peanut butter\n" +
                        "6 tablespoons butter, melted\n" +
                        "2 cups crushed pretzels (about 6-1/2 ounces)\n" +
                        "1 11 - ounce package (about 2 cups) butterscotch-flavored pieces\n" +
                        "1/4 cup whipping cream\n" +
                        "1/2 cup coarsely crushed pretzels\n" +
                        "1/2 cup chopped peanuts");
        values.put("method","Line a 13x9x2-inch pan with foil. Lightly coat the foil with cooking spray; set aside. In a large mixing bowl, stir together powdered sugar, peanut butter, and melted butter. Stir in 2 cups crushed pretzels. Press mixture firmly into the bottom of prepared pan. \n" +
                "In a heavy medium saucepan, combine butterscotch pieces and whipping cream. Stir over low heat until pieces are just melted. \n" +
                "Carefully spoon and spread butterscotch mixture over crumb mixture in pan. Sprinkle 1/2 cup coarsely crushed pretzels and the peanuts evenly over butterscotch mixture; press gently. \n" +
                "Cover and chill for at least 2 hours. Cut into bars to serve. Store in refrigerator for up to 1 week. ");
        values.put("img", R.drawable.butterscotch);
        db.insert("dessert", "_id", values);

        values.put("_id", "3");
        values.put("name", "Quick Whoopie Pies");
        values.put("ingredient",
                "1/2 of an 8-ounce package reduced-fat cream cheese (Neufchatel), softened\n" +
                        "1/4 cup butter, softened\n" +
                        "1/2 of a 7-ounce jar marshmallow creme\n" +
                        "12 soft chocolate cookies or your favorite soft cookies");
        values.put("method","For filling, in a medium mixing bowl beat cream cheese and butter with an electric mixer on medium to high speed until smooth and fluffy. Fold in marshmallow creme. \n" +
                "Spread filling on bottoms of half of the cookies. Top with the remaining cookies, bottom sides down. For firmer filling, wrap and chill about 2 hours before serving. \n" +
                "\n" +
                "Variation\n" +
                "Peanut Butter Whoopie Pies: Prepare as directed, except substitute 1/4 cup creamy peanut butter for the butter and use soft peanut butter or sugar cookies.");
        values.put("img", R.drawable.whoopie);
        db.insert("dessert", "_id", values);

        values.put("_id", "4");
        values.put("name", "Blackberry-Banana Lemon Trifle");
        values.put("ingredient",
                "1 4 - serving-size package instant vanilla pudding and pie filling mix\n" +
                        "1 teaspoon finely shredded lemon peel\n" +
                        "3 small bananas, sliced\n" +
                        "1 cup fresh blackberries, blueberries, raspberries, or sliced strawberries\n" +
                        "3 100-calorie pack shortbread cookies, coarsely broken\n" +
                        "Lemon zest\n" +
                        "Fresh mint leaves");
        values.put("method","Prepare pudding mix according to package directions, stirring in lemon peel with milk. Transfer pudding to a serving bowl or dish. Top with sliced bananas, berries, and shortbread cookies. Garnish with lemon zest and fresh mint. \n" +
                "\n" +
                "Tip\n" +
                "*Tip: If using vanilla pudding, stir 1/4 teaspoon finely shredded lemon peel into each of the containers of pudding.");
        values.put("img", R.drawable.blackberry);
        db.insert("dessert", "_id", values);

        values.put("_id", "5");
        values.put("name", "Mocha Chocolate Mousse");
        values.put("ingredient",
                "1 1/2 cups chocolate milk or milk\n" +
                        "2 -3 teaspoons instant coffee crystals\n" +
                        "1 4-serving-size package instant devil's food chocolate pudding mix\n" +
                        "1 1 1/4 - ounce envelope whipped dessert topping mix\n" +
                        "2 cups strawberry halves and/or banana chunks\n" +
                        "Miniature semisweet chocolate pieces, chocolate sprinkles or chopped chocolate-covered espresso beans (optional)");
        values.put("method","In a large bowl, combine milk and coffee crystals. Let stand for 5 minutes to dissolve crystals. \n" +
                "Stir in pudding mix and dessert topping mix. Beat with an electric mixer on low speed about 30 seconds or until moistened. Beat on high speed about 4 minutes or until fluffy. Alternately spoon chocolate mousse and strawberries into 6 individual parfait glasses. Serve immediately or chill until serving time. If you like, garnish with chocolate pieces. Makes 6 servings.");
        values.put("img", R.drawable.mocha);
        db.insert("dessert", "_id", values);

        values.put("_id", "1");
        values.put("name", "Aloo Chaat");
        values.put("ingredient",
                "3 Potatoes (boiled and peeled) \n" +
                        "1 tsp Chaat masala \n" +
                        "1 tsp Roasted Cumin Powder \n" +
                        "1 tbsp Tamarind Chutney \n" +
                        "1/2 tbsp Mint Chutney \n" +
                        "1/2 tsp Red Chilli Powder \n" +
                        "Oil for frying \n" +
                        "Chopped Coriander Leaves \n" +
                        "Salt as per taste\n");
        values.put("method","Chop the boiled potatoes into 3/4 inch cubes. \n" +
                "Deep-fry the potatoes in oil in a wok till golden brown and well cooked. \n" +
                "Drain excess oil on a paper. \n" +
                "Put the fried potatoes in a bowl with cumin powder, red chilli powder, salt, chaat masala and mix thoroughly. \n" +
                "Add tamarind chutney and mint chutney according to taste and mix properly. \n" +
                "Garnish with fresh coriander leaves and serve.\n");
        values.put("img", R.drawable.aloochaat);
        db.insert("occasion", "_id", values);

        values.put("_id", "2");
        values.put("name", "Haleem");
        values.put("ingredient",
                "200 gm Wheat (washed and soaked for 2 hrs) \n" +
                        "300 gm Boneless Mutton \n" +
                        "100 gms Cooking oil \n" +
                        "3 Onions (sliced) \n" +
                        "2 Lime \n" +
                        "2 tsp Garam Masala \n" +
                        "Salt to taste\n" +
                        "\n" +
                        "For paste: \n" +
                        "20 gm Fresh Green Chillies \n" +
                        "2 inch piece Ginger \n" +
                        "6-8 flakes Garlic \n");
        values.put("method","Clean and marinate mutton with half of ground paste of ginger, garlic, green chillies and salt for 1 hour. \n" +
                "Pressure cook the soaked wheat and marinated meat for about 45 minutes. \n" +
                "Mince and grind to a fine paste. \n" +
                "In a Pan heat oil, add the finely sliced onions, fry till brown, add the garam masala. \n" +
                "Add the ground paste and keep stirring on slow flame, till the mixture leaves the sides of the pan. \n" +
                "Serve hot, with lime wedges \n");
        values.put("img", R.drawable.haleem);
        db.insert("occasion", "_id", values);

        values.put("_id", "3");
        values.put("name", "Keema");
        values.put("ingredient",
                "1/2 kg Minced Beef \n" +
                        "2 Tomatoes \n" +
                        "1 Onion (finely chopped) \n" +
                        "3 tbsp Oil \n" +
                        "6 whole Black Peppers \n" +
                        "6 Cloves \n" +
                        "1 Black Cardamom \n" +
                        "1/4 tsp Cumin \n" +
                        "1tsp Coriander Power \n" +
                        "Salt as per taste \n" +
                        "1/4tsp Turmeric Powder \n" +
                        "3/4tsp Chili Powder \n" +
                        "2 tbsp Yogurt \n" +
                        "1/2tsp Ginger Paste \n" +
                        "1/4tsp Garlic Paste \n" +
                        "Water as required \n");
        values.put("method","Take oil in a pan and sauté the chopped onions in it. \n" +
                "Add all the spices including ginger-garlic paste and fry for few seconds. \n" +
                "Now add yoghurt and finely chopped tomatoes. \n" +
                "Cook on medium heat till water is almost dried. \n" +
                "Add mince meat mix and dry the water again. \n" +
                "Then add 2 glasses of water, cover the lid and leave to tenderize and water dries. \n" +
                "Garnish with fresh green coriander leaves and chopped green chillies.");
        values.put("img", R.drawable.keema);
        db.insert("occasion", "_id", values);

        values.put("_id", "4");
        values.put("name", "Kaju Burfi");
        values.put("ingredient",
                "3 cups Raw Cashew Nuts \n" +
                        "2 cups Water \n" +
                        "2 cups Sugar \n" +
                        "Silver foil");
        values.put("method","Grind the cashews to make a fine powder. \n" +
                "Next prepare a sugar syrup by combining water and sugar together in a pot and heating them. \n" +
                "Stir continuously until it has a 2-thread consistency. \n" +
                "Turn off the flame. \n" +
                "Dissolve cashew powder in the syrup. Make the solution thick. \n" +
                "Spread the solution on a greased plate and put silver foil on it. \n" +
                "Allow to cool and then cut it into pieces. \n" +
                "Kaju Burfi is ready.");
        values.put("img", R.drawable.kajubarfi);
        db.insert("occasion", "_id", values);

        values.put("_id", "5");
        values.put("name", "Finger Chips");
        values.put("ingredient",
                "5 Potatoes \n" +
                        "Oil for frying \n" +
                        "Rocksalt to taste \n");
        values.put("method","Cut potato into thin long strips. \n" +
                "wash then and then make them dry completely. \n" +
                "Add rocksalt as required. \n" +
                "Deep fry potato strips in heated oil till it turns pink. \n" +
                "Serve hot with tomato ketchup.");
        values.put("img", R.drawable.fingerchips);
        db.insert("occasion", "_id", values);

        values.put("_id", "1");
        values.put("name", "Avocado Grapefruit & Strawberry");
        values.put("ingredient",
                "1 medium avocadoor mango, peeled and sliced\n" +
                        "1 medium grapefruit, segmented\n" +
                        "3/4 cup strawberries, halved\n" +
                        "1 tsp lemon juice\n" +
                        "\n" +
                        "For the dressing\n" +
                        "2 tbsp vinegar\n" +
                        "3 to 4 strawberries, finely chopped\n" +
                        "2 tbsp oil\n" +
                        "a pinch of salt\n" +
                        "a pinch of sugar");
        values.put("method","For the dressing, mix all the ingredients very well. Chill.\n" +
                "Sprinkle the lemon juice over the avocado slices.\n" +
                "Arrange the frutis decoratively on a serving plate. Chill. \n" +
                "Serve with the chilled dressing.\n" +
                "\n" +
                "Tips\n" +
                "Goodness Guide :\n" +
                "This appetizing salad provides essential fatty acids and Vitamin C");
        values.put("img", R.drawable.avocado);
        db.insert("salad", "_id", values);

        values.put("_id", "2");
        values.put("name", "American Sweet Corn");
        values.put("ingredient",
                "3 cups boiled sweet corn kernels (makai ke dane)\n" +
                        "1/2 cup chopped spring onions (whites and greens)\n" +
                        "1/2 cup capsicum cubes\n" +
                        "1/2 cup tomato cubes\n" +
                        "\n" +
                        "To Be Mixed Into A Vinaigrette Dressing\n" +
                        "1 tbsp vinegar\n" +
                        "2 tbsp olive oil\n" +
                        "1/2 tsp mustard (rai / sarson) powder\n" +
                        "1 tbsp sugar\n" +
                        "salt and freshly ground black pepper (kalimirch) to taste");
        values.put("method","Combine the sweet corn, spring onions, capsicum and tomatoes in a deep bowl and mix well.\n" +
                "Pour the vinaigrette dressing over the salad, toss well and refrigerate for at least an hour.\n" +
                "Serve chilled.");
        values.put("img", R.drawable.sweetcorn);
        db.insert("salad", "_id", values);

        values.put("_id", "3");
        values.put("name", "Arabic Salad");
        values.put("ingredient",
                "\n" +
                        "To Be Mixed Into A Dressing\n" +
                        "2 tbsp lemon juice\n" +
                        "1/2 tsp baharat powder\n" +
                        "1/4 tsp pomegranate seeds (anardana ) powder\n" +
                        "salt to taste\n" +
                        "\n" +
                        "Other Ingredients\n" +
                        "1 cup iceberg lettuce , torn into pieces\n" +
                        "1/2 cup cherry tomatoes , halved\n" +
                        "1/2 cup cucumber cubes\n" +
                        "5 green olives , halved\n" +
                        "5 black olives , halved\n" +
                        "1/2 cup chopped mint leaves (phudina)");
        values.put("method","Immerse the lettuce leaves in ice - cold water for 10 minutes and drain well. This will make them crisp.\n" +
                "Combine all the ingredients in a bowl, pour the dressing on top and toss well.\n" +
                "Serve immediately.");
        values.put("img", R.drawable.arabicsoup);
        db.insert("salad", "_id", values);

        values.put("_id", "4");
        values.put("name", "Arabic Salad");
        values.put("ingredient",
                "1 cup iceberg lettuce, torn into pieces\n" +
                        "1/2 cup cherry tomatoes, halved\n" +
                        "1/2 cup cucumber cubes\n" +
                        "5 green olives\n" +
                        "5 black olives\n" +
                        "1/2 cup chopped mint leaves (phudina)\n" +
                        "\n" +
                        "To be mixed into a dressing\n" +
                        "2 tbsp lemon juice\n" +
                        "1/2 tsp Baharat\n" +
                        "1/4 tsp pomegranate (anardana) powder\n" +
                        "salt to taste");
        values.put("method","Combine all the ingredients, pour the dressing on top and serve immediately.");
        values.put("img", R.drawable.arabicsalad);
        db.insert("salad", "_id", values);

        values.put("_id", "5");
        values.put("name", "Apple Banana & Date Salad");
        values.put("ingredient",
                "Ingredients\n" +
                        "2 cups apple cubes (unpeeled)\n" +
                        "1/2 cup sliced bananas\n" +
                        "1/4 cup chopped dates (khajur)\n" +
                        "\n" +
                        "To Be Mixed Into A Dressing\n" +
                        "1/4 cup readymade pineapple juice\n" +
                        "1/4 tsp lemon rind\n" +
                        "1/2 tsp lemon juice\n" +
                        "1/4 tsp mustard (rai / sarson) powder\n" +
                        "1 tsp powdered sugar\n" +
                        "salt and to taste");
        values.put("method","Combine all the ingredients along with the prepared dressing in a deep bowl and toss well.\n" +
                "\n" +
                "Serve immediately.");
        values.put("img", R.drawable.apple);
        db.insert("salad", "_id", values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS recipe");
        db.execSQL("DROP TABLE IF EXISTS nonjainstarters");
        db.execSQL("DROP TABLE IF EXISTS nonvegstarters");
        db.execSQL("DROP TABLE IF EXISTS vegmain");
        db.execSQL("DROP TABLE IF EXISTS nonvegmain");
        db.execSQL("DROP TABLE IF EXISTS rice");
        db.execSQL("DROP TABLE IF EXISTS dessert");
        db.execSQL("DROP TABLE IF EXISTS occasion");
        db.execSQL("DROP TABLE IF EXISTS salad");
        onCreate(db);
    }
}