# 🚨 Don't change the code below 👇
student_heights = input("Input a list of student heights ").split()
for n in range(0, len(student_heights)):
  student_heights[n] = int(student_heights[n])
# 🚨 Don't change the code above 👆


#Write your code below this row 👇

items = 0
sum_of_height = 0

for i in student_heights:
    sum_of_height += i
    items += 1

average_height = sum_of_height/items

print(round(average_height))


