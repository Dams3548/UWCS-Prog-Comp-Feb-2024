daysAvailable = []
daysEveryoneAvailable = []
for i in range(1000):
    n = int(input())

    for j in range(n):
            counter = 0
            m = input()
            for char in m:
                counter += 1
                if char == 'X':
                    daysAvailable.extend(counter)

    for l in range(30):

        if daysAvailable.count(l) == n:
            daysEveryoneAvailable.extend(l)

    print(daysEveryoneAvailable)
