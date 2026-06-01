from itertools import permutations

def solution(k, dungeons):
    answer = 0

    for order in permutations(dungeons):
        hp = k
        count = 0

        for need, cost in order:
            if hp < need:
                break
            hp -= cost
            count += 1

        answer = max(answer, count)

    return answer