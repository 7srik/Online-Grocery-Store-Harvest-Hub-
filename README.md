# OOD_HarvestHub
Start Eclipse and import the project.
Install MySQL by downloading and configuring the server.
Acquire the MySQL JDBC driver, extract the JAR, and add it to the Build Path in the project's properties as a Library.
Run the given script to generate the product_list, user_info, and user_order_history tables. Data storing and retrieval are handled by this script.
After writing the SQL Script follow the following steps
Using the following link, download the animation JAR and add it to the build path: https://mvnrepository.com/artifact/io.github.typhon0/AnimateFX/1.2.0
Make sure the Build Path contains the JavaFX library.
In the Harvest_Hub project, at src.constants.DatabaseUserConstants, update the URL, username, and password to correspond with your database configuration.
Run the Main.java program.
Proceed to the Register Page and finish the process of registering as a user.
Once your registration has been approved, sign in to your account.
and  Shop for groceries with us using our platform.

create database Harvest_Hub;

use Harvest_Hub;

create table PRODUCT_LIST(productId varchar(10), productName varchar(50), productPrice float, productQuantity int, catalog varchar(10), PRIMARY KEY (productId));

create table USER_INFO(user_name varchar(20), full_name varchar(50), contact_number varchar(20), email varchar(50), password varchar(30), PRIMARY KEY (user_name));

create table USER_ORDER_HISTORY(user_name varchar(20), productId varchar(10), purchasedPrice float, catalog varchar(20), order_timestamp varchar(20));
insert into product_list values("DAI001", "Milk", 4.0, 100, "Dairy");
insert into product_list values("DAI002", "Butter", 5.6, 100, "Dairy");
insert into product_list values("DAI003", "Heavy Cream", 2.4, 100, "Dairy");
insert into product_list values("DAI004", "Ice Cream", 3.2, 100, "Dairy");
insert into product_list values("DAI005", "Chocolate Milk", 3.5, 100, "Dairy");
insert into product_list values("DAI006", "Sour Cream", 2.2, 100, "Dairy");
insert into product_list values("DAI007", "String Cheese", 5.5, 100, "Dairy");
insert into product_list values("DAI008", "Mozzarella Cheese", 5.75, 100, "Dairy");
insert into product_list values("DAI009", "Yogurt", 3.5, 100, "Dairy");
insert into product_list values("BEV001", "Water", 2.0, 100, "Beverages");
insert into product_list values("BEV002", "Celsius", 3.2, 100, "Beverages");
insert into product_list values("BEV003", "Kool Aid", 2.5, 100, "Beverages");
insert into product_list values("BEV004", "Fruit Punch", 2.3, 100, "Beverages");
insert into product_list values("BEV005", "Gatorade", 3.0, 100, "Beverages");
insert into product_list values("BEV006", "Orange Juice", 3.4, 100, "Beverages");
insert into product_list values("BEV007", "Pepsi", 1.75, 100, "Beverages");
insert into product_list values("BEV008", "Red Bull", 2.26, 100, "Beverages");
insert into product_list values("BEV009", "Seltzer", 2.86, 100, "Beverages");
insert into product_list values("MEA001", "Chicken", 3.54, 100, "Meat");
insert into product_list values("MEA002", "Salmon Fish", 3.1, 100, "Meat");
insert into product_list values("MEA003", "Beef", 2.6, 100, "Meat");
insert into product_list values("MEA004", "Crab", 2.8, 100, "Meat");
insert into product_list values("MEA005", "Clam", 3.0, 100, "Meat");
insert into product_list values("MEA006", "Lamb", 4.4, 100, "Meat");
insert into product_list values("MEA007", "Pork", 2.75, 100, "Meat");
insert into product_list values("MEA008", "Turkey", 3.26, 100, "Meat");
insert into product_list values("MEA009", "Prawns", 4.2, 100, "Meat");
insert into product_list values("SNA001", "BlueBerry Bar", 0.78, 100, "Snacks");
insert into product_list values("SNA002", "Cheetos", 2.15, 100, "Snacks");
insert into product_list values("SNA003", "Chips", 2.24, 100, "Snacks");
insert into product_list values("SNA004", "Chocolate", 0.38, 100, "Snacks");
insert into product_list values("SNA005", "Onion Dip", 2.1, 100, "Snacks");
insert into product_list values("SNA006", "Popcorn", 3.18, 100, "Snacks");
insert into product_list values("SNA007", "Pringles", 4.2, 100, "Snacks");
insert into product_list values("SNA008", "Tostitos", 2.86, 100, "Snacks");
insert into product_list values("SNA009", "Trail", 2.64, 100, "Snacks");
insert into product_list values("VEG001", "Bell Pepper", 2.18, 100, "Vegetables");
insert into product_list values("VEG002", "Carrot", 1.5, 100, "Vegetables");
insert into product_list values("VEG003", "Cauliflower", 3.54, 100, "Vegetables");
insert into product_list values("VEG004", "Mushrooms", 3.50, 100, "Vegetables");
insert into product_list values("VEG005", "Onions", 4.50, 100, "Vegetables");
insert into product_list values("VEG006", "Potatoes", 3.25, 100, "Vegetables");
insert into product_list values("VEG007", "Scallions", 2.75, 100, "Vegetables");
insert into product_list values("VEG008", "Spinach", 3.55, 100, "Vegetables");
insert into product_list values("VEG009", "Tomatoes", 4.74, 100, "Vegetables");
