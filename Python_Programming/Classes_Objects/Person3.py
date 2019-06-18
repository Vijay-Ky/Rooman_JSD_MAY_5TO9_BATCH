class Person3:
    def __init__(mysillyobject, name, age):
        mysillyobject.name = name
        mysillyobject.age = age

    def myfunc(abc):
        print("Hello my name is "+ abc.name)
p1 = Person3("John", 36)
p2 = Person3("Arya", 20)

p1.myfunc()
p2.myfunc()
