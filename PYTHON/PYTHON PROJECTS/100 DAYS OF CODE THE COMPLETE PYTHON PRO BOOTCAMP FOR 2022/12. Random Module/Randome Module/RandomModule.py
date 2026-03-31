#So, we have imported random module. you can make your own random
import random
import my_module

# to use it we have to type:
# random.randint(a, b). It will generate random numbers between a and b including a and b.

random_integer=random.randint(1, 10)

print(f"random integer : {random_integer}")
print(f"my favourite number is {my_module.my_favorite_number}")

random_number_0_to_1=random.random()
print(f"Random float number from 0 to 1 only : {random_number_0_to_1}") # it will print random integers from 0 to 1 (1 not included). but you can multiply it by 10 if you want numbers from 1 to 10 (10 not inclusive)

random_float = random.uniform(1, 10)
print(f"Random Float : {random_float}")

random_heads_or_tails = random.randint(0, 1)
if (random_heads_or_tails == 0):
    print("Heads")
else:
    print("Tails")

