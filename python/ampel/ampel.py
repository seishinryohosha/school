class Ampel(object):
    def __init__(self):
        self.lampeRot = False
        self.lampeGelb = False
        self.lampeGruen = False

    def setLampen(self, startwertLampeRot=True, startwertLampeGelb=False, startwertLampeGruen=False):
        self.lampeRot = startwertLampeRot
        self.lampeGelb = startwertLampeGelb
        self.lampeGruen = startwertLampeGruen

    def gibAus(self) -> 'Status der Lichter':
            return (self.lampeRot,self.lampeGelb,self.lampeGruen)

    def schalten(self):
        if (self.lampeRot, self.lampeGelb, self.lampeGruen) == (True, False, False):
            self.lampeRot = True
            self.lampeGelb = True
            self.lampeGruen = False
        elif (self.lampeRot, self.lampeGelb, self.lampeGruen) == (True, True, False):
            self.lampeRot = False
            self.lampeGelb = False
            self.lampeGruen = True
        elif (self.lampeRot, self.lampeGelb, self.lampeGruen) == (False, False, True):
            self.lampRot = False
            self.lampeGelb = True
            self.lampeGruen = False
        elif (self.lampeRot, self.lampeGelb, self.lampeGruen) == (False, True, False):
            self.lampeRot = True
            self.lampeGelb = False
            self.lampeGruen = False
        else:
            print("Malfunctioning")
