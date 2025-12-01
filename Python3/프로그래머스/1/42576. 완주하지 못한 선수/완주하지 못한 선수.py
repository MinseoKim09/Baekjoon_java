def solution(p, c): 
    d = {}
    [d.update({x: d.get(x,0)+1}) for x in p]
    [d.update({x: d.get(x,0)-1}) for x in c]
    return next(k for k,v in d.items() if v>0)
