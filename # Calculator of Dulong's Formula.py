# Calculator of Dulong's Formula
while True :
  c = float(input("percentage of carbon: "))
  h = float(input("percentage of hydrogen: "))
  o = float(input("percentage of oxygen: "))
  s = float(input("percentage of sulphur: "))
  print("HCV : ", 1/100 * (8080 * c + 34500 * (h - o/8) + 2240 * s), "cal/gm")
  print("LCV : ", HCV - 0.09*h*587, "cal/gm")
  next = input("do you want to continue? (yes/no): ")
  if next == no :
      break