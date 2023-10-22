import random


def guess(x):
    random_num = random.randint(1, x)
    guess = 0
    while guess != random_num:
        guess = int(input(f"enter number b/w 1 and {x} "))

        if guess < random_num:
            print("too low")
        elif guess > random_num:
            print("too high")
    print(f"congrats ")


guess(10)
