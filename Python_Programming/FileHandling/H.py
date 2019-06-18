f = open("demofile.txt", "w")
f.write("I have deleted the content! wrote newly!")
f.close()

f = open("demofile.txt", "r")
print(f.read())
