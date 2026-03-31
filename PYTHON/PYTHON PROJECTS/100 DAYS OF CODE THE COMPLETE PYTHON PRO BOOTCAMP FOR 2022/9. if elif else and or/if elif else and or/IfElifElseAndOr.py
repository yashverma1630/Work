weight = 85
height = 1.85

bmi = weight / (height ** 2)

# 🚨 Do not modify the values above
# Write your code below 👇

# curly braces are not compulsory. These are added for readability of the code.
if (bmi<18.5):{
    print("underweight")
}

# likewise (and) operator there is also (or) operator
elif (bmi>=18.5 and bmi<25):{
    print("normal weight")
}

elif (bmi>=25):{
    print("overweight")
}