'''
Created on Jan 31, 2016

@author: Kamil Nguyen Van
'''

import unittest
from Stack import Stack
from HanoiTowers import hanoiTowers


class HanoiTowersTest(unittest.TestCase):
    
    def testHanoiTowersOfHeight1(self):
        stack1 = Stack()
        stack1.push(7);
        stack2 = Stack()
        stack3 = Stack()
        hanoiTowers(stack1, stack2, stack3)
        self.assertEquals(0, stack1.size())
        self.assertEquals(0, stack2.size())
        self.assertEquals(1, stack3.size())
        self.assertEquals(7, stack3.peek())
                
    def testHanoiTowersOfHeight2(self):
        stack1 = Stack()
        stack1.push(7);
        stack1.push(5);
        stack2 = Stack()
        stack3 = Stack()
        hanoiTowers(stack1, stack2, stack3)
        self.assertEquals(0, stack1.size())
        self.assertEquals(0, stack2.size())
        self.assertEquals(2, stack3.size())
        self.assertEquals(5, stack3.pop())
        self.assertEquals(7, stack3.pop())
        
    def testHanoiTowersOfHeight3(self):
        stack1 = Stack()
        stack1.push(11);
        stack1.push(7);
        stack1.push(5);
        stack2 = Stack()
        stack3 = Stack()
        hanoiTowers(stack1, stack2, stack3)
        self.assertEquals(0, stack1.size())
        self.assertEquals(0, stack2.size())
        self.assertEquals(3, stack3.size())
        self.assertEquals(5, stack3.pop())
        self.assertEquals(7, stack3.pop())
        self.assertEquals(11, stack3.pop())
                
    def testHanoiTowersOfHeight4(self):
        stack1 = Stack()
        stack1.push(17);
        stack1.push(11);
        stack1.push(7);
        stack1.push(5);
        stack2 = Stack()
        stack3 = Stack()
        hanoiTowers(stack1, stack2, stack3)
        self.assertEquals(0, stack1.size())
        self.assertEquals(0, stack2.size())
        self.assertEquals(4, stack3.size())
        self.assertEquals(5, stack3.pop())
        self.assertEquals(7, stack3.pop())
        self.assertEquals(11, stack3.pop())
        self.assertEquals(17, stack3.pop())
                
         