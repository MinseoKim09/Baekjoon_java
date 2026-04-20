def solution(s):
    count = 0

    for ch in s:
        if ch == '(':
            count += 1
        else:
            if count == 0:
                return False
            count -= 1

    return count == 0