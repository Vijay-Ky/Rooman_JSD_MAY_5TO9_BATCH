import os
try:
    os.remove("demofile6.txt")
except:
    print("The file does not exist")
