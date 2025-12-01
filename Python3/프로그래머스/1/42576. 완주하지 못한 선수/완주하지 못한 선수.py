def solution(p, c):
    hmap = {}
    th = 0
    for x in p:
        hx = hash(x)
        th += hx
        hmap[hx] = x
    for y in c:
        th -= hash(y)
    return hmap[th]