
<h1 align='center'>e-commerce system for Fawry task</h1>


## 📙 About <a name = "about"></a>
A simple Java-based e-commerce system with support for perishable and shippable products, cart management, and checkout simulation.


## 📃 Assumption <a name = "sys"></a>
1- Shipping Fees depends on weight (10 * total weight of shippable products in the cart).

2- All Weights are in Kg

3- My Main class define only 4 products for testing.
    - Cheese product which requires shipping and has expiry date and has price=50, quantity=3, expiry date=1-8-2025 and weight=0.5kg
    - TV prouduct which requires shipping and has price=5000, quantity=1 and weight=10kg
    - Mobile Scratch Card product which has price=20 and quantity=10
    - Biscuits prouduct which has expiry date and has price=20, quantity=5 and expiry date=1-7-2024 (expired)
    

## 🏁 Getting Started 

This is a list of needed instructions to run the project locally
### Installation 

1. **_Clone the repository_**

```bash
$ git clone [https://github.com/EmanElbedwihy/.git]
```

2. **_Install Extension Pack for Java in VS Code_**
   


### Running 

1. **Run the following commands in terminal_**

```bash
$ javac e_commerce/*.java
$ java e_commerce.Main
```



## 📃 Test Cases 

![Test Cases](tests.png)
   
   




