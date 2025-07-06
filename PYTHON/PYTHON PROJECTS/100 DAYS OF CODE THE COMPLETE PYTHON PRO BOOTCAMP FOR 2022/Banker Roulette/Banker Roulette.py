import random
namestring = input("Enter Names :")
names = namestring.split(", ")
randn = random.choice(names)
print(f"{randn} will pay the bill!")
