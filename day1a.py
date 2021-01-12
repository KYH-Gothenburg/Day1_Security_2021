import string
import random

def main():
    message = 'President Donald Trump is leaving America in a vortex of violence, sickness and death and more internally estranged than it has been for 150 years.'
    keys = [character for character in string.ascii_uppercase]
    values = [character for character in string.ascii_uppercase]
    random.shuffle(values)
    keys = dict(zip(keys, values))
    for letter in message:
        if letter.upper() in keys:
            print(keys[letter.upper()], end='')
        else:
            print(letter, end='')
    print()

if __name__ == '__main__':
    main()
