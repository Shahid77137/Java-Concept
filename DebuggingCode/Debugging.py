
# If n is less than 10: Calculate its Square
# Example: 4 => 16
# If n is between 10 and 20: Calculate the factorial of (n-10)
# Example: 15 => 120
# If n is greater than 20: Calculate the sum of all integers between 1 and (n-20)
# Example: 25 => 15

## Bugged Code

# def compute(n):
#     if n < 10:
#         out = n ** 2
#     elif n < 20:
#         out = 1
#         for i in range(1, n-10):  # First bugg is in the range of for loop
#             out *= i
#     else:
#         lim = n - 20              # Second bugg is in taking value of lim
#         out = lim * lim
#         out = out - lim
#         out = out / 2 
#     print(out)


# n = int(input("Enter an integer: "))
# compute(n)

## Debugged Code

def compute(n):
    if n < 10:
        out = n ** 2
    elif n < 20:
        out = 1
        for i in range(1, n - 9):  # Adjusted the range to start from 1 and end at (n - 9)
            out *= i
    else:
        # lim = n - 19             # By Taking correct value of lim we will get required output
        lim = n - 20
        out = lim * lim
        out = out + lim            # By changing opererator '-' to '+' we will get required output
        out = out / 2  
    print(out)

n = int(input("Enter an integer: "))
compute(n)


