def fun(w, x):
    y = 0
    if (x % w == 0 or w % x == 0):
        y = y + 1
    else:
        y = y + 10
    print(y)

fun(40, 47)

#W=40
#x=47
# Output: 10
# Explanation: 47 is not divisible by 40 and 40 is not divisible by 47, so y is incremented by 10.
# The final value of y is printed, which is 10.
