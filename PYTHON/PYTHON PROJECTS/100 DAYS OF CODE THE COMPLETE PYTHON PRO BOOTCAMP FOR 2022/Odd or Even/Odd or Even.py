#Write a program that works out whether if a given number is an odd or even number.
# 🚨 Don't change the code below 👇
number = int(input("Which number do you want to check? "))
# 🚨 Don't change the code above 👆

#Write your code below this line 👇

r = number%2
if r==0:
    print("This is an even number.")
else:
    print("This is an odd number.")
