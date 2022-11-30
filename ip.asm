MACRO
INCR1 &FIRST,&SECOND
A 1,&FIRST
L 2,&SECOND
ST 1,&FIRST
MEND
PRG2        START
            USING                   *,14
            INCR1                   TEMP,RES
            SR  1,1
            INCR1                   FOUR,FIVE
FOUR        DC                      F'4'
FIVE        DC                      F'5'
RES         DS                      1F
TEMP        DC                      F'2'
            END