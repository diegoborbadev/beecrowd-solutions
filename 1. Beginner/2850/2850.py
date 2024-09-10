dic = {
    "esquerda": "ingles",
    "direita": "frances",
    "nenhuma": "portugues",
    "as duas": "caiu"
}
while True:
    try:
        print(dic[input()])
    except EOFError:
        break