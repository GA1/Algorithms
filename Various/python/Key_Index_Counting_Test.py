'''
Created on 24 Mar 2015

@author: Kamil Nguyen Van
'''

import unittest
from Key_Index_Counting import Key_Index_Counting

class AudienceStandingSolver_Test(unittest.TestCase):

    def test_algorithm_010(self):
        sorter = Key_Index_Counting()
        self.assertEquals([(1, 'a'), (1, 'b')], sorter.sort([(1, 'a'), (1, 'b')]))
        
    def test_algorithm_020(self):
        sorter = Key_Index_Counting()
        self.assertEquals([(1, 'b'), (2, 'a')], sorter.sort([(2, 'a'), (1, 'b')]))
        
    def test_algorithm_030(self):
        sorter = Key_Index_Counting()
        self.assertEquals([(1, 'a'), (2, 'a'), (2, 'b')], sorter.sort([(2, 'a'), (2, 'b'), (1, 'a')]))
        
    def test_algorithm_040(self):
        sorter = Key_Index_Counting()
        self.assertEquals([(1, 'a'), (1, 'b'), (2, 'a'), (2, 'b')], sorter.sort([(2, 'a'), (1, 'a'), (2, 'b'), (1, 'b')]))
        
    def test_algorithm_050(self):
        sorter = Key_Index_Counting()
        self.assertEquals([(1, 'a'), (1, 'b'), (2, 'a'), (2, 'b')], sorter.sort([(2, 'a'), (1, 'a'), (1, 'b'), (2, 'b')]))    

    def test_algorithm_060(self):
        sorter = Key_Index_Counting()
        self.assertEquals([(1, 'b'), (1, 'l'), (2, 'f'), (2, 'h'), (2, 'j'), (3, 'c'), (4, 'a'), (4, 'g'), (5, 'k'), (6, 'd'), (6, 'e'), (6, 'i')], sorter.sort([(4, 'a'), (1, 'b'), (3, 'c'), (6, 'd'), (6, 'e'), (2, 'f'), (4, 'g'), (2, 'h'), (6, 'i'), (2, 'j'), (5, 'k'), (1, 'l')]))        
        