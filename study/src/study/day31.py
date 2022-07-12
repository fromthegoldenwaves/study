def solution(s):
    s = s.lower()
    
    countP = 0
    countY = 0
    
    for tmp in s:
        if (tmp == "p"):
            countP = countP + 1
        elif (tmp == "y"):
            countY = countY + 1

    return countY==countP

print(solution("QaaAS"))