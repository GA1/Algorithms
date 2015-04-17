'''
Created on 16 Apr 2015

@author: dev
'''


def calc(alienNumber, alphabet1, alphabet2):
    alienInDecimal = convertAlienToDecimal(alienNumber, alphabet1)
    return convertDecimalToAlienAlphabet(alienInDecimal, alphabet2)
    
    
def convertAlienToDecimal(alienNumber, alienAlphabet):
    alphabetToDecimal = {}
    for i in range(len(alienAlphabet)):
        alphabetToDecimal[alienAlphabet[i]] = i
    decimal = 0
    base = len(alienAlphabet)
    basebase = 1
    for i in range(len(alienNumber)):
        decimal = decimal + alphabetToDecimal[alienNumber[len(alienNumber) - 1 - i]]*basebase
        basebase = basebase*base
    return decimal
    
    
def convertDecimalToAlienAlphabet(alienInDecimal, alphabet):
    base = len(alphabet)
    if alienInDecimal == 0:
        return alphabet[0] 
    rest = alienInDecimal
    result = ""
    while rest > 0:
        moduloResult = rest % base
        result = alphabet[moduloResult] + result
        rest = int((rest - moduloResult)/base)
    return result       
    
        
    
    
    