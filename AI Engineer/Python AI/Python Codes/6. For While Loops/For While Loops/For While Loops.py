nums = [1, 2, 3, 4, 5]
# break and continue in loop.
# break is used to get out of the loop
# continue will skip the next part of the code inside for loop and keep on iterating the values until the for loop ends
for num in nums:
    print(num)

for num in nums:
    if num==3:
        print("Found!")
        break # you can use continue to print rest of the nums that are 4, 5.
    print(num)

for num in nums:
    for letter in 'abc':
        print(num, letter)

for i in range(10):
    print(i)
    # this will print values from 0 to 9. not the 10 it doesn't include the last number.

# So, if you want to print numbers from 1 to 10 you can start the range from 1, 11 (excluded).
for i in range (1, 11):
    print(i)

#######################################################

# While loop

x = 0
while x <= 10:
    print(x)
    x += 1

# also you can use while True for infinite loop and use break statement to get out of it.
# there is no do while loop in python