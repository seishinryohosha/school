'''
File: robos.py
Author: Rieger Anton
Description: Ampelklassen
'''
class AutoRobo(object):
    """Lenkt die Lampen"""

    def __init__(self, initstate):
        self.state = initstate

    def getState(self) -> 'as string (rot/rotgelb/gelb/gruen)':
        return self.state

    def switch(self):
        if self.state == 'rot':
            self.state = 'rotgelb'
        elif self.state == 'rotgelb':
            self.state = 'gruen'
        elif self.state == 'gruen':
            self.state = 'gelb'
        elif self.state == 'gelb':
            self.state = 'rot'

class PedesRobo(object):
    """Lenkt die Lampen"""

    def __init__(self, initstate):
        self.state = initstate

    def getState(self) -> 'as string (rot/gruen)':
        return self.state

    def switch(self):
        if self.state == 'rot':
            self.state = 'gruen'
        elif self.state == 'gruen':
            self.state = 'rot'
