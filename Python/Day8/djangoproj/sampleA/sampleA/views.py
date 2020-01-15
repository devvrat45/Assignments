from django.http import HttpResponse
from django.shortcuts import render

def niit(requests):
    return HttpResponse('You are home')
def home(requests):
    return render(requests,'home.html',{'city':'Hyderabad','company':'Deloitte'})

def count(request):
    data=request.GET['fulltext']
    listw =data.split()
    wordict={}
    for word in listw:
        if word in wordict:
            wordict[word]+=1
        else:
            wordict[word]=1
            lista = {word: num for word,num in sorted(wordict.items(), key=lambda item: item[1])}

    return render(request,'count.html',{'dataone':data,'len':len(listw),'wordict':wordict.items(), 'lista':lista})
