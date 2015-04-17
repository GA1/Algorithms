'''
Created on 24 Mar 2015

@author: Kamil Nguyen Van
'''

import unittest
from DecBin import convert

class Calculator_Test(unittest.TestCase):

    def test_010(self):
        self.assertEquals("0", convert(0))

    def test_020(self):
        self.assertEquals("1", convert(1))
    
    def test_030(self):
        self.assertEquals("10", convert(2))
        
    def test_040(self):
        self.assertEquals("11", convert(3))
        
    def test_050(self):
        self.assertEquals("100", convert(4))
    
    def test_060(self):
        self.assertEquals("101", convert(5))
        
    def test_070(self):
        self.assertEquals("111", convert(7))