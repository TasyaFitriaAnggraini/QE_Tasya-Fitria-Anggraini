# 10 - RESTful API Testing with Rest Assured

## Soal RESTful API Testing with Rest Assured
Lakukan API testing pada API berikut:

<img src = "https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/18_RESTful%20API%20Testing%20with%20Rest%20Assured/Screenshot/Screenshot%202023-09-23%20073338.png">

Kriteria dari pembuatan test case adalah sebagai berikut: 
- Terdapat case positif dan negatif
- Pengujian (testing) menggunakan REST Assured

Jawab:

### Feature: API Testing on

As a tester

I want to test all API endpoint

So that I can assure the endpoint was correct


#### Endpoint : https://jsonplaceholder.typicode.com/posts

### Scenario: [Positive] - Verify user GET all posts
- Given I set GET endpoint
- When I send a GET HTTP request
- Then I receive valid HTTP response code 200
- And I receive response valid data for a list of all posts

### Scenario: [Negative] - Verify user GET all posts with wrong endpoint
- Given I set GET endpoint to an invalid endpoint
- When I send an HTTP GET request
- Then Then I received HTTP response code 404
- And I should receive an error message 404 Not Found

### Scenario: [Positive] - Verify user POST new post
- Given I set an endpoint for POST new user
- When I request POST detail user
- Then I receive valid HTTP response code 201
- And I validate the data detail after create user

### Scenario: [Negative] - Verify user POST new post with missing data
- Given I set an endpoint for POST new user
- When I request POST detail user with missing data
- Then I receive invalid HTTP response code 404
- And I receive an error message Invalid input: missing field 'body'

#### Endpoint : https://jsonplaceholder.typicode.com/posts/1

### Scenario: [Positive] - Verify user GET post by ID
- Given I set the GET endpoint URL to post with ID
- When I send a GET HTTP request to endpoint URL to post with ID
- Then I verify that HTTP response code 200
- And I receive response valid data for post with ID 1

### Scenario: [Negative] - Verify user GET post by invalid ID
- Given I set the GET endpoint URL to invalid post ID
- When I send a GET HTTP request to endpoint URL to invalid post ID
- Then I verify that HTTP response code is not 400
- And I receive an error message with invalid post ID

### Scenario: [Positive] - Verify user PUT post by ID
- Given I set PUT endpoint
- When I send PUT HTTP request
- Then I receive response with a valid HTTP status code 200
- And I receive valid data for existing user

### Scenario: [Negative] - Verify user PUT send invalid request for post by ID
- Given I set PUT endpoint for an existing post by ID
- When I send an invalid PUT HTTP request with an empty request body
- Then I receive response with an invalid HTTP status code 404
- And I receive an error message 'Request body is empty' in the response body

### Scenario: [Positive] - Verify user DELETE post by ID
- Given I set DELETE endpoint
- When I send DELETE HTTP request
- Then I receive an valid HTTP response code 200

### Scenario: [Negative] - Verify user cannot DELETE non-existing post by ID
- Given I set DELETE endpoint for a non-existing post
- When I send DELETE HTTP request
- Then I receive HTTP response code 404

## Screenshoot

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/18_RESTful%20API%20Testing%20with%20Rest%20Assured/Screenshot/Latihan/Screenshot%202023-09-22%20172253.png">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/18_RESTful%20API%20Testing%20with%20Rest%20Assured/Screenshot/Latihan/Screenshot%202023-09-22%20172306.png">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/18_RESTful%20API%20Testing%20with%20Rest%20Assured/Screenshot/Latihan/Screenshot%202023-09-22%20172319.png">

<img src="https://github.com/TasyaFitriaAnggraini/QE_Tasya-Fitria-Anggraini/blob/main/18_RESTful%20API%20Testing%20with%20Rest%20Assured/Screenshot/Latihan/Screenshot%202023-09-22%20172526.png">
