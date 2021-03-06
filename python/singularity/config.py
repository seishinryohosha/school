##############################################################################
##                               Config                                     ##
##############################################################################

## Custom theme 'enabled'?
_state = 'disabled'


if _state == 'enabled':
## Fentsergröße
    ROOTSIZE='700x200'

## Spieltitel
    TITLE='Chucaak-a-Luck'

## Segmenttitel
    SEGMENTT1='Konto'
    SEGMENTT2='Zahl'
    SEGMENTT3='Wurfel' 

## Imagepath
    PATH='img/'
    IMAGEPREFIX='w'
    IMAGESUFFIX='.gif'

## Buttontext
    BUTTONBET='Einsatz zahlen'
    BUTTONPAY='Gewinn auszahlen'
    BUTTONDICE='Würfel werfen'

## Fonts
    FONT='Arial'
    FONTSIZET=33
    FONTSIZEL=16
    FONTSIZEB=17
    FONTSIZEE=16

## Label Colors
    BGT='gray'
    FGT='white'
    BGL='gray'
    FGL='white'

## Input(Radiobuttons) Colors
    BGR='gray'
    FGR='white'

## Button Colors
    BGB='gray'
    FGB='white'

## Frame Colors
    BGF='gray'

## Layout padding
    PADX='5'
    PADY='5'

else:
## Use Systemtheme
    ROOTSIZE='700x300'
    TITLE='Chuck-a-Luck'
    SEGMENTT1='Konto'
    SEGMENTT2='Zahl'
    SEGMENTT3='Wurfel' 
    PATH='img/'
    IMAGEPREFIX='w'
    IMAGESUFFIX='.gif'
    BUTTONBET='Einsatz zahlen'
    BUTTONPAY='Gewinn auszahlen'
    BUTTONDICE='Würfel werfen'
    FONT='Arial'
    FONTSIZET=33
    FONTSIZEL=16
    FONTSIZEB=17
    FONTSIZEE=6
    BGT=None
    FGT=None
    BGL=None
    FGL=None
    BGR=None
    FGR=None
    BGB=None
    FGB=None
    BGF=None
    PADX=None
    PADY=None
