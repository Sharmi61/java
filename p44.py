#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      sharmi
#
# Created:     08-08-2018
# Copyright:   (c) sharmi 2018
# Licence:     <your licence>
#-------------------------------------------------------------------------------
s=str(raw_input())
l=list(s)
r=""
r=r+l[0]
i=3
while(i<len(l)):
    r=r+l[i]
    i=i+3
print r