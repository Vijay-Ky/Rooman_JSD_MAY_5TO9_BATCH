import os
if os.path.exists("demofile6.txt"):
    os.remove("demofile6.txt")
else:
    print("The file does not exist")
