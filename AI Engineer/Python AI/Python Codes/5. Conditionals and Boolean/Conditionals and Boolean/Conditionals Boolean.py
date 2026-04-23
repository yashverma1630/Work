# Comparisons:
# Equal : ==
# Not Equal : !=
# Greater than : >
# Less Than : <
# Greater or Equal: >=
# Less or Equal: <=
# Object Identity: is

if True:
    print("yeah its true")

language = "Java"
if language == "Python":
    print("Language is Python")
elif language == "Java":
    print("Language is Java")
else:
    print("No match")

# Boolean operators
# and
# or
# not

# and
user = "Admin"
logged_in = True
# to execute the if statement using and operator then both values should be True.
if user == "Admin" and logged_in:
    print("Admin Page")
else:
    print("Bad Creds")

# or
# similarly you can use (or) keyword: to execute the if block at least one value should be true
userName = "Yash"
phoneNumber = "9781088503"

if userName == "Yash" or phoneNumber =="xxx-xxx-xxx":
    print("User Logged in !!!")
else:
    print("User not logged in !!!")

# not
# not will basically switch the false to true and true to false.
alreadyLoggedIn = False;
if not alreadyLoggedIn:
    print("please log in")
else:
    print("welcome")

# is : it will compare the values along with their address in or id. the id should also match

a = [1, 2, 3]
b=a
# now a and b both will have same id.
print(id(a))
print(id(b))
print(id(a)==id(b))

if a is b :
    print("yeah a is b.")
else:
    print("no a is not b. their reference is different. (their ids are different)")
    # to test this else block simply type a = [1, 2, 3] and b = [1, 2, 3]

# Values that are false by default in python
# False
# None
# Zero of any numeric type. and if any other number it will be true
# any empty sequence. for Example, '', (), []
# any empty mapping, for example, {}

condition = 'Test'

if condition:
    print("Condtion is True")
else:
    print("Evaluated to False")
