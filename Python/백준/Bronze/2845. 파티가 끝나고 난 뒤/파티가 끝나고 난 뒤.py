def main():
    L, P = map(int, input().split())
    news = list(map(int, input().split()))
    total = L * P
    result = [x - total for x in news]
    print(*result)
if __name__ == "__main__":
    main()