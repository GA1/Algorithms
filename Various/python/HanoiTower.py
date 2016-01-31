'''
Created on Jan 31, 2016

@author: Kamil Nguyen Van
'''


def hanoiTower(stack1, stack2, stack3, N = None):
    if N is None:
        N = stack1.size()    
    if N > 1:
        hanoiTower(stack1, stack3, stack2, N-1)
    stack3.push(stack1.pop())
    if N > 1:
        hanoiTower(stack2, stack1, stack3, N-1)

