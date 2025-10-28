import sys
for line in sys.stdin:
    if line.strip():
        N, S = map(int, line.split())
        print(S // (N + 1))