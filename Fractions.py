def euclide (a1,b1):
    a = abs(a1)
    b = abs(b1)
    while a != b:
        if a > b:
            a -= b
        else:
            b -= a
    c = int(max(a,b))
    return c
    
def comb (f1,f2):
    z = f2
    y = f1 % z
    x = f1 // f2
    if (f1*f2 < 0):
        print('-', end = " ")
    if (x!=0):
        print(abs(x), end = " ")
    if (y!=0):
        print(y,'/',z, end = " ")
    if (x==0) and (y==0):
        print('0', end = " ")
    print()
    
frac1 = [0, 0]
frac2 = [0, 0]
frac3 = [0, 0]
print ('Введите числитель и знаменатель первой и затем второй дроби')
frac1[0] = int(input())
frac1[1] = int(input())
frac2[0] = int(input())
frac2[1] = int(input())
frac3[0] = frac1[0] * frac2[1] + frac1[1] * frac2[0]
frac3[1] = frac1[1] * frac2[1]
nod = int(euclide(frac3[0],frac3[1]))
frac3[0] = frac3[0] // nod
frac3[1] = frac3[1] // nod
print('sum =', frac3[0], '/', frac3[1], '=', end = " ")
comb(frac3[0], frac3[1])
frac3[0] = frac1[0] * frac2[1] - frac1[1] * frac2[0]
frac3[1] = frac1[1] * frac2[1]
nod = int(euclide(frac3[0],frac3[1]))
frac3[0] = frac3[0] // nod
frac3[1] = frac3[1] // nod
print('sub =', frac3[0], '/', frac3[1], '=', end = " ")
comb(frac3[0], frac3[1])
frac3[0] = frac1[0] * frac2[0]
frac3[1] = frac1[1] * frac2[1]
nod = int(euclide(frac3[0],frac3[1]))
frac3[0] = frac3[0] // nod
frac3[1] = frac3[1] // nod
print('mul =', frac3[0], '/', frac3[1], '=', end = " ")
comb(frac3[0], frac3[1])
frac3[0] = frac1[0] * frac2[1]
frac3[1] = frac1[1] * frac2[0]
nod = int(euclide(frac3[0],frac3[1]))
frac3[0] = frac3[0] // nod
frac3[1] = frac3[1] // nod
print('div =', frac3[0], '/', frac3[1], '=', end = " ")
comb(frac3[0], frac3[1])
