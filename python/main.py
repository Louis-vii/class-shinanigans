name = None 
level = 0 
health = 100 
defence = 11



def getname() :
    name = input("what's thy name ") 
    return name 

def getlevel():
   level  = int(input(" what's your level "))
   return level 
    
def gethealth(level):
    health = level * 50 
    return health 

def getdefence(health ,  level ):
    defence = (health / 2  ) * (level * 0.2)
    return defence 

def main ():
   n =  getname()
   print(f"Hello {n} !")
   
   l = getlevel()

   h = gethealth(l)
   
   d =  int(getdefence(h , l ))

   print(f"Your name is {n} your level is {l}\n you have {h} health and {d} defence !! ")

main()