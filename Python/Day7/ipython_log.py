# IPython log file

listb = [var for var in 'sankranti']
listb
#[Out]# ['s', 'a', 'n', 'k', 'r', 'a', 'n', 't', 'i']
# we are doing list comprehensions
num_list = [x for i in range(17) if x%2==0]
num_list = [x for x in range(17) if x%2==0]
num_list
#[Out]# [0, 2, 4, 6, 8, 10, 12, 14, 16]
new_list=[x for x in range(20) for y in range(20) if x%2==0 and y%4==0]
new_list
#[Out]# [0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 14, 14, 14, 14, 14, 16, 16, 16, 16, 16, 18, 18, 18, 18, 18]
new_list=[x for x in range(20) for y in range(20) if (x%2==0 and y%4==0)]
new_list
#[Out]# [0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 14, 14, 14, 14, 14, 16, 16, 16, 16, 16, 18, 18, 18, 18, 18]
new_list=[x for x in range(20) for y in range(20) if (x%2 == 0 and y%3 == 0)]
new_list
#[Out]# [0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6, 6, 6, 8, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 14, 14, 14, 14, 14, 14, 14, 16, 16, 16, 16, 16, 16, 16, 18, 18, 18, 18, 18, 18, 18]
list_a = [1, 2, 3, 4]
list_b = [3, 4, 5, 6]

num = []
num = [x for x in list_a for y in list_b if x==y]
num
#[Out]# [3, 4]
num= [(x,y) for x in list_a fot y in list_b ]
num= [(x,y) for x in list_a for y in list_b ]
num
#[Out]# [(1, 3), (1, 4), (1, 5), (1, 6), (2, 3), (2, 4), (2, 5), (2, 6), (3, 3), (3, 4), (3, 5), (3, 6), (4, 3), (4, 4), (4, 5), (4, 6)]
num= [(x,y) for x in list_a for y in list_b if x==y ]
num
#[Out]# [(3, 3), (4, 4)]
get_ipython().run_line_magic('history', '-f h.py')
get_ipython().run_line_magic('history', '-f h.py')
get_ipython().run_line_magic('save', 'filename 40-50')
get_ipython().run_line_magic('save', 'filename 40-50')
get_ipython().run_line_magic('lsmagic', '')
#[Out]# Available line magics:
#[Out]# %alias  %alias_magic  %autoawait  %autocall  %automagic  %autosave  %bookmark  %cd  %clear  %cls  %colors  %conda  %config  %connect_info  %copy  %ddir  %debug  %dhist  %dirs  %doctest_mode  %echo  %ed  %edit  %env  %gui  %hist  %history  %killbgscripts  %ldir  %less  %load  %load_ext  %loadpy  %logoff  %logon  %logstart  %logstate  %logstop  %ls  %lsmagic  %macro  %magic  %matplotlib  %mkdir  %more  %notebook  %page  %pastebin  %pdb  %pdef  %pdoc  %pfile  %pinfo  %pinfo2  %pip  %popd  %pprint  %precision  %prun  %psearch  %psource  %pushd  %pwd  %pycat  %pylab  %qtconsole  %quickref  %recall  %rehashx  %reload_ext  %ren  %rep  %rerun  %reset  %reset_selective  %rmdir  %run  %save  %sc  %set_env  %store  %sx  %system  %tb  %time  %timeit  %unalias  %unload_ext  %who  %who_ls  %whos  %xdel  %xmode
#[Out]# 
#[Out]# Available cell magics:
#[Out]# %%!  %%HTML  %%SVG  %%bash  %%capture  %%cmd  %%debug  %%file  %%html  %%javascript  %%js  %%latex  %%markdown  %%perl  %%prun  %%pypy  %%python  %%python2  %%python3  %%ruby  %%script  %%sh  %%svg  %%sx  %%system  %%time  %%timeit  %%writefile
#[Out]# 
#[Out]# Automagic is ON, % prefix IS NOT needed for line magics.
get_ipython().run_line_magic('lsmagic', '')
#[Out]# Available line magics:
#[Out]# %alias  %alias_magic  %autoawait  %autocall  %automagic  %autosave  %bookmark  %cd  %clear  %cls  %colors  %conda  %config  %connect_info  %copy  %ddir  %debug  %dhist  %dirs  %doctest_mode  %echo  %ed  %edit  %env  %gui  %hist  %history  %killbgscripts  %ldir  %less  %load  %load_ext  %loadpy  %logoff  %logon  %logstart  %logstate  %logstop  %ls  %lsmagic  %macro  %magic  %matplotlib  %mkdir  %more  %notebook  %page  %pastebin  %pdb  %pdef  %pdoc  %pfile  %pinfo  %pinfo2  %pip  %popd  %pprint  %precision  %prun  %psearch  %psource  %pushd  %pwd  %pycat  %pylab  %qtconsole  %quickref  %recall  %rehashx  %reload_ext  %ren  %rep  %rerun  %reset  %reset_selective  %rmdir  %run  %save  %sc  %set_env  %store  %sx  %system  %tb  %time  %timeit  %unalias  %unload_ext  %who  %who_ls  %whos  %xdel  %xmode
#[Out]# 
#[Out]# Available cell magics:
#[Out]# %%!  %%HTML  %%SVG  %%bash  %%capture  %%cmd  %%debug  %%file  %%html  %%javascript  %%js  %%latex  %%markdown  %%perl  %%prun  %%pypy  %%python  %%python2  %%python3  %%ruby  %%script  %%sh  %%svg  %%sx  %%system  %%time  %%timeit  %%writefile
#[Out]# 
#[Out]# Automagic is ON, % prefix IS NOT needed for line magics.
get_ipython().run_line_magic('ldir', '')
def sq(arr):
    res = []
    for i in arr:
        res.append(i**2)
    return res
def sqqr(arr):
    return [i**2 for i in arr]
def sq(arr):
    res = []
    for i in arr:
        res.append(i**2)
    return res
def sqqr(arr):
    return [i**2 for i in arr]
get_ipython().run_line_magic('timeit', 'sq(range(1, 11))')
get_ipython().run_line_magic('timeit', 'sq(range(1, 11))')
get_ipython().run_line_magic('timeit', 'sql(range(1, 11))')
get_ipython().run_line_magic('timeit', 'sqqrr(range(1, 11))')
get_ipython().run_line_magic('timeit', 'sqqrr(range(1, 11))')
get_ipython().run_line_magic('timeit', 'sqqr(range(1, 11))')
get_ipython().run_line_magic('timeit', 'sq(range(1, 11))')
