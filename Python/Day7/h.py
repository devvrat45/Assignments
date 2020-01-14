listb = [var for var in 'sankranti']
listb
# we are doing list comprehensions
num_list = [x for i in range(17) if x%2==0]
num_list = [x for x in range(17) if x%2==0]
num_list
new_list=[x for x in range(20) for y in range(20) if x%2==0 and y%4==0]
new_list
new_list=[x for x in range(20) for y in range(20) if (x%2==0 and y%4==0)]
new_list
new_list=[x for x in range(20) for y in range(20) if (x%2 == 0 and y%3 == 0)]
new_list
list_a = [1, 2, 3, 4]
list_b = [3, 4, 5, 6]

num = []
num = [x for x in list_a for y in list_b if x==y]
num
num= [(x,y) for x in list_a fot y in list_b ]
num= [(x,y) for x in list_a for y in list_b ]
num
num= [(x,y) for x in list_a for y in list_b if x==y ]
num
%logstart -o
%history -f h.py
