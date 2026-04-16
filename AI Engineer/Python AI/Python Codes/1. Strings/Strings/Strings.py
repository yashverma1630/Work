message = "Hello World"

print(message)

print(len(message))

print(message[0:5])
print(message[6:])

print(message.lower())
print(message.upper())

print(message.count("l"))
print(message.find("l"))

new_message = message.replace("world", "universe")
print(new_message)

greeting = "Hello"
name = "Michael"

hGreeting = greeting +", " + name
print(hGreeting)

print(dir(greeting))

print(help(str))
