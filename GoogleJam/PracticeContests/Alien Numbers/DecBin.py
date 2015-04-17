

def convert(numberDec):
    if numberDec == 0:
        return "0"
    rest = numberDec
    result = ""
    while rest > 0:
        moduloResult = rest % 2
        result = str(moduloResult) + result
        rest = int((rest - moduloResult)/2)
    return result       
    
        
    
    
    