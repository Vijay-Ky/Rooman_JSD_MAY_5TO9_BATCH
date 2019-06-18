class Person6:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        
    def myfunc(self):
        print("Hi my name is "+ self.name)
        
p1 = Person6("John", 36)
p2 = Person6("vijay", 28)

del p1
del p2

print(p1)
print(p2)
