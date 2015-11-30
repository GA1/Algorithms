'''
Created on 24 Mar 2015

@author: dev
'''

class Key_Index_Counting:

    def sort(self, toSort, N=10):
        countings = [0]*(N+1)
        for t in toSort:
            countings[t[0]] = countings[t[0]] + 1
        for i in range(1, N+1):
            countings [i] = countings [i-1] + countings [i]
        result = [0]*len(toSort)
        for t in toSort:
            result[countings[t[0]-1]] = t
            countings[t[0]-1] = countings[t[0]-1]+1
        return result
    
    
     

    
     

