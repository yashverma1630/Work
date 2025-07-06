#Understanding of map function
#Code for Average Height

StudentHeights = list(map(int,input("Enter Student Heights : ").split()))

print(f"List of Student Heights = {StudentHeights}")

TotalHeight = sum(StudentHeights)

print(f"Sum of Heights in list = {TotalHeight}")

NumberOfStudents = len(StudentHeights)

print(f"Total number of Students in list = {NumberOfStudents}")

AverageHeight = round(TotalHeight/NumberOfStudents)

print(f"Average Height = {AverageHeight}")

#END
