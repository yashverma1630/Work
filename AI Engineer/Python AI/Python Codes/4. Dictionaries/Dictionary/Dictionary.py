# Dictionary
# it's Key value pairs just like hash maps in other languages.
student = {'name': 'John', 'age': 25, 'courses': ['Math', 'CompSci']}
print(f"Original Dictionary : {student}")
print(f"it will print the value of the key courses : {student['courses']}")

# both will print the same result. you can use any.
print(f"name of the student : {student['name']}")
print(f"name of the student : {student.get('name')}")

print(f"Search if there is any phone field : {student.get('phone', 'Not Found')}") # if there is value it will print the value else it will print "Not Found".
print(f"Search if there is any name field : {student.get('name', 'Not Found')}") # if there is value it will print the value else it will print "Not Found".

# you can add key and value in the dictionary :
student['phone'] = '97587XXXXX'
print(f"phone number : {student.get('phone', 'Not Found')}")

# this is to update the student dictionary.
student.update({'name': 'Yash', 'age': 22})
print(f"Student Dictionary : {student}")

# this is to delete the age key from the dictionary.
del student['age']
print(f"Dictionary Student after deleting the key age : {student}")

# pop will remove the last key from the dictionary:
phone= student.pop('phone')

print(f"Dictionary Student after poping the last element from the dictionary : {student}")
print(f"popped value of the key phone : {phone}")

# this will print keys in the dictionary student
print(f"keys in the student dictionary : {student.keys()}")

# this will print values in the dictionary student
print(f"values in the student dictionary : {student.values()}")

# this will print keys and value of the dictionary student.
print(f" studnet.items() will print keys and values of the dictionary : {student.items()}")

# to print the keys of the dictionary student using for loop:
print("For loop to print the keys in the student dictionary : ")
for key in student:
    print(key)

# for loop to print key and value in student dictionary
print("For loop to print the keys and values in the student dictionary : ")
for key, value in student.items():
    print(key, value)