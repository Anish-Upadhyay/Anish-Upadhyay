# calculator of bomb caloriemeter
while True :
    W = float(input("amount of water: "))
    w = float(input("water equivalent: "))
    x = float(input("heat released: "))
    T1 = float(input("initial temperature: "))
    T2 = float(input("final temperature: "))
    h = float(input("amount of hydrogen: "))
    CC = float(input("Cooling correction: "))
    FWC = float(input("Fuse wire correction: "))
    CTC = float(input("Cotton thread correction: "))
    AC = float(input("Acid correction: "))
    print("HCV = ", (W+w)*(T2-T1 + CC)-(FWC+CTC+AC) / x)
    HCV = (W+w)*(T2-T1 + CC)-(FWC+CTC+AC) / x
    print("LCV = ", HCV - 0.09*h*587)
    next = input("do you want to continue (yes/no): ")
    if next == "no" :
        break