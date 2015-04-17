
from Calculator import calc 

outputFile = open('output.txt','w')


with open("A-large-practice.in") as f:
    
    content = f.readlines()
    for i in range(1, len(content)):
        line = content[i]
        splitted = line.split()
        numberInAlien = splitted[0]
        sourceAlphabet = splitted[1]
        targetAlphabet = splitted[2]
        outputFile.write("Case #" + str(i) + ": " + calc(numberInAlien, sourceAlphabet, targetAlphabet) + "\n")

outputFile.close()