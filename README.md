
<h1 align='center'>e-commerce system for Fawry task</h1>


## 📙 About 
A simple Java-based e-commerce system with support for perishable and shippable products, cart management, and checkout simulation.


## 📃 Assumptions
1- Shipping Fees depends on weight (10 * total weight of shippable products in the cart).

2- All Weights are in Kg.

3- My Main class define only 4 products for testing.
    <p>- Cheese product which requires shipping and has expiry date and has price=50, quantity=3, expiry date=1-8-2025 and weight=0.5kg</p>
    <p>- TV prouduct which requires shipping and has price=5000, quantity=1 and weight=10kg</p>
    <p>- Mobile Scratch Card product which has price=20 and quantity=10</p>
    <p>- Biscuits prouduct which has expiry date and has price=20, quantity=5 and expiry date=1-7-2024 (expired)</p>

3- My Main class define only 4 customers for testing.
    <p>- Customer 1 with balance 1000</p>
    <p>- Customer 2 with balance 100</p>
    <p>- Customer 3 with balance 1000</p>
    <p>- Customer 4 with balance 1000</p>
   
    

## 🏁 Getting Started 

This is a list of needed instructions to run the project locally
### Installation 

1. **Clone the repository**

```bash
$ git clone [https://github.com/EmanElbedwihy/e-commerce-system.git]
```

2. **Install Extension Pack for Java in VS Code**
   


### Running 

 **Run the following commands in terminal**

```bash
$ javac e_commerce/*.java
$ java e_commerce.Main
```



## 📃 Test Cases 
    <h3 >Test Case 1</h3>
    <p>- Customer 1 adds 2 cheese product and 2 mobile scratch card then checkout ---> Success </p>
    <p>- Customer 2 adds 1 tv product ---> Failure becuase balance is not Enough</p>
    <p>- Customer 3 adds 2 cheese then checkout ---> Failure becuase product is out of stock (customer 1 bought 2 cheese so only 1 cheese is in stock) then another failure becuase the cart is empty</p>
    <p>- Customer 4 adds 1 biscuits ---> Failure becuase product is expired </p>

![Test Cases](tests.jpg)
   
   




