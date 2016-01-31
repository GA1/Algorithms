'''
Created on Jan 31, 2016

@author: Kamil Nguyen Van
'''


def hanoiTowers(origin, buffer, to, N = None):
    if N is None:
        N = origin.size()    
    if N > 1:
        hanoiTowers(origin, to, buffer, N-1)
    to.push(origin.pop())
    if N > 1:
        hanoiTowers(buffer, origin, to, N-1)

