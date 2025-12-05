while True:
    w = float(input())
    if w < 0:
        break
    moon = w * 0.167
    print(f"Objects weighing {w:.2f} on Earth will weigh {moon:.2f} on the moon.")