class Person5:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        
    def myfunc(self):
        print("Hi my name is "+ self.name)
        
p1 = Person5("John", 36)
p2 = Person5("vijay", 28)

del p1.age
del p2.age

print(p1.age)
print(p2.age)
