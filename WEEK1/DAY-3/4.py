a = 3
b = 3
a=b
if (1 ^ 1):
    a = 1
else:
    b = 2
print(a + b)
# Output: 5
# Explanation: The expression (1 ^ 1) evaluates to 0, so the else block is executed, setting b to 2. 
# Since a was set to b (which is 3), the final values are a = 3 and b = 2. 
# The sum a + b is 3 + 2 = 5.
