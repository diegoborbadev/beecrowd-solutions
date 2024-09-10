while True:
    try:
        if(len(input()) >= 10):
           print("palavrao")
        else:
            print("palavrinha")
    except EOFError:
        break