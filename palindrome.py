num = 121
temp = num
rev = 0
while temp > 0:
    dig = temp % 10
    rev = rev * 10 + dig
    temp //= 10
if num == rev:
    print("The number is a palindrome.")    
else:
        print("The number is not a palindrome.")