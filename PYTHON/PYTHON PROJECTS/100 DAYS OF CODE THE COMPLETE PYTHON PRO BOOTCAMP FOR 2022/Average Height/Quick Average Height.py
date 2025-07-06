# 🚨 Don't change the code below 👇
student_heights = input("Input a list of student heights ").split()
for n in range(0, len(student_heights)):
  student_heights[n] = int(student_heights[n])
# 🚨 Don't change the code above 👆


#Write your code below this row 👇

TotalHeight = sum(student_heights)
NumberOfStudents = len(student_heights)
AverageHeight = TotalHeight / NumberOfStudents

print(round(AverageHeight))
#End
