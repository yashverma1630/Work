# pass keyword is used to create empty function. that means we don't have to do anything with it for now but might be in the future.
def first_func():
    pass

print(first_func()) # it will print output None. which means we are not returning anything in the function as we have used the pass keyword.

def hello_func():
    print('Hello Function!')

hello_func()
hello_func()
hello_func()
hello_func()

def bye_func():
    return "Bye Function!"

print(bye_func()) # for the function those return something instead of printing. we have to use print statement to get the result of the value they return.
print(bye_func().upper()) # you can use pre defined functions on the return type of functions. for the bye_func function the return type String.

def greet_func(greeting, name="Yash"):
    return "{} {} It's a greeting Function!".format(greeting, name)

print (greet_func("hi"))
print(greet_func("Hola", "James"))
print(greet_func("wassup", name="Spider-Man"))

def student_info(*args, **kwargs):
    print(args) # it will print tuple having args. args means arguments
    print(kwargs) # it will print dictionary key word and values. kwargs means key words and arguments

courses = ['Math', 'Art']
info = {'name': 'Yash', 'age': '22'}

student_info(*courses, **info)