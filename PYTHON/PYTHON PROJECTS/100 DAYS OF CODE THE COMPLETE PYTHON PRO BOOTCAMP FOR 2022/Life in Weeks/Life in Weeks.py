# 🚨 Don't change the code below 👇
#to take input from user.
age = input("What is your current age? ")
# 🚨 Don't change the code above 👆

#Write your code below this line 👇
#convert age from string to integer type to make calculations.
age=int(age)
#to find remaining years
years=90-age
#to find remaining days
x=years*365
#to find remaining weeks
y=years*52
#to find remaining months
z=years*12
#print the output using f-String property
print(f"You have {x} days, {y} weeks, and {z} months left.")



