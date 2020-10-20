
import math
import os
import random
import re
import sys

# Complete the encryption function below.
def encryption(s):
    new = s.replace(" ", "")
    ans = math.sqrt(len(new))
    rows = math.floor(ans)
    cols = math.ceil(ans)
    
   
    for j in range(cols):
        p = ' '.join(map(lambda x: s[x::cols], range(cols)))
    return p
    
        
if __name__ == '__main__':

    s = input("Enter a sentence")

    result = encryption(s)

    print(result)
