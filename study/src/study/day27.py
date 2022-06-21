def solution(arr):
    answer = []
    for n in range(len(arr)):
        if n == 0:
            answer.append(arr[n])
        else:
            if(arr[n-1] != arr[n]):
                answer.append(arr[n])
    return answer

test = [1,1,3,3,0,1,1]
print(solution(test))