#!/usr/bin/python
###############################################################################
##                                 Imports                                   ##
###############################################################################
from roboMan import RoboMan

###############################################################################
##                                   Init                                    ##
###############################################################################
rm = RoboMan()

for i in range(12):
    states = rm.getStates()
    print(states)
    state = rm.robos[1].getState()
    rm.switchRobos()
