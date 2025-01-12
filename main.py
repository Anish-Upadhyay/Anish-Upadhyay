
while True :
    c = float(input("Percentage of carbon: "))
    h = float(input("Percentage of hydrogen: "))
    o = float(input("Percentage of oxygen: "))
    s = float(input("Percentage of sulphur: "))
    a = str("Choose unit: ")
    print("HCV: ", 1/100*(8080*c +34500*(h-(o/8)) +2240*s), a)
    HCV = 1/100*(8080*c + 34500*(h-(o/8)) +2240*s)
    print("LCV: ", HCV - 0.09*h*587, a)
    next = input("Do you want to continue?(yes/no): ")
    if next == "no" :
        print("Program finished")
        break
