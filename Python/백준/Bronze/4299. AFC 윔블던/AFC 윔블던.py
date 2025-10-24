s, d = map(int, input().split())
if s < d:
    print(-1)
else:
    a = (s + d) / 2
    b = (s - d) / 2
    if a.is_integer() and b.is_integer():
        print(int(a), int(b))
    else:
        print(-1)