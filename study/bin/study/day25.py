def solution(s):
    n=int(len(s)/2)
    if len(s)%2 == 0:
        answer = s[n-1:n+1]
    else :
        answer = s[n:n+1]

    return answer

print(solution('asd'))