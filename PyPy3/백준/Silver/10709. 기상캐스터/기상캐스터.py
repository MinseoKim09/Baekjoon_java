H, W = map(int, input().split())
sky = [input().strip() for _ in range(H)]

for i in range(H):
    time = -1
    for j in range(W):
        if sky[i][j] == 'c':
            time = 0
        else:
            if time != -1:
                time += 1
        print(time, end=' ')
    print()
