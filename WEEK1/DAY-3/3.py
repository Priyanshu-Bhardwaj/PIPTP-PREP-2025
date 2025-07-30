def fun(a, b):
    if a and b and a + b > 0:
        return a + fun(a - 2, b - 2) + b
    else:
        return a ^ b

print(fun(8, 8))