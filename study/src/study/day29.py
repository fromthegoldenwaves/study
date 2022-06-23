def solution(a, b):
    answer = 0
    start = b if a>b else a
    end =  a if a>b else b
    for i in range(start,end+1):
        answer = answer+i
    return answer
