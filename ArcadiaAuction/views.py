from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.

def home(request):
    return render(request, 'home.html', {'name': 'nishant123'})
def add(request):
    val1 = int(request.POST['Player1'])
    val2 = int(request.POST['Player2'])
    result = val1 + val2
    return render(request, 'results.html', {"result" : result})