Work Flow

1. Create a SignIn page and login using UserID and Password
	(There are no option to forget and Signup, Developer can set the UserID and Password)

2. Create a Bottom Navigation bar
	//Bottom Navigation
	2.1). Menu
	2.2). Charts
	2.3). Order
	2.4). Customer
	2.6). Work Assign

	//Drawer
	2.7). Notification
	2.8). Access the wallet
	2.5). Register
	2.9). Show Earning

3. Menu Framelayout features
	Create a Top Navigation bar
	3.1). Set Todays Menu
		3.1.1). Create two button (Morning menu, Evening menu)
		3.1.2). Clicking both button open new Activity SetMenu
		3.1.3). In SetMenu activity admin can set the menu via radio botton from both button
		3.2.4). Show both menu data via Recyclerview
	3.2). Add Menu
		3.2.1). Open new Activity that is AddMenuActivity
		3.2.2). Create form and inside form set 
	3.3). Show All Menu
		3.3.1) Give two option (Delete and Edit)
		3.3.2) Create a EditMenuActivity and updateMenu
		3.3.3) Create a deleteButton Listener

4. Charts Framelayout features
	4.1). Create cardView to show total Customer in Numbers
	4.2). Create a clickListener and open new activity
		4.2.1). Filter todays new Customer
		4.2.2). Filter last 7 days new Customer
		4.2.3). Filter last 28 dats new Customer
		4.2.4). Filter Total Subscription based Customer
		4.2.5). Filter Total less than 500rs Customer
	4.3). To show all numbers in chart (Growth status) --Create in next Update 
		4.3.1). Display Customer details outside delivery zone

5. Order Framelayout features
	5.1). Create a button for Morning Order
		5.1.1). Morning Order  Click Listner
		5.1.2). Show all Status in Table View
		5.1.3). Left Side Show Menu(sabji/roti/paratha/puri/other beverages)
		5.1.4). Right Side Show Quantity (for all items)
	
	5.2). Create a button for Evening Order
		5.2.1). Evening Order Click Listner
		5.2.2). Show all Status in Table View
		5.2.3). Left Side Show Menu(sabji/roti/paratha/puri/other beverages)
		5.2.4). Right Side Show Quantity (for all items)

6. Customer Framelayout features
	6.1). Create a Card view to Show all list of customers
		6.1.1). Create a new Activity to show All list of customer with these Parameter
		6.1.2). parameter is (Customer code, wallet amt, name, dob, default status, 
	6.2) Create Card View to access wallet 
		//Pending
	6.3). Show total customer number of perticular parent location


7. Register to Delivery boy
	7.1). Create a button to add new Delivery boy
		7.1.1). Create a new Activity of adding a customer form
		7.1.2). These parameter to input (name, bike name,bike number, mobile,email, username,password, photo adhar front,photo adhar back,photo license front, photo license back, photo of boy)

	7.2). Show all delivery boy in Card with recycler view with boy all details
		7.2.1) Copy click feature add in Username and password
	7.3). In Card give edit option and create a new activity for edit
	7.4). In card give delete option to delete a delivery boy
	

8. Work Assign
	8.1). Craete a new button to give delivery assign
		8.1.1). Create a new Activity to show all todays order with Check box and with their respective location
		8.1.2). Give button to assign their work (Check their respective work and send to the Delivery boy
	8.2). Show all deliverd Status 
		8.2.1). Create a card view to show the numbers to delivery , and also see the pending orders

9. Notification
	9.1) Send the notifcation for all 
		9.1.1). Create a Textbox and send button
		9.1.2). Set Notification icon
	9.2) Send the perticular notification 
		9.2.1). show all customers
			9.2.1.1). by clicking on customer open seperate activity to send notification
	9.3). Research exact money spend to notication sending

10. Wallet Access
	10.1). Create a seperate page to update balance of User wallet amt
	10.2). Update balace by click and also send msg
	


	
