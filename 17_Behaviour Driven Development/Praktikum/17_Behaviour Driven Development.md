# 9 - From Manual to Automation Testing & BDD

## Soal Behavior Driven Development (BDD)

https://docs.google.com/document/d/188LYaKy-yyBA9VNg1kt8nbhRZ9ubxT3x/edit?usp=share_link&ouid=117667124886656144596&rtpof=true&sd=true

### Soal Prioritas 1

Lakukan testing pada aplikasi https://www.linkedin.com/ dengan langkah-langkah sebagai berikut:
   - Buatlah scenario test sebanyak mungkin menggunakan format BDD pada fitur-fitur halaman utama https://www.linkedin.com/
   - Buatlah project baru menggunakan intelliJ
   - Buatlah file feature Cucumber
   - Buatlah class runner dan step
   - Buatlah class steps yang berisi method-method yang dijalankan dalam scenario test
   - Jalankan class runner
   - Tampilkan report HTML dari Cucumber

Jawab:

#### Feature: Testing Linkedln Features
As a user of Linkedln
I want to verify the functionality of the homepage features
So that I can ensure that the site is working correctly

#### Scenario: Verify user can create a new account
-	Given I am in the Linkedln homepage
-	When I am click the Join now button
-	And I am enter my first name
-	And I am enter my last name
-	And I am enter my email address
-	And I am enter my password
-	And I am click the Agree & Join button
-	Then I am should have a new account on Linkedln

#### Scenario: Verify user login
-	Given I am on the Linkedln homepage
-	When I am click the Sign in button
-	And I am enter email address
-	And I am input my password
-	And I am click the button Sign in
-	Then I am should be logged in to my account

##### Scenario: Verify user search functionality
-	Given I am logged in to my Linkedln account
-	When I am enter Quality Engineer in the search bar
-	And I am click the Search button
-	Then I am should see a list of results related to Quality Engineer

#### Scenario: Verify user profile page
-	Given I am login into my Linkedln account
-	When I am click on my profile picture
-	And I am click the View profile button
-	Then I am should be taken to my profile page
-	And I am should see my name, headline, and summary information

#### Scenario: Verify user network page
-	Given I am logged in my Linkedln account
-	When I am click on the My Network tab
-	Then I am should be taken to the network page
-	And I am should see suggestions for people to connect with

#### Scenario: Verify that the user can create a new post
-	Given I am accessed my LinkedIn account
-	When I am click on the Start a post button
-	And I am type text in the post text field
-	And I am click on the Post button
-	Then I am should see my new post on my feed

#### Scenario: Verify that the user can react to a post by liking, commenting, or sharing
-	Given I am signed into my Linkedln account
-	And there is a post on my feed
-	When I am click on the Like button on the post
-	And I am type Great post in the comment text field
-	And I am click on the Comment button
-	And I am click on the Share button
-	Then I am should see the post on my activity feed

#### Scenario: Verify that the user can edit their profile information
-	Given I am access login My profile in to Linkedln
-	When I am click picture on profile
-	And I am select the View profile button
-	And I am click on the Edit button on the About section
-	And I am update my Headline to Quality Engineer
-	And I am click on the Save button
-	Then I am should see my updated profile information

#### Scenario: Verify that the user can upload a new profile picture
-	Given I am login in Linkedln account
-	When I am click on my profile picture
-	And I am click on the Change photo button
-	And I am select a new profile picture to upload
-	And I am selected the Save button
-	Then I am should see my new profile picture on my profile page

#### Scenario: Verify that the user can search for jobs and apply to job postings
-	Given I am accessed my LinkedIn profile by sign in
-	When I am click on the Jobs tab
-	And I am input Quality Engineer in the search box
-	And I am select a job posting to view
-	And I am click on the Apply button
-	And I am fill out the job application form
-	And I am click on the Submit button
-	Then I am should see a confirmation message that my job application was 
	Submitted

#### SCREENSHOOT

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235426.png" alt="Deskripsi Gambar"> 

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235443.png" alt="Deskripsi Gambar">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235451.png" alt="Deskripsi Gambar">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235542.png" alt="Deskripsi Gambar">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235555.png" alt="Deskripsi Gambar">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235614.png" alt="Deskripsi Gambar">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235625.png" alt="Deskripsi Gambar">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235703.png" alt="Deskripsi Gambar">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/17_Behaviour%20Driven%20Development/Screenshot/Soal%20Prioritas%201/Screenshot%202023-09-18%20235713.png" alt="Deskripsi Gambar">

### Soal Prioritas 2

Lakukan testing pada aplikasi [https://www.sepulsa.com/ dengan langkah-langkah sebagai berikut:
   - Buatlah scenario test menggunakan format BDD pada fitur login, pilih produk dan pilih metode pembayaran
   - Buatlah project baru menggunakan intelliJ
   - Buatlah file feature Cucumber
   - Buatlah class runner dan step
   - Buatlah class steps yang berisi method-method yang dijalankan dalam scenario test
   - Jalankan class runner
   - Tampilkan report HTML dari Cucumber

Jawab:

#### Feature: Testing Sepulsa Features
As a user of Sepulsa website, I want to be able to verify the functionality of its key features, such as the login process, product selection, and payment methods. This will help me ensure that the website is working correctly and that I can use it to complete transactions with ease. Through testing these features, I can identify and report any bugs or issues that may arise and contribute to improving the overall user experience on Sepulsa website.

#### Scenario: Verify User Valid Account Creation
-	Given I am is on the Sepulsa registration page
-	And I am has entered valid information in all required fields
-	When I am click the Create Account button
-	Then I am should be redirected to the Sepulsa homepage and receive a confirmation email for their account creation

#### Scenario: Verify User Invalid Account Creation
-	Given I am at the Sepulsa registration page
-	And I am has entered invalid information in one or more required fields
-	When I am click on the button to Create Account
-	Then I am should see error messages indicating which fields have invalid information, and the account should not be created

#### Scenario: Verify User Valid Login
-	Given I am is on the Sepulsa login page
-	And I am has entered valid login credentials username and password
-	When I am click the Login button
-	Then I am should be redirected to the Sepulsa homepage and see their account information

#### Scenario: Verify User Invalid Login
-	Given I am at the Sepulsa login page
-	And I am has entered invalid login credentials incorrect username or password
-	When I am click on the button Login
-	Then I am should see an error message indicating that the login failed, and the user should not be logged in

#### Scenario: Verify User Invalid Login - Blank Fields
-	Given I am have reached the Sepulsa login page
-	And I am has left either the username or password field blank
-	When I am click on the button to Login
-	Then I am should see an error message indicating that the username or password field is required

#### Scenario: Verify User Invalid Login - Account Locked
-	Given I am currently located on the Sepulsa login page
-	And I am has entered their invalid username and password multiple times
-	When I am enters their invalid credentials again after the maximum allowed attempts
-	Then I am should see an error message indicating that their account is locked due to too many failed login attempts

#### Scenario: Verify User Choose Product
-	Given I am is logged in to the Sepulsa application
-	And I am is on the Sepulsa homepage
-	When I am clicks on the Choose Product button
-	Then I am should be redirected to the Sepulsa products page

#### Scenario: Verify User Filter Products
-	Given I am is on the Sepulsa homepage
-	And I am have moved to the Pulsa section
-	When I am applies one or more filters such as by provider or price range and clicks the Filter button
-	Then I am the filtered results should appear, and the user should be able to select the desired product and proceed to the payment page

#### Scenario: Verify User View Product Details
-	Given I am now on the Sepulsa homepage
-	And I am currently browsing the Pulsa section
-	When I am clicks on a product to view its details
-	Then I am the product details such as description, price, and terms and conditions should be displayed, and the user should be able to add the product to their cart or go back to the list of available products

#### Scenario: Verify User Select Out-of-Stock Product
-	Given I am is the Sepulsa homepage
-	And I am have reached the Pulsa section
-	When I am selects an out of stock product and clicks the Buy button
-	Then I am should see an error message indicating that the selected product is out of stock, and the user should not be able to proceed to the payment page

#### Scenario: Verify User Choose Payment Method
-	Given I am has selected a product
-	And I am is on the Sepulsa payment page
-	When I am selects a payment method
-	And I am clicks the Pay Now button
-	Then I am should see the payment details and be able to proceed with the payment

#### Scenario: Verify User No Available Payment Methods
-	Given I am has selected a product to purchase
-	When I am clicks on the Buy button
-	And I am is redirected to the payment page
-	And I am there are no available payment methods
-	Then I am should see an error message indicating that there are no available payment methods

#### Scenario: Verify User Payment Method Unavailable
-	Given I am have chosen a product to buy
-	When I am select the Buy button
-	And I am taken to the payment page
-	And I am selects an unavailable payment method
-	Then I am should see an error message indicating that the selected payment method is not available

#### Scenario: Verify User Payment Method Selection
-	Given I am have selected a product for purchase
-	When I am press the Buy button
-	And I am redirects to the payment page
-	And I am selects a valid payment method
-	Then I am should see the payment details for the selected payment method

#### Scenario: Verify User Payment Method Confirmation
-	Given I am have made a selection of a product that I want to buy
-	When I am have initiated the purchase with Buy button
-	And I am directed to the payment page
-	And I am choose a legitimate payment method
-	And I am enters the required payment details
-	And I am confirms the payment
-	Then I am should see a confirmation message indicating that the payment was successful

#### SCREENSHOOT
