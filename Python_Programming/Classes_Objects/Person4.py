class Person4:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        
    def myfunc(self):
        print("Hi my name is "+ self.name)
            
p1 = Person4("John", 36)
p2 = Person4("vijay", 28)

p1.age = 40
p2.age = 30
print(p1.age)
print(p2.age)

