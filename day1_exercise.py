from collections import Counter

def main():
    message = open('cipher.txt').read()
    count = Counter(message)
    words = message.split()
    words = [word.replace(',', '') for word in words]
    words = [word.replace('.', '') for word in words]
    word_count = Counter(words)
    one_letter_words = [word for word in words if len(word) == 1]
    two_letter_words = [word for word in words if len(word) == 2]
    three_letter_words = [word for word in words if len(word) == 3]

    print(one_letter_words)
    print(two_letter_words)
    print(three_letter_words)
    



if __name__ == '__main__':
    main()
