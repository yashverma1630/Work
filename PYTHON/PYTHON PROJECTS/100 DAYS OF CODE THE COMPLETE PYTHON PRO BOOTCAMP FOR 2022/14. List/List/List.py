import random
fruits =["apple", "banana", "cherry"]

fruits.append("orange")
print(f"fruits after appending orange: {fruits}")

fruits.extend(["pineapple","strawberry"])
print(f"Fruits after extending list with list: {fruits}")

print(f"the fruit and 3rd position: {fruits[2]}")
print(f"the fruit at last position: {fruits[-1]}")

fruits[0]="Mango"
print(f"the fruit at the 1st position is changed to Mango: {fruits}")

# there are a lot of functions that you can use on list. and you can search it on google and study about it.

print(f"latest list: {fruits}")

print(f"Let's print the random fruits : {random.choice(fruits)}")

# also you can have Nested lists or we can say lists inside lists
fruits = ["apple", "banana", "cherry"]
vegetables = ["potatoes","cabbage", "Tomato"]

fruitsVegetableBucket = [fruits, vegetables]

print(f"List of Fruits and Vegetables in the Bucket: {fruitsVegetableBucket}") # this is the example of nested lists
