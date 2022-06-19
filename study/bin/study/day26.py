import re


def solution(dartResult):
    answer = 0
    pre = 0
    scores = re.findall("([0-9]+)([SDT])([*#]?)", dartResult)
    for score in scores:
        now = int(score[0])
        if score[1] == "D":
            now = now ** 2
        elif score[1] == "T":
            now = now ** 3

        if score[2] == "*":
            now = now *2
            answer = answer + pre + now
        elif score[2] == "#":
            now = now * -1
            answer = answer + now
        else:
            answer = answer + now

        pre = now
    return answer

solution("1D#2S*3S")