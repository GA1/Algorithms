'''
Created on Jan 31, 2016

@author: Kamil Nguyen Van
'''

class Stack:
    
     def __init__(self):
         self.items = []

     def isEmpty(self):
         return self.size() == 0

     def push(self, item):
         self.items.append(item)

     def pop(self):
         return self.items.pop()

     def peek(self):
         return self.items[len(self.items) - 1]

     def size(self):
         return len(self.items)
