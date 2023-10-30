str = (input('Enter a String : ')).lower()
l = len(str)

for i in range(l):
    j = i
    m = 0
    while m<l:
        if m%2 == 0 :
            print(chr(ord(str[j]) - 32),end=" ")
        else:
            print(str[j],end=" ")
        m += 1
        j = (j+1)%l
    print()

''' OUTPUT: A b C d
            B c D a
            C d A b
            D a B c'''
