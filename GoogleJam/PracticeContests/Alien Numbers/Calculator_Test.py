'''
Created on 24 Mar 2015

@author: Kamil Nguyen Van
'''

import unittest
from Calculator import convertAlienToDecimal
from Calculator import convertDecimalToAlienAlphabet
from Calculator import calc

class Calculator_Test(unittest.TestCase):


    def test_010(self):
        self.assertEquals(0, convertAlienToDecimal("a", "a"))
        
    def test_020(self):
        self.assertEquals(0, convertAlienToDecimal("a", "ab"))
        
    def test_030(self):
        self.assertEquals(1, convertAlienToDecimal("b", "ab"))
        
    def test_040(self):
        self.assertEquals(2, convertAlienToDecimal("ba", "ab"))
        
    def test_050(self):
        self.assertEquals(3, convertAlienToDecimal("bb", "ab"))
        
    def test_060(self):
        self.assertEquals(0, convertAlienToDecimal("a", "abc"))
        
    def test_070(self):
        self.assertEquals(1, convertAlienToDecimal("b", "abc"))
        
    def test_080(self):
        self.assertEquals(2, convertAlienToDecimal("c", "abc"))
        
    def test_090(self):
        self.assertEquals(3, convertAlienToDecimal("ba", "abc"))
        
    def test_100(self):
        self.assertEquals(4, convertAlienToDecimal("bb", "abc"))
        
    def test_110(self):
        self.assertEquals(5, convertAlienToDecimal("bc", "abc"))
        
    def test_120(self):
        self.assertEquals(6, convertAlienToDecimal("ca", "abc"))
        
        
        
    def test_130(self):
        self.assertEquals("a", convertDecimalToAlienAlphabet(0, "a"))
        
    def test_140(self):
        self.assertEquals("a", convertDecimalToAlienAlphabet(0, "ab"))
        
    def test_150(self):
        self.assertEquals("b", convertDecimalToAlienAlphabet(1, "ab"))
        
    def test_160(self):
        self.assertEquals("ba", convertDecimalToAlienAlphabet(2, "ab"))
       
    def test_170(self):
        self.assertEquals("bb", convertDecimalToAlienAlphabet(3, "ab"))
        
    def test_180(self):
        self.assertEquals("baa", convertDecimalToAlienAlphabet(4, "ab"))
        
    def test_190(self):
        self.assertEquals("bab", convertDecimalToAlienAlphabet(5, "ab"))
        
        
    def test_200(self):
        self.assertEquals("Foo", calc("9", "0123456789", "oF8"))
        
    def test_210(self):
        self.assertEquals("9", calc("Foo", "oF8", "0123456789"))
    
    def test_220(self):
        self.assertEquals("10011", calc("13", "0123456789abcdef", "01"))
    
    def test_230(self):
        self.assertEquals("JAM!", calc("CODE", "O!CDE?", "A?JM!."))
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        