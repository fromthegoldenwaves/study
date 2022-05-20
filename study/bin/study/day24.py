def solution(n, arr1, arr2):
    answer = []
    map1 = toBinary(n, arr1)
    map2 = toBinary(n, arr2)

    for i in range(n):
        tmp1 = list(map1[i])
        tmp2 = list(map2[i])

        strTmp = ""
        for j in range(n):
            if tmp1[j]=='0' and tmp2[j]=='0':
                strTmp = strTmp + ' '
            else:
                strTmp = strTmp + '#'
        answer.append(strTmp)
    return answer

def toBinary(n, map):
    result = []
    for i in range(n):
        formatStr = "{:0" + str(n)+"b}"
        tmp = formatStr.format(map[i])
        result.append(tmp)
    return result

toBinary(5, [9, 20, 28, 18, 11])
solution(5,[9, 20, 28, 18, 11],[30, 1, 21, 17, 28])