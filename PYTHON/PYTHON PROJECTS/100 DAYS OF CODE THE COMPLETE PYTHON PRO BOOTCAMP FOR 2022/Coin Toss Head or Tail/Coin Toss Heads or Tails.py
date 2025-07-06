#Write your code below this line 👇
#Hint: Remember to import the random module first. 🎲

import random

random_side = random.randint(0, 1)
if random_side == 1:
  print("Heads")
elif random_side == 0:
  print("Tails")
