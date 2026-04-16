#LIST

courses = ["Maths", "Physics", "Chemistry", "Biology"] # Courses list
courses_2 = ["History", "Geography", "Economics"] # Another courses list

print(f"List of Courses : {courses}")

courses.append("CompSci") # it will add the element at the last of the list.
courses.insert(2, "Punjabi") # it will insert the element at perticular index. and shift the rest of the elements

print(f"New List of Courses after using append and insert functions : {courses}")

courses.insert(0, courses_2) # it will insert the entire list at the perticular index of the list.

print(f"list of courses after inserting the list at 0th index : {courses}")

# another list
fruits = ["apple", "banana", "cherry"]
fruits_2 = ["pineapple", "orange"]
fruits.extend(fruits_2) # it will add elements of 2nd list to the initial list.

print(f"List of fruits after extending fruits with fruits2 : {fruits}")

print(f"fruit at 0th index: {fruits[0]}") # it will print fruit at 0th index.
print(f"fruits starting from index 0 upto index 1 (not including 2 index) : {fruits[0:2]}") # it will print fruits at 0th index and 1st index
print(f"printing last 2 elements in fruits list : {fruits[-2:]}")

print(f"Original List: {fruits}")
fruits.remove(fruits[0])
print(f"List after removing using index: {fruits}")

fruits.remove("pineapple")
print(f"List after removing using value: {fruits}")

fruits.pop() # it will remove last element from the list.. we can use it as stack or queue
print(f"List after poping the element out of the list: {fruits}")
############################################################################################

wwe = ["John Cena", "Undertaker", "The Rock", "Nikki Bella", "Randy Orton", "Brock Lesner", "Roman Reigns"]
print(f"Original WWE List: {wwe}")
wwe.reverse() # to reverse the order of the list
print(f"WWE List after reverse: {wwe}")

wwe.sort() # to sort the list in ascending order
print(f"WWE List after sort: {wwe}")

wwe.sort(reverse=True) # to sort the list in descending order
print(f"WWE List in descending order sort: {wwe}")
########################################################

crazyNumbers = [1, 4, 7, 5, 9, 2, 10, 3]
print(f"Original Crazy Numbers: {crazyNumbers}")
print(f"Max in wwe : {max(crazyNumbers)}") # to find the maximum value in the list
print(f"Min in wwe : {min(crazyNumbers)}") # to find the minimum value in the list
print(f"Sum in wwe : {sum(crazyNumbers)}") # to find the sum of all the values in the list

##################################################

print(f"Original wwe List: {wwe}")
print(f"John cena at which index? {wwe.index('Nikki Bella')}") # to find the index of the particular value in the list.

######################################################

print(f"is Nikki Bella in the list ? {'Nikki Bella' in wwe}") # to check if the value is in the list. if it exists it will print True, else False

##########################################################

# for loop to print the elements in the list
for superstars in wwe:
    print(f"superstar : {superstars}")

# for loop to print the elements in the list with their indexes.
for index, superstars in enumerate(wwe):
    print(f"superstar : {index, superstars}")

##############################################################

snacks= ["Kurkure", "Lays", "Rite Bite", "Bakers Dozen", "Super You", "Milk Shake"]

print(f"Original Snacks List : {snacks}")

snacks_str= ", ".join(snacks) # comma separated string. you can change , with any other special character.
print(f"snacks list converted to string : {snacks_str}")

############################################################################

newList = snacks_str.split(", ") # it is used to convert coma separated string to list.
print(f"comma separated snacks string is converted back to List using split function : {newList}")

####################################################################################################
#Tuple
# Tuples are immutable.
someTuple = ("Aadhar Card", "Date of Birth", "Pan Card", "Debit Card")

# someTuple.append("bla bla") # this will show an error becuase tuples are immutable.

#################################################################################################

#SET
# Sets is unordered list of data with no duplicates.
# you can't add duplicate values in sets.

cs_courses = {'History', 'Math', 'Physics', 'CompSci'}
art_courses = {'History', 'Math', 'Art', 'Design'}

print(f"Original CompSci Courses : {cs_courses}")
print(f"Original Arts Courses : {art_courses}")

# it will print common values in 2 sets.
print(f"intersection is used to print the common elements from set : {cs_courses.intersection(art_courses)}")

# it will print values from the 1st set which are not in common with 2nd set.
print(f"difference is used to print the values that are not common in both the sets : {cs_courses.difference(art_courses)}")

# it will print all the values of both the sets but duplicates will be avoided.
print(f"union is used to print all the values of both the sets but duplicates will be avoided : {cs_courses.union(art_courses)}")

##########################################################################################################

# Ways to create Empty : List, Tuple and Set

# Empty Lists
empty_list=[]
empty_list=list()

# Empty Tuples
empty_tuple = ()
empty_tuple=tuple()

# Empty Sets
empty_set={}
empty_set = set()