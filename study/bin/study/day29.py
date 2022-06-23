def solution(a, b):
    answer = 0
    for i in range(a,b):
        answer = answer+i
        print(i)
    return answer

print(solution(3,5))