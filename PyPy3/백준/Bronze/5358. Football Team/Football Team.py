import sys
for line in sys.stdin:
    new_line = ""
    for ch in line:
        if ch == 'i':
            new_line += 'e'
        elif ch == 'e':
            new_line += 'i'
        elif ch == 'I':
            new_line += 'E'
        elif ch == 'E':
            new_line += 'I'
        else:
            new_line += ch
    print(new_line, end="")
