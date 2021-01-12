import binascii

def main():
    name = "Joakim"
    print(name)
    as_bytes = name.encode()
    print(as_bytes)

    key = "secret".encode()

    result = bytearray();
    for i in range(len(as_bytes)):
        result.append(as_bytes[i] ^ key[i])

    print(result)

    clear_text = ""
    for i, c in enumerate(result):
        clear_text += chr(c ^ key[i])

    print(clear_text)

    message = "Hej hopp i Lingonskogen"
    byte_message = message.encode()
    hex_message = binascii.hexlify(byte_message).decode()
    print(hex_message)

if __name__ == '__main__':
    main()
