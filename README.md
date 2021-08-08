# altime-stock-assignment

Database Used : H2
Username : sa
Password : 
DB Name : stockdb

APIs

1. Display All Stocks
Method GET
http://localhost:8080/display

2. Display Stock of specific ID
Method GET
http://localhost:8080/display/{id}


3. Create New Stock 
Method POST
http://localhost:8080/create
RequestBody Sample 
{
    "name": "TV",
    "purchasePrice": 20000,
    "quantity": 5
}

4. Update Stock of Sprcific ID
Method PUT
http://localhost:8080/update/{id}
RequestBody Sample 
{
    "name": "TV",
    "purchasePrice": 20000,
    "quantity": 5
}
