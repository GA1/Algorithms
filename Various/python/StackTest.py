'''
Created on Jan 31, 2016

@author: Kamil Nguyen Van
'''

import unittest
from Stack import Stack


class StackTest(unittest.TestCase):
    
    def testSizeWhenEmpty(self):
        stack = Stack()        
        self.assertEquals(0, stack.size())
         
    def testIsEmptyWhenEmpty(self):
        stack = Stack()        
        self.assertTrue(stack.isEmpty())
        
    def testSizeWhenHas1Item(self):
        stack = Stack()   
        stack.push(7)     
        self.assertEquals(1, stack.size())
         
    def testIsEmptyWhenHas1Item(self):
        stack = Stack()  
        stack.push(2)      
        self.assertFalse(stack.isEmpty())

    def testSizeWhenHas2Item(self):
        stack = Stack()   
        stack.push(7)
        stack.push(13)     
        self.assertEquals(2, stack.size())
         
    def testIsEmptyWhenHas2Item(self):
        stack = Stack()  
        stack.push(2)
        stack.push(71)      
        self.assertFalse(stack.isEmpty())
        
    def testPushPop(self):
        stack = Stack()  
        stack.push(71)      
        self.assertEquals(71, stack.pop())
        
    def testPopWhenHasTwoItems(self):
        stack = Stack()  
        stack.push(71)
        stack.push(79)            
        self.assertEquals(79, stack.pop())
        
        
        
        