"""
the key function for working with files in python
is the open() function.
the open() function two arguments; filename, and mode.
There are four modes(methods) for opening a file
"r" - read-default value.opens a file for reading,
      if the file does not exist throws an error.
"a"- append-opens a file for appending,
      if the file does not exist throws an error.
"w"- write-opens a file for writing,
     creates the file if it does not exist
"x"-create- creates the specified file,
    if the file is already exist,throws an error.

"t" - Text-default value.text mode.
"b" - Binary - Binary mode(e.g images)
"""




f = open("demofile.txt", "r")
print(f.read())













