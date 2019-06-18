class Person2:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        
    def myfunc(self):
        print("Hi my name is "+ self.name)
        
p1 = Person2("John", 36)
p2 = Person2("vijay", 28)

p1.myfunc()
p2.myfunc()
