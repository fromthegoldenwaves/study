def solution(strings, n):
    for i in range(len(strings)-1):
        for j in range(i, len(strings)):
            if (strings[i][n]>strings[j][n]):
                tmpStr = strings[i]
                strings[i] = strings[j]
                strings[j] = tmpStr
            elif (strings[i][n] == strings[j][n]):
                if (strings[i]>strings[j]):
                    tmpStr = strings[i]
                    strings[i] = strings[j]
                    strings[j] = tmpStr
    
    return strings

print(solution(["sun", "bed", "car"],1))

print("a">"b")